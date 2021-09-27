import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String... args){
        int value1;
        int value2;
        System.out.println("Enter your first value");
        value1 = scanner.nextInt();
        System.out.println("Enter your second value pls");
        value2 = scanner.nextInt();
        System.out.println("Calculated value :" + (value1 + value2));

    }
    public double calculate(int v1, int v2,int operation){
        switch (operation){
            case 1:
                return v1 +v2;
                break;
            case 2:

        }
        return 0.0;
    }
}
