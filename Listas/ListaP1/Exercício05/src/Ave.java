public class Ave extends Animal {
    private boolean voa;
    public Ave(String nome, String continenteEncontrado, String comidaFavorita, int estimativaDeVida, boolean voa) {
        super(nome, continenteEncontrado, comidaFavorita, estimativaDeVida);
        this.voa = voa;
    }
}