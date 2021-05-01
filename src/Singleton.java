/**
 * Classe padrão Singleton
 * garante que somente uma instancia desse objeto exista na aplicação
 * @author emersson
 */
public final class Singleton {
	// Uso do 'final' para que outras classes não o utilizem como herança
	
	
	// Uso da variável privada para que não haja alteração fora da própria classe
	private static Singleton instance;
	
	
	// Uso do construtor privado para proibir a criação de instâncias
	private Singleton() {
		System.out.println("Singleton");
	}
	
	// Uso do método estático que retornará a única instância da classe
	public static Singleton getInstance() {
		
		// Caso ainda não exista uma instância da classe ela será criada nesse momento
		if(instance == null) {
			instance = new Singleton();
		}
		
		// Por fim retornará a instância
		return instance;
	}
	

}
