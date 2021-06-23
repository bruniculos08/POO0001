public class Aluno extends Pessoa {
    private String curso;
    private String fase;
    private int matricula;

    public Aluno (String name, int cpf, String email, int tempoEmprestimo, String curso, String fase, int matricula){
        super(name, cpf, email, tempoEmprestimo);
        this.curso = curso;
        this.fase = fase;
        this.matricula = matricula;
        //listaDePessoas.addAluno(this); //* adiciona o objeto a lista no momento em que ele é criado 
    }

    //public int mostrarTempoEmprestimo(){
    //    mostrarTempoEmprestimo();
    //}
}