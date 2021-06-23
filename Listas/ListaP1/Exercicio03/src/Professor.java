public class Professor extends Pessoa {
    private String formacao;
    private float salario;
    private String departamento;

    public Professor(String name, int cpf, String email, int tempoEmprestimo, String formacao, float salario, String departamento){
        super(name, cpf, email, tempoEmprestimo);
        this.formacao = formacao;
        this.salario = salario;
        this.departamento = departamento;
        //listaDePessoas.addProfessor(this); //* adiciona o objeto a lista no momento em que ele é criado
    }

    //public int mostrarTempoEmprestimo(){
    //    return tempoEmprestimo;
    //}

    public float getSalario(){
        return salario;
    }
}