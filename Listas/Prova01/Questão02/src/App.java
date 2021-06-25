public class App {
    public static void main(String[] args){
        //String temp = null;      //* colocar uma String nula causa erro, pois o método .toCharArray() não pode converter algo nulo em um vetor de caracteres
        String temp = "Professor"; //* colocar a String "Professor" no código não corrigido gera o erro "Index 8 out of bounds for length 7"...
                                   //* ... que significa que o código tentou ler a posição índice número 8 do vetor porém o vetor tem tamanho 7 ou seja...
                                   //* ... não há nada na posição de índice 8 do vetor logo ocorre um erro                         
        temp = Inversor.inverterString(temp);
        System.out.println(temp);
        System.out.println(Inversor.inverterString("teste"));
    }
}