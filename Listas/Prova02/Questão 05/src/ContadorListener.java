public class ContadorListener implements Listener {
    public int valor;
    @Override
    public void oValorMudou(int novoValor){
        System.out.println("Ocorreu alteracao no contador para: " + novoValor);
        valor = novoValor;
    }
}