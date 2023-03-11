import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a>b && a>c) {
            System.out.println("первое больше");
        }
        else if (b>a && b>c) {
            System.out.println("второе больше");
        }
        else {
            System.out.println("если");
        }
    }
}
