public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected void Getdados(){
        System.out.println(nome);
        System.out.println(idade);
    }
}
