public class ContagemThread extends Thread {
    private String nomeDaThread;
    public long demora = 0;

    public ContagemThread(String nome) {
        super();                                            //^ Constroi a classe mãe chamando os atributos dessa
        nomeDaThread = nome;                                
    }

    public void run() {                                     //^ O que é rodado ao se iniciar a Thread
        long initialTime = System.currentTimeMillis();      //^ Marca o momento inicial

        int contador = 0;               

        for(int i = 0; i < 1000000; i++) {                  //^ Inicia o looping com sleep(cada ciclo demora um tempo determinado)
            contador++;
           System.out.println(nomeDaThread + ") Contando: " + contador);
            try {
                sleep(0, 100);                              //^ Espera um tempo de 0 à 100
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        demora = System.currentTimeMillis() - initialTime;                //^ Marca o momento inicial menos o atual
        System.out.println(nomeDaThread + " Demorou: " + demora + " ms"); //^ Printa quanto tempo demorou um ciclo run da Thread
    }
}