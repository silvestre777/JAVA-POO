package atividade1;

public class Pessoa {

    private int id;
    private String nome;
    private double salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;

    public Pessoa(int id, int idade, String nome, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public Pessoa() {
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nID: ").append(id);
        sb.append("\nNome: ").append(nome);
        sb.append("\nIdade: ").append(idade);
        sb.append("\nSalario: ").append(salario);
        sb.append("\nSetor: ").append(setor);
        sb.append("\nSexo: ").append(sexo);
        return sb.toString();
    }


    
}
