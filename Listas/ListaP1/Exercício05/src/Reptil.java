public class Reptil extends Animal{
    private boolean temPatas;
    public Reptil(String nome, String continenteEncontrado, String comidaFavorita, int estimativaDeVida, boolean temPatas){
        super(nome, continenteEncontrado, comidaFavorita, estimativaDeVida);
        this.temPatas = temPatas;
    }
}