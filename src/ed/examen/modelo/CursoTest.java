package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {
	
	Persona p = new Persona("12345678A", "Luis", "Doblas");
	Curso c = new Curso();

	@Test
	void testEliminarAlumno() {
		try {
			p.setDni("12345678A");
			assertEquals("12345678A",p.getDni());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testAniadirAlumno() {
		int i = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int j = c.numeroAlumnos();
		
		assertEquals(i+1,j);
	}

	@Test
	void testEstaRegistrado() {
		Boolean encontrado = c.estaRegistrado("12345678B");
		assertFalse(encontrado);
		assertEquals(false,c.estaRegistrado("12345678B"));
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
