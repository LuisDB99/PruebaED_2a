package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p = new Persona("12345678A", "Luis", "Doblas");

	@Test
	void testPersonaStringStringString() {
		assertEquals("12345678A", p.getDni());
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
		p.setNombre("Alvaro");;
		assertEquals("Alvaro",p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("Doblas",p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Banuelos");
		assertEquals("Banuelos",p.getApellido1());
	}

}
