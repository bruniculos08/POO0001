public class Contador {
    private int valor = 0;
    private ContadorListener observador = new ContadorListener();

    public Contador(){
    }

    public void incremetarValor(){
        valor++;
        observador.oValorMudou(valor);
    }

    public void decrementarValor(){
        valor--;
        observador.oValorMudou(valor);
    }
}
