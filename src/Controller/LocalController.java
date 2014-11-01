/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import dao.Dao;
import dao.HibernateUtil;
import model.Local;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@SessionScoped
public class LocalController implements Serializable {
    private List<Local> locais;
    private Local localCorrente;
    private final Session hibernateSession;
    
    public LocalController() {
        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        atualizaLocais(hibernateSession);
        localCorrente = new Local();
    }
    
    public String executarAcaoMenu(String acao) {
        return acao;
    }
    
    private void atualizaLocais(Session hibernateSession) {
        Dao<Local> daoLocal = Dao.criarInstancia(hibernateSession, Local.class);
        locais = daoLocal.recuperarTodos();
    }
    
    public List<Local> getLocais() {
        return locais;
    }
    
    public Local getLocalCorrente() {
        return localCorrente;
    }
    
    public String salvaInsercao() {
        Dao<Local> daoLocal = Dao.criarInstancia(hibernateSession, Local.class);
        Transaction t = hibernateSession.getTransaction();
        t.begin();
        daoLocal.inserir(localCorrente);
        t.commit();
        atualizaLocais(hibernateSession);
        return "listaClientes";
    }
    
    public String salvaAlteracao() {
        Dao<Local> daoCliente = Dao.criarInstancia(hibernateSession, Local.class);
        Transaction t = hibernateSession.getTransaction();
        t.begin();
        daoCliente.atualizar(localCorrente);
        t.commit();
        atualizaLocais(hibernateSession);
        return "listaClientes";
    }
    public void excluirCliente(Local local) {
        Dao<Local> daoCliente = Dao.criarInstancia(hibernateSession, Local.class);
        Transaction t = hibernateSession.getTransaction();
        t.begin();
        daoCliente.excluir(local);
        t.commit();
        atualizaLocais(hibernateSession);
    }
    
    public String voltarLista() {
        return "listaClientes";
    }
    
    public String inserirLocal() {
        localCorrente = new Local();
        return "inserelocal";
    }
    
    public String alterarCliente(Local local) {
        localCorrente = local;
        return "alteraCliente";
    }
    
}
