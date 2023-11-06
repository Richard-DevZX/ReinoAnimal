package ReinoAnimal;

/**
 * 
 * A classe que representa um animal
 * 
 * @author Gabriel Richard Morais de Lima
 *
 */

public class Animal {

	private String especie;
	private String sexo;
	private double DataNascimento;

	private static int contador;
	String dadosAnimal;

	public void comer() {

		/**
		 * Diz que o animal está comendo
		 * 
		 * @since 06/11/2023
		 */

		System.out.println("O anaimal está comendo...");

	}

	public void perfil() {

		/**
		 * Imprime na tela os dados do animal
		 * 
		 * @since 06/11/2023
		 */
		dadosAnimal = "Espécie: " + especie + "Sexo: " + sexo + "Data de nascimento: " + DataNascimento;

		System.out.println(dadosAnimal);
	}

	private static void countar() {

		/**
		 * Incrementa a variavel contador em mais 1. Será usado para contar a quantidade de
		 * animais ao ser chamado no construtor da classe
		 * 
		 * @since 06/11/2023
		 */

		contador++;
	}

	/**
	 * Construtor da classe Animal
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 */

	public Animal(String especie, String sexo, double dataNascimento) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.DataNascimento = dataNascimento;

		/**
		 * No final chamamos o método countar para incrementar a quantidade de animais
		 * instanciados
		 */
		countar();
	}

	public static int quantidade() {

		/**
		 * Mostra a quantidade de animais instanciados
		 * 
		 * @return a quantidade de animais instanciados
		 * 
		 * @since 06/11/2023
		 */

		return contador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(double dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
