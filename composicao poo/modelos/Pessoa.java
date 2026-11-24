package modelos;

// classe base abstrata com os dados comuns de aluno e funcionario
public abstract class Pessoa{
    private String nome;
    private long cpf;
    private long telefone;

    public Pessoa(String nome, long cpf, long telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    // retorna os dados basicos da pessoa formatados
    @Override
    public String toString(){
        return "Nome: " + nome + " CPF: " + cpf + " Telefone: " + telefone;
    }
}
