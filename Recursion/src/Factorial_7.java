public class Factorial_7 {
    public static void main(String[] arguments){
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int factorialResult = factorial(n-1)*n;
        return factorialResult;
    }
}
