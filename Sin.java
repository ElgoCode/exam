import java.util.Scanner;

class Sin{
    public static void main(String[] args) {
        System.out.println(sin(45));
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
    public static float sin(int x){
        float x_ = (float)(x * (Math.PI/180)); //covert angle to radian
        int count = 0;
        float sum = 0;
        int sign = 1;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = scan.nextInt();
        scan.close();
        while(count <= n){
            float top = (float) Math.pow(x_, i);
            float bottom = factorial(i);
            float result = (top/bottom) *sign;
            sum += result;
            sign *= -1;
            count++;
            i += 2;
        }
        return sum;
    }
}

