import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() / 10;

        switch (n) {
            case 10:
            case 9:
                System.out.println("학점은 A입니다.");
                break;
            case 8:
                System.out.println("학점은 B입니다.");
                break;
            case 7:
                System.out.println("학점은 C입니다.");
                break;
            case 6:
                System.out.println("학점은 D입니다.");
                break;
            default:
                System.out.println("학점은 F입니다.");
        }
    }
}