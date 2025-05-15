import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1부터 100 사이의 숫자를 입력하세요: ");
            int num = sc.nextInt();
            if (num <= 0 || num > 100) {
                continue;
            }
            System.out.println("입력 완료! 프로그램을 종료합니다.");
            break;
        }
    }
}