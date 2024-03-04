import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers: ");
        while(true){
            System.out.println(sqrt(scanner.nextDouble()));
        }
    }
    public static int sqrt(double number) {
       double sqrt = Math.sqrt(number);  // 4 // 2.1
       double floor = Math.floor(sqrt); // 2

        if(sqrt == floor){
            return(int) sqrt;
        }else{
            throw new IllegalArgumentException();
        }
    }
}