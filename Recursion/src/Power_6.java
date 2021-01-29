public class Power_6 {
    public static void main(String[] args){
        System.out.println(power(2, 10));
    }
    public static int power(int n, int x){
        if(x == 0){
            return 1;
        }
        return power(n, x-1)*n;
    }
}
