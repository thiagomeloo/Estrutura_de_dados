package dominio;

public class Aluno {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
