package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p = new Persona("12345678A", "Luis", "Doblas");

	@Test
	void testPersonaStringStringString() {
		assertEquals("12345678A", "Luis", "Doblas");
	}

	@Test
	void testGetDni() {
		assertEquals("12345678A",p.getDni());
	}

	@Test
	void testSetDni() {
		try {
			p.setDni("12345678A");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertEquals("12345678A",p.getDni());
		}
	}

	@Test
	void testGetNombre() {
		assertEquals("Luis",p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Luis");;
		assertEquals("Luis",p.getNombre());
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
