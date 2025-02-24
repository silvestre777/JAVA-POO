package atividade;

public class Endereco {


    private String logradouro;
    private String numero;
    private String cidade;


    public Endereco(String cidade, String logradouro, String numero) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public Endereco() {
    }
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Endereco{");
        sb.append("logradouro=").append(logradouro);
        sb.append(", numero=").append(numero);
        sb.append(", cidade=").append(cidade);
        sb.append('}');
        return sb.toString();
    }


}
