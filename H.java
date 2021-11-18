import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        System.out.println(h(5));
    }
    public static float h(int n){
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("Enter a"+i);
            float a = scan.nextFloat();
            sum += (float)((float)1 / a);
        }
        scan.close();
        float result = n/sum;
        return result;
    }
}
