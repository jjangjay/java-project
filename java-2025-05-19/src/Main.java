import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean hasInput = false;

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
            hasInput = true;
        }

        if (hasInput) {
            System.out.printf("점수의 총합은: %d\n", sum);
        } else {
            System.out.println("입력된 점수가 없습니다.");
        }
    }
}