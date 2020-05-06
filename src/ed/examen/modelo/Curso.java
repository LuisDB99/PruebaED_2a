package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luis
 * @version 0.1, 03/05/2020 
 */

public class Curso {
	
	private List<Persona> listaAlumnos;

	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * 
	 * @param dni
	 * @throws Exception, devuelve un error si el dni introducciodo 
	 * no tiene la longitud que le damos en el if.
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * 
	 * @param p
	 * Añadde un alumno al arraylist listaAlumnos.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * 
	 * @param dni
	 * @return, devuelve true si el alumno esta en el arrayList y false
	 * si no esta.
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Crea un array de Persona
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
