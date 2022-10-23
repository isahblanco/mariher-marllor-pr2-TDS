package uva.tds.pr2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Implementacion de un gestor de correo
 * @author mariher
 * @author marllor
 */
public class Gestor {
	
	/**
	 * Inicialización del gestor
	 */
	public Gestor() {
		
	}
	
	/**
	 * Inicialización del gestor con una lista de correos
	 * @param listaCorreos Lista de correos del gestor
	 * @throws IllegalArgumentException si la lista es null
	 */
	public Gestor(ArrayList<Correo> listaCorreos) {

	}

	/**
	 * Añade un nuevo correo al gestor
	 * @param c Correo que se añade
	 * @throws IllegalArgumentException si el correo es null
	 * @throws IllegalArgumentException si el correo ya está en el gestor
	 * @throws IllegalArgumentException si el correo está repetido, es igual otro
	 */
	public void addCorreo(Correo c) {
		
	}
	
	/**
	 * Comprueba si un correo está o no en el gestor
	 * @return true si está, false si no
	 * @throws IllegalArgumentException si el correo es null
	 */
	protected boolean inGestor(Correo c) {
		return false;
	}
	
	/**
	 * Devuelve el numero de correos que hay en el gestor
	 * @return numero de correos
	 */
	public int getNumCorreos() {
		return -1;
	}
	
	/**
	 * Devuelve la fecha del correo más reciente
	 * @return fecha del correo más reciente
	 */
	public LocalDate getFechaMasReciente() {
		return null;
	}
	
	/**
	 * Devuelve la fecha del correo más antiguo
	 * @return fecha del correo más antiguo
	 */
	public LocalDate getFechaMasAntigua() {
		return null;
	}
	
	/**
	 * Devuelve la lista de correos en orden cronológico,
	 * de anterior a posterior
	 * @return lista de correos en orden cronológico
	 */
	public ArrayList<Correo> getOrdenCornologico() {
		return null;
	}
	
	/**
	 * Devuelve la lista de correos por orden de categoría,
	 * en orden de enviado, recibido, borrador y papelera
	 * @return lista de correos por orden de categoría
	 */
	public ArrayList<Correo> getOrdenCategoria() {
		return null;
	}
	
	/**
	 * Devuelve un gestor con la lista de correos publicados en una fecha concreta
	 * @param fecha Fecha de los correos que habrá en la lista
	 * @return gestor con los correos que haya de esa fecha
	 * @throws IllegalArgumentException si la fecha es null
	 */
	public Gestor getGestorCorreosPorFecha(LocalDate fecha) {
		return null;
	}
	
	/**
	 * Devuelve un gestor con la lista de correos publicados dentro de un intervalo de fechas
	 * @param fecha1 Fecha mínima del intervalo
	 * @param fecha2 Fecha máxima del intervalo
	 * @return gestor con los correos publicados dentro del intervalo de fechas
	 * @throws IllegalArgumentException si alguna de las fechas es null
	 */
	public Gestor getGestorCorreosEntreFechas(LocalDate fecha1, LocalDate fecha2) {
		return null;
	}
	
	/**
	 * Devuelve un gestor con la lista de correos publicados de una categoria dada
	 * @param categoria Categoria de los correos de la lista
	 * @return gestor con los correos publicados de la categoria especificada
	 * @throws IllegalArgumentException si la categoria es null
	 */
	public Gestor getGestorCorreosPorCategoria(EnumCategoria categoria) {
		return null;
	}
	
	/**
	 * Devuelve un gestor con la lista de correos publicados de una categoría y fecha dada
	 * @param categoria Categoría de los correos a estar en la lista
	 * @param fecha Fecha de los correos a estar en la lista
	 * @return gestor con los correos publicados de esa categoría y fecha
	 * @throws IllegalArgumentException si la categoria es null
	 * @throws IllegalArgumentException si la fecha es null
	 */
	public Gestor getGestorCorreosPorCategoriaYFecha(EnumCategoria categoria, LocalDate fecha) {
		return null;
	}
	
	/**
	 * Devuelve un gestor con la lista de correos publicados de una categoría e intervalo de fechas dados
	 * @param categoria Categoría de los correos a estar en la lista
	 * @param fecha1 Fecha mínima del intervalo
	 * @param fecha2 Fecha máxima del intervalo
	 * @return gestor con los correos publicados de esa categoría y dentro del intervalo de fechas dado
	 * @throws IllegalArgumentException si la categoria es null
	 * @throws IllegalArgumentException si alguna de las fechas es null
	 */
	public Gestor getGestorCorreosPorCategoriaEntreFechas(EnumCategoria categoria, LocalDate fecha1, LocalDate fecha2) {
		return null;
	}
	
	/**
	 * Devuelve la lista de correos del gestor
	 * @return lista de correos del gestor
	 */
	public ArrayList<Correo> getCorreos() {
		return null;
	}
}
