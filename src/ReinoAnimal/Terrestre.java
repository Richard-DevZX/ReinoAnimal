package ReinoAnimal;

/**
 * Esta classe representa um animal Terrestre
 * 
 * @author Gabriel Richard Morais de Lima
 *
 */

public class Terrestre extends Animal {

	String regiao;
	boolean pelos;

	/**
	 * Construtor da classe Terrestre
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param regiao
	 * @param pelos
	 */

	public Terrestre(String especie, String sexo, double dataNascimento, String regiao, boolean pelos) {
		super(especie, sexo, dataNascimento);
		this.regiao = regiao;
		this.pelos = pelos;
		// TODO Auto-generated constructor stub
	}

	public void mover() {

		/**
		 * Imprime no console que o animal está se movendo
		 * 
		 * @since 06/11/2023
		 */
		System.out.println("O animal está se movendo...");

	}

	@Override

	public void comer() {

		/**
		 * Informa que o animal está comendo
		 * 
		 * @since 06/11/2023
		 */

		System.out.println("O animal terrestre está comendo...");
	}

	public void perfil() {

		/**
		 * Imprime no console os dados do animal
		 * 
		 * @since 06/11/2023
		 * 
		 **/

		super.perfil();
		System.out.println("Pertencente a região: " + regiao + "Tem pelos: " + pelos);

	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean ispelos() {
		return pelos;
	}

	public void setpelos(boolean pelos) {
		this.pelos = pelos;
	}

}
