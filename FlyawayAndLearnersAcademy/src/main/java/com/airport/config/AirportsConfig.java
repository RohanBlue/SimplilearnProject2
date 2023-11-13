package com.airport.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.airport.model.Airports;

public class AirportsConfig {
private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory ==null) {
			
			try {
				
				Configuration config=new Configuration();
				Properties settings=new Properties();
				settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL,"jdbc:mysql://localhost:3306/Airlines?useSSL=false");
				settings.put(Environment.USER,"root");
				settings.put(Environment.PASS,"root");
				settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.SHOW_SQL,"true");
				settings.put(Environment.HBM2DDL_AUTO,"update");
				
				config.setProperties(settings);
				config.addAnnotatedClass(Airports.class);
				//config.addAnnotatedClass(Employee.class);
				
				ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings (config.getProperties()).build();
				
				System.out.println("Hibernate java config serviceRegistry created");
				sessionFactory=(SessionFactory) config.buildSessionFactory(serviceRegistry);
			} 
			
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return sessionFactory;
	}


}
