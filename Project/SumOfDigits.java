import java.util.*;
public class SumOfDigits{
    void sod(int n){
        Scanner in1 = new Scanner(System.in);
        int input;
        int num = n;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of digits of " +n+ " is " +sum);
        System.out.println("If you want to test if this number is divisible by 3, then input 1, if you want to terminate this program then enter 2");
        input = in1.nextInt();
        switch(input){
            case 1:
            if(sum%3 == 0){
               System.out.println("This number is divisible by three"); 
            }
            else{
                System.out.println("This number is not divisible by three");
            }
            break;
            case 2:
            System.out.println();
            break;
            default:
            System.out.println("Error");
            break;
    }
    }
    public static void main(){
        Scanner in = new Scanner(System.in);
        SumOfDigits obj = new SumOfDigits();
        int number;
        System.out.println("Enter the number");
        number = in.nextInt();
        obj.sod(number);
    }
}