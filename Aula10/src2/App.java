public class App {
    public static void main(String args[]) {
        System.out.println("Teste 123");

        long initialTime = System.currentTimeMillis(); //* Marca o momento inicial 

        //^ Inciando as Threads (1º cria objeto do tipo da classe; 2º cria objetos; 3º inicia os objetos)
        
        ContagemThread t1, t2, t3;

        t1 = new ContagemThread("Contador A");
        t2 = new ContagemThread("Contador B");
        t3 = new ContagemThread("Contador C");

        t1.start();
        t2.start();
        t3.start();

//        fazerContagem("Contador A");
//        fazerContagem("Contador B");
//        fazerContagem("Contador C");

        long demora = System.currentTimeMillis() - initialTime; //* Marca o momento atual menos o inicial (tempo que demorou)
        System.out.println("Main Demorou: " + demora + " ms");  //* Tempo que o Main (código principal) demorou pra ser rodado
        
        try {
            t1.join();                                          //^ .join() As outras Thread terão só darãol run, após a primeira fazer
            t2.join();                                          //^ Nesse código as Threads dão run uma de cada vez
            t3.join();                                          //^ Lembre-se: as Threads não param de rodar mas assim uma vai ter que esperar um ciclo run da outra
        } catch (InterruptedException e) {
            e.printStackTrace();                                //^ A excessão(erro) "e" irá ser impresso junto de mais detalhes pelo método printStackTrace
        }

//        System.out.println("A Demorou: " + t1.demora + " ms");
//        System.out.println("B Demorou: " + t2.demora + " ms");
//        System.out.println("C Demorou: " + t3.demora + " ms");
    }

    private static void fazerContagem(String nome) {
        int contador = 0;
        for(int i = 0; i < 1000000; i++) {
            contador++;
            System.out.println(nome + ") Contando: " + contador);
        }
    }
}