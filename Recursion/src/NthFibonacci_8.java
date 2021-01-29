public class NthFibonacci_8 {
    public static void main(String[] arguments){
        System.out.println(nthFibonacci(5));
    }
    public static int nthFibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibonacci = nthFibonacci(n-1) + nthFibonacci(n-2);
        return fibonacci;
    }
}
