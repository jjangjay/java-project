import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("좌석의 행 수를 입력하세요: ");
        int rows = sc.nextInt();
        System.out.print("좌석의 열 수를 입력하세요: ");
        int cols = sc.nextInt();
        int[][] seats = new int[rows][cols];

        while (true) {
            System.out.print("예약할 좌석의 행 번호 입력 (1~" + rows + "): ");
            int row = sc.nextInt();
            System.out.print("예약할 좌석의 열 번호 입력 (1~" + cols + "): ");
            int col = sc.nextInt();

            if (row == 0 && col == 0) {
                break;
            }

            if (row < 1 || row > rows || col < 1 || col > cols) {
                System.out.println("잘못된 좌석입니다. 다시 입력하세요.");
                continue;
            }

            if (seats[row - 1][col - 1] == 1) {
                System.out.println("이미 예약된 좌석입니다.");
            } else {
                seats[row - 1][col - 1] = 1;
                System.out.println("좌석이 예약되었습니다.");
            }
        }

        System.out.println("\n--- 현재 좌석 배치도 (0:비어있음, 1:예약됨) ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}