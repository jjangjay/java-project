import java.util.ArrayList;

public class Professor extends Person {
    private ArrayList<String> lectures;

    public Professor(String id, String name, String status, String birthdate, String contact) {
        super(id, name, status, birthdate, contact);
        this.lectures = new ArrayList<>();
    }

    public void addLecture(String lecture) {
        this.lectures.add(lecture);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("담당 학생 목록:");
        printLectures();
    }

    public void printLectures() {
        if (lectures.isEmpty()) {
            System.out.println("담당 학생 목록이 비어 있습니다.");
        } else {
            for (String lecture : lectures) {
                System.out.println(lecture);
            }
        }
    }
}
