import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        System.out.println(exp(5));
    }
    public static int factorial(int number){
        if (number == 0){
            return 1;
        }
        int sum = 1;
        for(int i = 1; i <= number; i++){
            sum *= i;
        }
        return sum;
    }
    public static float exp(int x){
        int count = 0;
        float sum = 0;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = scan.nextInt();
        scan.close();
        while(count <= n){
            float top = (float) Math.pow(x, i);
            float bottom = factorial(i);
            float result = (top/bottom) ;
            sum += result;
            count++;
            i ++;
        }
        return sum;
    }
}
