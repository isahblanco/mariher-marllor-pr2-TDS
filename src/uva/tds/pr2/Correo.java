package uva.tds.pr2;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 * Implementacion de un correo
 * 
 * @author mariher
 * @author marllor
 */
public class Correo {
	/**
	 * Constructor objeto correo
	 * 
	 * @param origen    email de origen
	 * @param destino   email de destino
	 * @param hora      hora de envío
	 * @param dia       día de envío
	 * @param Asunto    Asunto del correo
	 * @param Contenido Contenido del correo
	 * @param categoria categoría del mensaje
	 * @throws IllegalArgumentException En caso de correo erróneo ; de un asunto
	 *                                  vacío o con más de 10 palabras; o en caso de
	 *                                  que la hora o el día sean null
	 */
	public Correo(String origen, String destino, LocalTime hora, LocalDate dia, String Asunto, String Contenido,
			EnumCategoria categoria) {
		// TODO Auto-generated method stub
	}

	/**
	 * Devuelve el email de origen del correo
	 * 
	 * @return email de origen
	 */
	public Object getOrigen() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve el email de destino del correo
	 * 
	 * @return email de destino
	 */
	public Object getDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve el asunto del correo
	 * 
	 * @return asunto del correo
	 */
	public Object getAsunto() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve la hora del correo
	 * 
	 * @return hora del correo
	 */
	public Object getHora() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devueve la fecha del correo
	 * 
	 * @return fecha del correo
	 */
	public Object getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve el contenido del correo
	 * 
	 * @return contenido del correo
	 */
	public Object getContenido() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve la categoria del correo
	 * 
	 * @return categoria del correo
	 */
	public Object getCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Compara dos correos y define si el comparado es posterior, anterior, o igual
	 * al objeto
	 * 
	 * @param correo2 correo con el que comparar
	 * @return posterior si se envió mas tarde, anterior si se envió antes,igual si
	 *         se envió en el mismo momento
	 * @throws IllegalArgumentException si el correo a comparar es null
	 */
	public Object comparaTiempo(Correo correo2) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Compara dos correos y define si estos son iguales en base a unos criterios
	 * (fecha,hora,asunto y categoría)
	 * 
	 * @param correo2 correo con el que comparar
	 * @return true si son iguales, false si no
	 * @throws IllegalArgumentException si el correo a comparar es null
	 */
	public Boolean comparaIgual(Correo correo2) {
		// TODO Auto-generated method stub
		return false;
	}

}