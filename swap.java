import java.util.Scanner;

public class swap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("A and B before swaping " +a+ " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A and B after swaping " +a+ " " +b);

    }
}
