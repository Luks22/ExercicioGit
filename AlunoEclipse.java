
public class AlunoEclipse {
	private int id;
	private String nome;
	
	
	public AlunoEclipse(String nome,int id) {
	   setNome(nome);
	   setId(id);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
