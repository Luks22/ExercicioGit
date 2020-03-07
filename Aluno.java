public class Aluno{
    private int id;
    private String nome;

    public Aluno(int id, String nome){
      setNome(nome);
      setId(id);
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setId(int id){
      this.id = id;
    }
    public void setNome(string nome){
      this.nome = nome;
    }
}