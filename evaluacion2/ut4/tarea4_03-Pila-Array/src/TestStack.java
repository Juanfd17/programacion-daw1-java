

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
class TestStack {

	@Test
	void test() {
		Stack pila = new Stack(3);

		// Al principio debe estar vacía
		assertTrue(pila.empty());
		// Y no está llena
		assertFalse(pila.full());
		// Nulo si intento sacar un elemento
		assertNull(pila.pop());
		// Inserto una palabra
		assertTrue(pila.push("Primera"));
		// Ya no está vacía
		assertFalse(pila.empty());
		// Pero tampoco llena
		assertFalse(pila.full());
		// Inserto la segunda palabra y obtengo la lista de elementos
		assertTrue(pila.push("Segunda"));
		assertTrue(Arrays.equals(new String[] {"Primera", "Segunda"}, pila.getAll()));
		// Inserto la tercera palabra
		assertTrue(pila.push("Tercera"));
		// Y está llena
		assertTrue(pila.full());
		// Intento insertar otra pero no cabe
		assertFalse(pila.push("Cuarta"));
		// Compruebo el contenido de la pila
		assertTrue(Arrays.equals(new String[] { "Primera", "Segunda", "Tercera" }, pila.getAll()));
		assertFalse(Arrays.equals(new String[] { "Tercera", "Segunda", "Primera" }, pila.getAll()));
		// Busco una palabra que existe
		assertTrue(pila.search("Segunda"));
		// Y una que no existe
		assertFalse(pila.search("Cuarta"));
		// Vacío la pila
		assertEquals("Tercera", pila.pop());
		assertEquals("Segunda", pila.pop());
		assertEquals("Primera", pila.pop());
		assertEquals(null, pila.pop());
		// Busco una palabra que existía pero ya no
		assertFalse(pila.search("Segunda"));
		// No está llena, está vacía
		assertFalse(pila.full());
		assertTrue(pila.empty());

	}

}
