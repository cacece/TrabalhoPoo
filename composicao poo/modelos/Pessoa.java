package modelos;

// classe base abstrata com os dados comuns de aluno e funcionario
public abstract class Pessoa{
    private String nome;
    private int cpf;
    private int telefone;

    public Pessoa(String nome, int cpf, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    // retorna os dados basicos da pessoa formatados
    @Override
    public String toString(){
        return "Nome: " + nome + " CPF: " + cpf + " Telefone: " + telefone;
    }
}
