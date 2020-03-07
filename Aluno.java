public class Aluno{
    private int id;
    private String nome;

    public Aluno(int id, String nome){
      this.nome = nome;
      this.id = id;
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