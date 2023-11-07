package ReinoAnimal;

/**
 * Esta classe representa um animal Aquatico
 * 
 * @author Gabriel Richard Morais de Lima
 *
 */

public class Aquatico extends Animal {

	private String tipoAgua;
	private boolean escamas;

	/**
	 * Construtor da classe Aquatico
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param tipoAgua
	 * @param escamas
	 */

	public Aquatico(String especie, String sexo, double dataNascimento, String tipoAgua, boolean escamas) {
		super(especie, sexo, dataNascimento);
		this.tipoAgua = tipoAgua;
		this.escamas = escamas;

		// TODO Auto-generated constructor stub
	}

	public void nadar() {

		/**
		 * Imprime no console que o animal está nadando
		 * 
		 * @since 06/11/2023
		 */
		System.out.println("O animal está nadando...");

	}

	public void comer() {

		/**
		 * Informa que o animal está comendo
		 * 
		 * @since 06/11/2023
		 */

		System.out.println("O animal aquatico está comendo...");
	}

	@Override
	public void perfil() {

		/**
		 * Imprime no console os dados do animal
		 * 
		 * @since 06/11/2023
		 * 
		 **/

		super.perfil();
		System.out.println("Tipo de água: " + tipoAgua + "Escamoso: " + escamas);

	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}

}
