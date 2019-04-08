package ejercicio04_GestionEntidadCocheManejadaPorJPA.modelo.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ejercicio04_GestionEntidadCocheManejadaPorJPA.modelo.Fabricante;


public class ControladorBBDDFabricante extends Controlador {

	
	
	/**
	 * 
	 */
	public static List<Fabricante> findAll () {
		
		EntityManager em = getEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM fabricante;", Fabricante.class);
		
		List<Fabricante> entidades = new ArrayList<Fabricante>(); 
		
		try {
			entidades = (List<Fabricante>) q.getResultList();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		em.close();
		return entidades;
	}
	
}
