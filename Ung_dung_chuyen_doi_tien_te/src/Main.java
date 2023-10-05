import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vnd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        vnd=sc.nextDouble();
        System.out.println("Gia tri VND: "+ vnd*23000);
    }
}