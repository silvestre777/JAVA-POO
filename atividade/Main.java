package atividade;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(new Endereco("Salvador", "Rua A", "7"),7, "Silvestre");

        System.out.println(cliente1.toString());
    }
}
