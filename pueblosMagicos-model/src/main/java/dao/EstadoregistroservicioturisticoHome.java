package dao;
// Generated 30/08/2016 02:56:52 PM by Hibernate Tools 5.1.0.Beta1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import dto.Estadoregistroservicioturistico;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Estadoregistroservicioturistico.
 * @see dao.Estadoregistroservicioturistico
 * @author Hibernate Tools
 */
public class EstadoregistroservicioturisticoHome {

	private static final Log log = LogFactory.getLog(EstadoregistroservicioturisticoHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Estadoregistroservicioturistico transientInstance) {
		log.debug("persisting Estadoregistroservicioturistico instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Estadoregistroservicioturistico instance) {
		log.debug("attaching dirty Estadoregistroservicioturistico instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Estadoregistroservicioturistico instance) {
		log.debug("attaching clean Estadoregistroservicioturistico instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Estadoregistroservicioturistico persistentInstance) {
		log.debug("deleting Estadoregistroservicioturistico instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Estadoregistroservicioturistico merge(Estadoregistroservicioturistico detachedInstance) {
		log.debug("merging Estadoregistroservicioturistico instance");
		try {
			Estadoregistroservicioturistico result = (Estadoregistroservicioturistico) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Estadoregistroservicioturistico findById(java.lang.Integer id) {
		log.debug("getting Estadoregistroservicioturistico instance with id: " + id);
		try {
			Estadoregistroservicioturistico instance = (Estadoregistroservicioturistico) sessionFactory
					.getCurrentSession().get("dao.Estadoregistroservicioturistico", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Estadoregistroservicioturistico> findByExample(Estadoregistroservicioturistico instance) {
		log.debug("finding Estadoregistroservicioturistico instance by example");
		try {
			List<Estadoregistroservicioturistico> results = (List<Estadoregistroservicioturistico>) sessionFactory
					.getCurrentSession().createCriteria("dao.Estadoregistroservicioturistico").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}