public class ContadorListener implements Listener {
    public int valor;
    @Override
    public void oValorMudou(int novoValor){
        System.out.println("O novo valor e:" + novoValor);
        valor = novoValor;
    }
}