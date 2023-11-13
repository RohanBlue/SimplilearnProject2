package com.airport.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.airport.config.AirportsConfig;
import com.airport.model.Airports;


public class AirportsService {
	private SessionFactory sf=null;

	public AirportsService() {

		sf=AirportsConfig.getSessionFactory();
}
	public void addAirports(Airports air) {
		
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(air);
		trans.commit();
		session.close();
		
	}
//public List<Airports> showAll(){
		
	//	Session session=sf.openSession();
		//TypedQuery qry=session.createQuery("from Airports");
		//List<Airports> aall=qry.getResultList();
		//return aall;
		
	//}

}
