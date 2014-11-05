package dao;

import model.LocalModelo;
import Util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class GenericDao {
    
/*  private LocalModelo modelo;
  
    public LocalModelo getModelo() {
        return modelo;
    }
  
    public void setModelo(LocalModelo modelo) {
        this.modelo = modelo;
    }
*/    
    
    public void delete(Object objeto){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        try {
            s.delete(objeto);
            tx.commit();
        }catch (Exception e) {
            tx.rollback();
        }
        s.close();
    }
    
        
    public void insert(Object objeto){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        try {
            s.save(objeto);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            tx.rollback();
        }
        s.close();
    }
    
    public void update(Object objeto){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        try {
            s.merge(objeto);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
        s.close();
    }
}