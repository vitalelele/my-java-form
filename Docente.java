package esameLab;

public class Docente {
	private int matricola;
	private String cognome;
	private String nome;
	private final String QUALIFICA = "DOCENTE";
	
	public Docente(int matricola, String cognome, String nome) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
	}
	
	public void chiSono() {
		System.out.println("Cognome: " + this.cognome +"\nNome: " + this.nome + "\nQualifica: " + this.QUALIFICA + "\nMatricola: " + this.matricola + "\n");
	}
	
}
