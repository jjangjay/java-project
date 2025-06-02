import java.util.ArrayList;

public class Main {
//        0: id, 1: name, 2: status, 3: birthdate, 4: contact
    static final int studentNum = 3;

    static String[][] students = new String[studentNum][5];
    static ArrayList<String>[] courseList = new ArrayList[studentNum];

    public static void main(String[] args) {
        for (int i = 0; i < studentNum; i++) {
            courseList[i] = new ArrayList<>();
        }
        setStudentInfo(0, "20230001", "홍길동", "재학", "2000-01-01", "010-1234-5678");
        setStudentInfo(1, "20230002", "김철수", "휴학", "2000-02-02", "010-2345-6789");
        setStudentInfo(2, "20230003", "이영희", "졸업", "2000-03-03", "010-3456-7890");

        addCourse(0, "자료구조");
        addCourse(0, "운영체제");

        addCourse(1, "데이터베이스");

        addCourse(2, "자료구조");
        addCourse(2, "운영체제");
        addCourse(2, "데이터베이스");
        removeCourse(2, "운영체제");

        printAllStudents();

        printStudentInfo(1);
    }

    public static void setStudentInfo(int index, String id, String name, String status, String birthdate, String contact) {
        students[index][0] = id;
        students[index][1] = name;
        students[index][2] = status;
        students[index][3] = birthdate;
        students[index][4] = contact;
    }

    public static void addCourse(int index, String courseName) {
        courseList[index].add(courseName);
    }

    public static void removeCourse(int index, String courseName) {
        courseList[index].remove(courseName);
    }

    public static int getCouseNum(int index) {
        return courseList[index].size();
    }

    public static void printAllStudents() {
        for (int i = 0; i < students.length; i++) {
            printStudentInfo(i);
            System.out.println();
        }
    }

    public static void printStudentInfo(int index) {
        System.out.println("== 학생" + (index + 1) + " 정보 ==");
        System.out.println(students[index][0]);
        System.out.println(students[index][1]);
        System.out.println(students[index][2]);
        System.out.println(students[index][3]);
        System.out.println(students[index][4]);

        int courseCount = getCouseNum(index);
        System.out.println("<수강 교과목 목록(" + courseCount + "개)>");
        if (courseList[index].isEmpty()) {
            System.out.println("없음");
        } else {
            for (String course : courseList[index]) {
                System.out.println(course);
            }
        }
    }
}