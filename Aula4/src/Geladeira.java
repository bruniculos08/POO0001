public class Geladeira {
    private int nivelDaTemperatura;     // *Declaração das variáveis sem atribuir valor, apenas acesso e tipo
    private Congelador meucongelador;      // se quiser mais de um congelador poderia fazer um vetor de congelador
    private Refrigerador meuRefrigerador;       // no caso seria: List <Congelador> congelador[número]

    public Geladeira(){
        new Congelador();
        new Refrigerador();
    }
    
    public void selecionarTemperatura(int nivel){
        nivelDaTemperatura = nivel;

        float temperaturaCongelador = 0f;
        float temperaturaRefrigerador = 0f;


        switch (nivel) {
            case 0:
                temperaturaCongelador = -28.0f;
                temperaturaRefrigerador = 2.5f
                break;
            case 1:
                break
            case 2:
                break
            default:
                break;
        }
    }


    public void controlarTemperatura(){

    }

}
