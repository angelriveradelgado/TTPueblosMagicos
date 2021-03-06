package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.FloatType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.Atractivoturistico;
import dto.Calificacionatractivoturistico;
import dto.Calificacionpueblomagico;
import dto.Pueblomagico;

@Repository
public class PueblomagicoDAO {

	private static final Log log = LogFactory.getLog(PueblomagicoDAO.class);
	
	
	  /*private final SessionFactory sessionFactory = getSessionFactory();
	  
	  protected SessionFactory getSessionFactory() { try { SessionFactory
	  sessionFactory = new Configuration().configure( "hibernate.cfg.xml")
	  .buildSessionFactory(); return sessionFactory; } catch (Exception e) {
	  log.error("Initial SessionFactory creation failed." + e); throw new
	  IllegalStateException("Initial Session Factory creation failed."); } }*/
	 

	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}

	public boolean create(Pueblomagico transientInstance) {
		log.debug("creating Pueblomagico instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		boolean conf = false; 
		try {
			tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();
			conf = true;
			log.debug("persist successful");
		} catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback();
		}
		session.close();
		return conf;
	}
	
	public Pueblomagico read(Integer id) {
		log.debug("reading Pueblomagico instance");
		Pueblomagico u = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			u = (Pueblomagico)session.get(Pueblomagico.class, id);
			tx.commit();
			log.debug("persist successful");
		} catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback();
		}
		session.close();
		return u;
	}
	
	public List<Pueblomagico> readAll() 
	{
		List<Pueblomagico> result = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try 
		{
			tx = session.beginTransaction();
			result = session.createCriteria(Pueblomagico.class).addOrder(Order.asc("nombre")).list();
			tx.commit();
		} catch (HibernateException e) 
		{
			if (tx!=null) 
				tx.rollback();
		}
		session.close();
		return result;
	}

	public boolean update(Pueblomagico transientInstance) {
		log.debug("updating Pueblomagico instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		boolean conf = false; 
		try {
			tx = session.beginTransaction();
			session.update(transientInstance);
			tx.commit();
			conf = true;
			log.debug("persist successful");
		} catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback();
		}
		session.close();
		return conf;
	}

	public boolean delete(Pueblomagico transientInstance) {
		log.debug("deleting Pueblomagico instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		boolean conf = false;
		try {
			tx = session.beginTransaction();
			session.delete(transientInstance);
			tx.commit();
			conf = true;
			log.debug("persist successful");
		} catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback();
			e.printStackTrace();
			log.debug("persist error");
		}
		session.close();
		return conf;
	}


	public Pueblomagico findById(Integer id) {
		log.debug("getting Pueblomagico instance with id: " + id);
		Pueblomagico u = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			 u = (Pueblomagico) session.get(Pueblomagico.class, id);
			tx.commit();
			if (u == null) 
			{
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
		} catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback();
		}
		session.close();
		return u;
	}

	public Pueblomagico findByNombrePueblomagico(String n) {
		log.debug("finding Pueblomagico instance by example");
		Session session = sessionFactory.openSession();
		List<Pueblomagico> results = null;
		Pueblomagico result = null;
		try {
			results = session.createCriteria(Pueblomagico.class).add( Restrictions.like("nombre", n) ).list();		
			result = results.get(0);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		session.close();
		return result;
	}
	
	public List<Pueblomagico> getPueblomagicoByLimit(Integer first, Integer numRegistros) 
	{
		log.debug("finding Pueblomagico instance by example");
		List<Pueblomagico> results = null;
		Session session = sessionFactory.openSession();
		try {
			Criteria crit;
			crit = session.createCriteria(Pueblomagico.class);
			crit.setFirstResult(first);
			crit.setMaxResults(numRegistros);
			crit.addOrder(Order.asc("nombre"));
			results = crit.list();			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		session.close();
		return results;
	}
	
	
	public List<Pueblomagico> findByIdEstado(Integer id) 
	{
		List<Pueblomagico> result = null;
		Session session = sessionFactory.openSession();
		try 
		{
			Query q = session.createSQLQuery("select pm.idPuebloMagico, pm.nombre, pm.latitud, pm.longitud, pm.descripcion, "
				+ " pm.epm_IdestadoPuebloMagico as epmIdestadoPuebloMagico, pm.m_idMunicipio as MIdMunicipio, pm.promedio"
				+ " from pueblomagico pm, municipio m, estado e "
				+ "where pm.m_idMunicipio=m.idMunicipio and m.e_idEstado=e.idEstado and e.idEstado=:idE")
				.addScalar("idPuebloMagico", new IntegerType())
				.addScalar("nombre", new StringType())
				.addScalar("latitud", new DoubleType())
				.addScalar("longitud", new DoubleType())
				.addScalar("descripcion", new StringType())
				.addScalar("epmIdestadoPuebloMagico", new IntegerType())
				.addScalar("MIdMunicipio", new IntegerType())	
				.addScalar("promedio", new FloatType())		
				.setResultTransformer(Transformers.aliasToBean(Pueblomagico.class))
				.setParameter("idE", id);
			result = q.list();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		session.close();
		return result;
	}
	
	public void updatePromedio( int idPuebloMagico )
	{
		log.debug("updating promedio atractivo");
		List<Integer> promedios = null;
		Session session = sessionFactory.openSession();
		try {
			Criteria crit;
			crit = session.createCriteria(Calificacionpueblomagico.class)
					.setProjection(Projections.property("calificacion")).
					add(Restrictions.like("pmIdPuebloMagico", idPuebloMagico));
			promedios = crit.list();		
			
			float suma = 0;
			for(Integer c : promedios)
			{
				suma = suma + c;
			}
			float promedio = suma / promedios.size();
			
			Pueblomagico pm = new Pueblomagico();
			pm = this.read(idPuebloMagico);
			pm.setPromedio(promedio);
			this.update(pm);
			
			
		} catch (RuntimeException re) 
		{
			log.error("update cal aT error", re);
			re.printStackTrace();
		}
		session.close();
	}
	
//	public static void main(String args[])
//	{
//		PueblomagicoDAO pDAO = new PueblomagicoDAO();
//		
//		Pueblomagico p = new Pueblomagico();
//		p.setIdPuebloMagico(60);
//		p.setNombre("prueba");
//		pDAO.delete(p);
//		
//	}
	
	
}
