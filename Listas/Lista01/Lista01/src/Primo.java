public class Primo {
    public int número;

    public Primo(int número){
        this.número = número;
    }

    public int verify(int n){
        if (n%2 == 0) return 1;
        for (int i = 3; i < n; i+=2){
            if (n%i == 0) return 1;
        }
        return 0;
    }
}
