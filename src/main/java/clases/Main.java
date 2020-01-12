package clases;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;


public class Main {
	private static Session session = HibernateUtil.getSessionFactory().openSession();

	public static <T>ArrayList<T> getInstances(Class<T> classType) {
		Query q = session.createQuery("FROM " + classType.getName());
		return (ArrayList<T>) q.list();
	}

	public static void main(String[] args) {
		System.out.println("CLASES DEL PASAJE:");
		for(Pasaje p : getInstances(Pasaje.class)) {
			System.out.println("Clase pasaje: " + p.getClase());
		}
		System.out.println("////////////////////////////////////////////////");
		System.out.println("NOM DELS PASAJEROS: ");
		for(Pasajero p : getInstances(Pasajero.class)) {
			System.out.println("Nom pasajero: " + p.getNombre());
		}
	}
}
