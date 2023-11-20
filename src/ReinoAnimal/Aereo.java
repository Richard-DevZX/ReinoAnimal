package ReinoAnimal;

/**
 * Esta classe representa um animal Aereo
 * 
 * @author Gabriel Richard Morais de Lima
 *
 */

public class Aereo extends Animal {

	double altitude;

	/**
	 * Construtor da classe Aereo
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param altitude
	 */

	public Aereo(String especie, String sexo, double dataNascimento, double altitude) {
		super(especie, sexo, dataNascimento);
		this.altitude = altitude;
		// TODO Auto-generated constructor stub
	}

	public void voar() {

		/**
		 * Imprime no console que o animal está voando
		 * 
		 * @since 06/11/2023
		 */
		System.out.println("O animal está se voando...");

	}

	@Override

	public void comer() {

		/**
		 * Informa que o animal está comendo
		 * 
		 * @since 06/11/2023
		 */

		System.out.println("O animal aéreo está comendo...");
	}

	public void perfil() {

		/**
		 * Imprime no console os dados do animal
		 * 
		 * @since 06/11/2023
		 * 
		 **/

		super.perfil();
		System.out.println("Altura de vôo: " + altitude);

	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

}
