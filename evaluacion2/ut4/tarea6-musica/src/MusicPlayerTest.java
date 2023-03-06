import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MusicPlayerTest {
	
	private MusicPlayer mpA;
	private MusicPlayer mpB;
	
	@BeforeEach
	public void initialize() {
		mpA = new MusicPlayer(new MusicStorageSystemA(4));
		mpB = new MusicPlayer(new MusicStorageSystemB(4));
	}

	@Test
	void testMusicStorageA() {
		assertEquals("No se ha podido borrar.", mpA.eliminar("Primera canción"));
		assertEquals("Añadida correctamente.", mpA.anadir("Primera canción"));
		assertEquals("Añadida correctamente.", mpA.anadir("Segunda canción"));
		assertEquals("Añadida correctamente.", mpA.anadir("Tercera canción"));
		assertEquals("Añadida correctamente.", mpA.anadir("Cuarta canción"));
		assertEquals("No se puede añadir más música.", mpA.anadir("Quinta canción"));
		assertEquals("1. Cuarta canción\n2. Primera canción\n3. Segunda canción\n4. Tercera canción\n", mpA.mostrar());
		assertEquals("Borrada correctamente.", mpA.eliminar("Segunda canción"));
		assertEquals("No se ha podido borrar.", mpA.eliminar("Quinta canción"));
		assertEquals("1. Cuarta canción\n2. Primera canción\n3. Tercera canción\n", mpA.mostrar());
	}
	
	@Test
	void testMusicStorageB() {
		assertEquals("No se ha podido borrar.", mpB.eliminar("Primera canción"));
		assertEquals("Añadida correctamente.", mpB.anadir("Primera canción"));
		assertEquals("Añadida correctamente.", mpB.anadir("Segunda canción"));
		assertEquals("Añadida correctamente.", mpB.anadir("Tercera canción"));
		assertEquals("Añadida correctamente.", mpB.anadir("Cuarta canción"));
		assertEquals("No se puede añadir más música.", mpB.anadir("Quinta canción"));
		assertEquals("1. Primera canción\n2. Segunda canción\n3. Tercera canción\n4. Cuarta canción\n", mpB.mostrar());
		assertEquals("Borrada correctamente.", mpB.eliminar("Segunda canción"));
		assertEquals("No se ha podido borrar.", mpB.eliminar("Quinta canción"));
		assertEquals("1. Primera canción\n2. Tercera canción\n3. Cuarta canción\n", mpB.mostrar());
	}
}