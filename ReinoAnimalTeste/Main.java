package ReinoAnimalTeste;

import ReinoAnimal.Aereo;
import ReinoAnimal.Animal;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;

/**
 * Classe onde ocorrem os testes
 * 
 * @author Gabriel Richard Morais de Lima
 *
 */
public class Principal {

	/**
	 * Método que é utilizado para realizar testes
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Aquatico aqua1.0 = new Aquatico("Rhincodon typus", "fêmea", 3, "água salgada", false);
		
		Aquatico aqua2.0 = new Aquatico("Pseudocrocidolita", "macho", 1, "água doce", true);

		Terrestre earth = new Terrestre("Phantera leo", "macho", 2, "africa", true);
		
		Terrestre earth2 = new Terrestre("Hydrochoerus hydrochaeris", "fêmea", 6, "América do Sul", true);

		Aereo air1.0 = new Aereo("Trochilus", "macho", 1, 40.5);
		
		Aereo air2.0 = new Aereo("Cyanopsitta spixii", "fêmea", 7, 50.9);

		aqua.comer();

		aqua2.nadar();

		earth.comer();

		earth2.mover();

		air.comer();

		air2.voar();

		System.out.println(Animal.quantidade());

	}

}
