import java.util.List;
import java.util.ArrayList;


public class NumeroPrimo {
    public ArrayList<Integer> getPrimosEntre(int inicial, int fim) { //* método público | retorno do tipo "ArrayList<Integer>" | nome | (argumentos)
        ArrayList<Integer> lista = new ArrayList<Integer>(); //* cria um objeto ArrayList (tem que ser filha da classe List)
                                                //* a classe List é um interface apenas
        for (int i = inicial; i <= fim; i++){   //* criar laço para preencher a lista
            if (ehPrimo(i)) {                   //* se for primo (verifica através do método ehPrimo) inclui na lista
                lista.add(i);                   //* adiciona o i na lista
            }                               
        }
        return lista;
    }

    private Boolean ehPrimo (int k) { //* cria um método privado que retorna um dado booleano e tem como argumento um inteiro "k"
        if (k%2 == 0) {                 
            return false;
        }
        int h;
        for (h = 3; h < k; h = h + 2) {
            if (k%h == 0) 
                return false;
        }
        return true;
    }
}