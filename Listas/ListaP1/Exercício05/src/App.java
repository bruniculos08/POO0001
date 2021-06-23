import java.util.ArrayList;
public class App {
    public static void main(String[] args){
        Ave bird = new Ave("Avestruz", "Africa", "Plantas", 10, false);
        KingAnimal kingAnimal = new KingAnimal();
        kingAnimal.addAnimal(bird);
        kingAnimal.procuraAnimal("bird");

        System.out.println(kingAnimal.listagemAnimal());

        kingAnimal.removeAnimal(bird);

        System.out.println(kingAnimal.listagemAnimal());
    }
}