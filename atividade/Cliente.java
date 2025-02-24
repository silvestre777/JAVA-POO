package atividade;
public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Cliente(Endereco endereco, int idade, String nome) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
    }

    public Cliente() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }


}
