public class Inversor {
    public static String inverterString(String texto) {
        char []letras = texto.toCharArray();
        //char []invertido = new char[letras.length-2];//* o tamanho do vetor invertido está menor do que deveria ser...
        char []invertido = new char[letras.length];    //* ... devido ao -2 que deve ser substituido por 0 ou nada;
                                                       //* em resumo: o tamanho do vetor invertido deve ser igual ao do vetor letras
        int index = letras.length - 1; //* o tamanho do index é o tamanho de letras - 1 pois o index será utilizado...
        for(char letra : letras) {     //* ... no loop como índice do vetor e o índice de um vetor começa em 0
            invertido[index] = letra;
            index--;
        }
        return new String(invertido);
    }
}