import java.util.ArrayList;
public class KingAnimal {
    static ArrayList<Animal> listaDeAnimais = new ArrayList();
    public KingAnimal(){
    }

    public static ArrayList<String> listagemAnimal(){
        ArrayList<String> listaAnimal = new ArrayList();
        for(Animal a : listaDeAnimais){
            listaAnimal.add(a.getName());
        }
        return listaAnimal;
    }
    
    public static void addAnimal(Animal animal){
        listaDeAnimais.add(animal);
    }

    public static void removeAnimal(Animal animal){
        listaDeAnimais.remove(animal);
    }

    public static Animal procuraAnimal(String nome){
        for (Animal a : listaDeAnimais){
            if (nome == a.getName()){
                return a;
            }
        }
        Animal naoExiste = new Animal("não existe", "não existe", "não existe", 0);
        return naoExiste;
    }
}