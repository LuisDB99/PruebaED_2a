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
		fail("Not yet implemented");
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
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
