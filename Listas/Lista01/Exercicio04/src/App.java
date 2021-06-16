import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("Type a string: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        String newString = "";
        RemoveLetra remove = new RemoveLetra();

        System.out.println("You want remove Vowels or Consonants? Type 'v' or 'c': ");
        char answer = scan.next().charAt(0); //* scan para char
        if (answer == 'v'){
            newString = newString + remove.vowelsRemove(string);
        }
        else if (answer == 'c'){
            newString = newString + remove.consonantsRemove(string);
        }
        System.out.println(newString);
    }
}
