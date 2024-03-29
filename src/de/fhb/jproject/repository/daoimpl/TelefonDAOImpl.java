/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */


package de.fhb.jproject.repository.daoimpl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import de.fhb.jproject.data.*;

/**
 * 
 * @author MacYser
 */
public class TelefonDAOImpl implements de.fhb.jproject.repository.dao.TelefonDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(TelefonDAOImpl.class);
	/**
	 * 
	 * @param telNumber
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByORMID(String telNumber) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return loadTelefonByORMID(session, telNumber);
		}
		catch (Exception e) {
			_logger.error("loadTelefonByORMID(String telNumber)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telNumber
	 * @return
	 * @throws PersistentException
	 */
	public Telefon getTelefonByORMID(String telNumber) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return getTelefonByORMID(session, telNumber);
		}
		catch (Exception e) {
			_logger.error("getTelefonByORMID(String telNumber)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telNumber
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByORMID(String telNumber, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return loadTelefonByORMID(session, telNumber, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTelefonByORMID(String telNumber, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telNumber
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon getTelefonByORMID(String telNumber, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return getTelefonByORMID(session, telNumber, lockMode);
		}
		catch (Exception e) {
			_logger.error("getTelefonByORMID(String telNumber, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param telNumber
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByORMID(PersistentSession session, String telNumber) throws PersistentException {
		try {
			return (Telefon) session.load(de.fhb.jproject.data.Telefon.class, telNumber);
		}
		catch (Exception e) {
			_logger.error("loadTelefonByORMID(PersistentSession session, String telNumber)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param telNumber
	 * @return
	 * @throws PersistentException
	 */
	public Telefon getTelefonByORMID(PersistentSession session, String telNumber) throws PersistentException {
		try {
			return (Telefon) session.get(de.fhb.jproject.data.Telefon.class, telNumber);
		}
		catch (Exception e) {
			_logger.error("getTelefonByORMID(PersistentSession session, String telNumber)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param telNumber
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByORMID(PersistentSession session, String telNumber, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Telefon) session.load(de.fhb.jproject.data.Telefon.class, telNumber, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTelefonByORMID(PersistentSession session, String telNumber, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param telNumber
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon getTelefonByORMID(PersistentSession session, String telNumber, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Telefon) session.get(de.fhb.jproject.data.Telefon.class, telNumber, lockMode);
		}
		catch (Exception e) {
			_logger.error("getTelefonByORMID(PersistentSession session, String telNumber, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param condition
	 * @param orderBy
	 * @return
	 * @throws PersistentException
	 */
	public Telefon[] listTelefonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return listTelefonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listTelefonByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param condition
	 * @param orderBy
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon[] listTelefonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return listTelefonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listTelefonByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param condition
	 * @param orderBy
	 * @return
	 * @throws PersistentException
	 */
	public Telefon[] listTelefonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.fhb.jproject.data.Telefon as Telefon");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Telefon[]) list.toArray(new Telefon[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTelefonByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param condition
	 * @param orderBy
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon[] listTelefonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.fhb.jproject.data.Telefon as Telefon");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Telefon[]) list.toArray(new Telefon[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTelefonByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param condition
	 * @param orderBy
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return loadTelefonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadTelefonByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param condition
	 * @param orderBy
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return loadTelefonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTelefonByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param condition
	 * @param orderBy
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Telefon[] telefons = listTelefonByQuery(session, condition, orderBy);
		if (telefons != null && telefons.length > 0)
			return telefons[0];
		else
			return null;
	}
	
	/**
	 * 
	 * @param session
	 * @param condition
	 * @param orderBy
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public Telefon loadTelefonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Telefon[] telefons = listTelefonByQuery(session, condition, orderBy, lockMode);
		if (telefons != null && telefons.length > 0)
			return telefons[0];
		else
			return null;
	}
	
	/**
	 * 
	 * @param condition
	 * @param orderBy
	 * @return
	 * @throws PersistentException
	 */
	public static java.util.Iterator iterateTelefonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return iterateTelefonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateTelefonByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param condition
	 * @param orderBy
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public static java.util.Iterator iterateTelefonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.fhb.jproject.data.JProjectPersistentManager.instance().getSession();
			return iterateTelefonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateTelefonByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param condition
	 * @param orderBy
	 * @return
	 * @throws PersistentException
	 */
	public static java.util.Iterator iterateTelefonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.fhb.jproject.data.Telefon as Telefon");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateTelefonByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param session
	 * @param condition
	 * @param orderBy
	 * @param lockMode
	 * @return
	 * @throws PersistentException
	 */
	public static java.util.Iterator iterateTelefonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.fhb.jproject.data.Telefon as Telefon");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateTelefonByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Telefon createTelefon() {
		return new de.fhb.jproject.data.Telefon();
	}
	
	/**
	 * 
	 * @param telefon
	 * @return
	 * @throws PersistentException
	 */
	public boolean save(de.fhb.jproject.data.Telefon telefon) throws PersistentException {
		try {
			de.fhb.jproject.data.JProjectPersistentManager.instance().saveObject(telefon);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(de.fhb.jproject.data.Telefon telefon)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telefon
	 * @return
	 * @throws PersistentException
	 */
	public boolean delete(de.fhb.jproject.data.Telefon telefon) throws PersistentException {
		try {
			de.fhb.jproject.data.JProjectPersistentManager.instance().deleteObject(telefon);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(de.fhb.jproject.data.Telefon telefon)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telefon
	 * @return
	 * @throws PersistentException
	 */
	public boolean deleteAndDissociate(de.fhb.jproject.data.Telefon telefon)throws PersistentException {
		try {
			if(telefon.getUserLoginName() != null) {
				telefon.getUserLoginName().telefon.remove(telefon);
			}
			
			return delete(telefon);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telefon
	 * @param session
	 * @return
	 * @throws PersistentException
	 */
	public boolean deleteAndDissociate(de.fhb.jproject.data.Telefon telefon, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(telefon.getUserLoginName() != null) {
				telefon.getUserLoginName().telefon.remove(telefon);
			}
			
			try {
				session.delete(telefon);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telefon
	 * @return
	 * @throws PersistentException
	 */
	public boolean refresh(de.fhb.jproject.data.Telefon telefon) throws PersistentException {
		try {
			de.fhb.jproject.data.JProjectPersistentManager.instance().getSession().refresh(telefon);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(de.fhb.jproject.data.Telefon telefon)", e);
			throw new PersistentException(e);
		}
	}
	
	/**
	 * 
	 * @param telefon
	 * @return
	 * @throws PersistentException
	 */
	public boolean evict(de.fhb.jproject.data.Telefon telefon) throws PersistentException {
		try {
			de.fhb.jproject.data.JProjectPersistentManager.instance().getSession().evict(telefon);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(de.fhb.jproject.data.Telefon telefon)", e);
			throw new PersistentException(e);
		}
	}
	
}
