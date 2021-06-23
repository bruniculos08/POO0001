public class Medico extends Pessoa {
    private String especializacao;
    
    public Medico(String especializacao, String nome, int idade){ //falta receber os argumentos de pessoa
        //this.nome = nome;
        //this.idade = idade;
        super(nome, idade); // falta enviar os argumentos de pessoa ao chamar a classe construtora
        this.especializacao = especializacao;
    }

    public void printdados(){
        //println(nome);
        //println(idade);
        System.out.println(especializacao);
    }
}