package ejercicio04_GestionEntidadCocheManejadaPorJPA.modelo.controladores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controlador {

	private static EntityManagerFactory entityManagerFactory = null;
	
	/**
	 * 
	 * @return
	 */
	protected static EntityManager getEntityManager () {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
		}
		return entityManagerFactory.createEntityManager();
	}
}
