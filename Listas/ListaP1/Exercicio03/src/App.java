import java.util.Scanner;
import java.util.ArrayList;
public class App {
    //* Lista declarada como static para ser um atributo da classe App (é como uma variável global)
    static ArrayList<Pessoa> listaDePessoas = new ArrayList();
    static ArrayList<Aluno> listaDeAlunos = new ArrayList();
    static ArrayList<Professor> listaDeProfessores = new ArrayList();



    public static void main(String[] args){
        System.out.println("Hello, World!");
        
        listaDePessoas.add(new Aluno("Beltrano", 8000, "beltrano@gmail.com", 7, "Engenharia da Computação", "4º", 12877124));
        listaDeAlunos.add(new Aluno("Beltrano", 8000, "beltrano@gmail.com", 7, "Engenharia da Computação", "4º", 12877124));
        listaDePessoas.add(new Professor("Miguel", 2718, "miguelito@gmail.com", 10, "Paraguay", 9000000, "Cafezino"));
        listaDeProfessores.add(new Professor("Miguel", 2718, "miguelito@gmail.com", 10, "Paraguay", 9000000, "Cafezino"));


        listaAlunos();
        listaProfessores();
        listaProfessoresSalario(5000);    
    }

    public static int mostrarTempoEmprestimo(Pessoa pessoa){
        return pessoa.mostrarTempoEmprestimo();
    }

    public static void listaProfessores() {
        for (Professor p : listaDeProfessores) {
            if (p instanceof Professor){
                System.out.println("Professor " + p.getName());
                listaDePessoas.add(p);
            }
        }
    }

    public static void listaAlunos(){
        for(Pessoa p : listaDePessoas){
            if (p instanceof Aluno){
                System.out.println("Aluno " + p.getName());
            }
        }
    }

    public static void listaProfessoresSalario(int referencia){
        for (Professor p : listaDeProfessores) {
            if (p.getSalario() >= referencia){
                System.out.println("Professor " + p.getName());
            }
        }
    }

    public static void cadastraPessoa(){
        System.out.printf("\nCadastro de Pessoa ");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nDigite o nome do pessoa: ");
        String name = scanner.next();
        System.out.printf("\nDigite o cpf do pessoa: ");
        int cpf = scanner.nextInt();
        System.out.printf("\nDigite o e-mail do pessoa: ");
        String email = scanner.next();
        System.out.printf("\nDigite o tempo de emprestimo da pessoa: ");
        int tempoEmprestimo = scanner.nextInt();

        Pessoa pessoa = new Pessoa(name, cpf, email, tempoEmprestimo);

    }

    public static void cadastraProfessor(){
        System.out.printf("\nCadastro de Professor ");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nDigite o nome do professor: ");
        String name = scanner.next();
        System.out.printf("\nDigite o cpf do professor: ");
        int cpf = scanner.nextInt();
        System.out.printf("\nDigite o e-mail do professor: ");
        String email = scanner.next();
        System.out.printf("\nDigite o tempo de emprestimo do professor: ");
        int tempoEmprestimo = scanner.nextInt();
        System.out.printf("\nDigite a formacao do professor: ");
        String formacao = scanner.next();
        System.out.printf("\nDigite o salario do professor: ");
        float salario = scanner.nextFloat();
        System.out.printf("\nDigite o departamento do professor: ");
        String departamento = scanner.next();

        Professor professor = new Professor(name, cpf, email, tempoEmprestimo, formacao, salario, departamento);
    }
}