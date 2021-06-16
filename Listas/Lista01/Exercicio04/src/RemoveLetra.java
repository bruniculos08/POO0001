public class RemoveLetra {
    public String vowelsRemove(String string){
        String newString = "";
        for(int i = 0; i < string.length(); i++){
            if (isVowel(string.charAt(i)) == false) newString = newString + string.charAt(i);
            else continue;
        }
        return newString;
    }
    public Boolean isVowel(char letter){
        if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
            return true;
        } 
        return false;
    }
    public String consonantsRemove(String string){
        String newString = "";
        for (int i = 0; i < string.length(); i++){
            if (isVowel(string.charAt(i))) newString = newString + string.charAt(i);
            else continue;
        }
        return newString;
    }
}