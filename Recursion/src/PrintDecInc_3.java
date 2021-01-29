public class PrintDecInc_3 {
    public static void main(String[] arguments){
        printDecreasingIncreasing(5);
    }
    public static void printDecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}
