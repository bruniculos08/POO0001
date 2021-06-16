public class Fibonacci {
    private int n;
    public Fibonacci(int n){
        this.n = n;
    }
    public void imprimeSerie(){
        System.out.println("Termos: ");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", termoFibonacci(i));
        }
    }
    public void imprimeSoma(){
        System.out.printf("Soma dos %d primeiros termos = %d ", n, somaFibonacci(n));
    }
    public int termoFibonacci(int n){
        int term = 0;
        if (n > 1) term += termoFibonacci(n-1) + termoFibonacci(n-2);
        else if (n == 1) term += 1;
        else term += 0;
        return term;
    }
    public int somaFibonacci(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += termoFibonacci(i);
        }         
        return sum;
    }
}
