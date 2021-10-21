
public class Aluno {
	int codigo;
	String nome;
	String curso;
	double nota1;
	double nota2;
	double nota3;
	
	public Aluno() {};

	public Aluno(int cod, String nome, String curso) {
		this.codigo = cod;
		this.nome = nome;
		this.curso = curso;		
	}
	
	public Aluno(int cod, String nome, String curso, double nota1, double nota2, double nota3) {
		this.codigo = cod;
		this.nome = nome;
		this.curso = curso;		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
}
