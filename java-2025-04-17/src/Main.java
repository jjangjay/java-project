import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 0;

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: price += 3000; break;
            case 2: price += 4000; break;
            case 3: price += 4500; break;
            default: System.out.println("올바른 값을 입력하세요."); return;
        }

        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int size = sc.nextInt();
        switch (size) {
            case 1: price += 0; break;
            case 2: price += 500; break;
            case 3: price += 1000; break;
            default: System.out.println("올바른 값을 입력하세요."); return;
        }

        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int option = sc.nextInt();
        switch (option) {
            case 1: price += 0; break;
            case 2: price += 500; break;
            case 3: price += 300; break;
            case 4: price += 800; break;
            default: System.out.println("올바른 값을 입력하세요."); return;
        }

        System.out.printf("최종 가격은 [%d]원입니다.", price);
    }
}