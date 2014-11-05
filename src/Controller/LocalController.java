package Controller;

import dao.LocalDao;
import model.LocalModelo;

public class LocalController {   
    LocalModelo local;
    LocalDao dao = new LocalDao();
    
    public void salvarLocal(String descricao) {
        local = new LocalModelo();
        local.setNome(descricao);
        dao.salvar(local);
    }
    
    public void excluir(int id){
        dao.remover(local);
    }
    
    public List<LocalModelo> buscarTodosModelos(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
    }
}