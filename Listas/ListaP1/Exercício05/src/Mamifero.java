public class Mamifero extends Animal {
    private boolean poeOvos;
    private boolean voa;
    
    public Mamifero (String nome, String continenteEncontrado, String comidaFavorita, int estimativaDeVida, boolean poeOvos, boolean voa) {
        super(nome, continenteEncontrado, comidaFavorita, EstimativaDeVida);
        this.poeOvos = poeOvos;
        this.voa = voa;
    }    
}