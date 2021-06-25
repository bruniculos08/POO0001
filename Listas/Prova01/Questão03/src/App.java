public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado(5);
        Cubo c = new Cubo(5);
        double teste1 = q.getArea();
        double teste2 = c.getArea();
        System.out.println(teste1);
        System.out.println(teste2);
    }
}
