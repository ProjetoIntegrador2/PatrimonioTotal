package dao;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author aaoliveira
 * @param <P>
 */
public class Dao<P> {
    private static final Logger logger = Logger.getLogger(Dao.class);
    private final Class persistentClass;
    private final Session session;
    
    protected Dao(Session session, Class persistentClass) {
        this.session = session;
        this.persistentClass = persistentClass;
    }
    
    public P recuperarPorId(int id) {
        logger.info("getting " + persistentClass + " with id " + id);
        return (P) session.get(persistentClass, id);
    }
    
    public List<P> recuperarTodos() {
        logger.info("getting all " + persistentClass);
        Criteria c = session.createCriteria(persistentClass);        
        return c.list();
    }
    
    public void inserir(P t) {
        logger.info("saving " + t);
        session.save(t);
    }
    
    public void atualizar(P t) {
        logger.info("updating " + t);
        session.update(t);
    }
    
    public void excluir(P t) {
        logger.info("deleting " + t);
        session.delete(t);
    }
    
    public static <P> Dao<P> criarInstancia(Session session, Class<P> c) {
        return new Dao<>(session, c);
    }
    
    protected Session getSession() {
        return session;
    }
        
}