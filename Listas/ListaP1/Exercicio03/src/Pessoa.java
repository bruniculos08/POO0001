public class Pessoa {
    private String name;
    private int cpf;
    private String email;
    private int tempoEmprestimo;

    public Pessoa(String name, int cpf, String email, int tempoEmprestimo){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.tempoEmprestimo = tempoEmprestimo;
    }
    public int mostrarTempoEmprestimo(){
        return tempoEmprestimo;
    }

    public String getName(){
        return name;
    }
}