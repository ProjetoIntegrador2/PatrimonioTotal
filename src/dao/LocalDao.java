package dao;

import Util.HibernateUtil;
import java.util.List;
import model.LocalModelo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Paulo
 */
public class LocalDao extends GenericDao{
    
    
    
    public void salvar(LocalModelo local){
        insert(local);
    }
    
    public void remover(LocalModelo local){
        delete(local);
    }
    
    public void editar(LocalModelo local){
        update(local);
    }
    
    public List<LocalModelo> buscarContato(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Criteria c = s.createCriteria(LocalModelo.class);
        try{
            return c.list();
        }finally{
            s.close();
        }
    }
    
    public List<LocalModelo> buscarPorNome(String descricao){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Criteria c = s.createCriteria(LocalModelo.class);
        
        try {
            c.add(Restrictions.like("Local_Descricao", descricao ,MatchMode.ANYWHERE));
            return c.list();
        } finally {
            s.close();
        }
    }
    
}
