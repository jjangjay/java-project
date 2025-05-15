public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue; // 5는 건너뜁니다.
            }
            System.out.println("숫자: " + i);
        }
    }
}
