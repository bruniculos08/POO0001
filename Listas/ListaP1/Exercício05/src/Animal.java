public class Animal {
    private String nome;
    private String continenteEncontrado;
    private String comidaFavorita;
    private int estimativaDeVida;

    public Animal(String nome, String continenteEncontrado, String comidaFavorita, int estimativaDeVida){
        this.nome = nome;
        this.continenteEncontrado = continenteEncontrado;
        this.comidaFavorita = comidaFavorita;
        this.estimativaDeVida = estimativaDeVida;
    }

    public String getName(){
        return nome;
    }
}