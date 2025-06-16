import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> course;

    public Student() {
        super();
        this.course = new ArrayList<>();
    }

    public Student(String id, String name, String status, String birthdate, String contact) {
        super(id, name, status, birthdate, contact);
        this.course = new ArrayList<>();
    }

    public void addCourse(String course) {
        this.course.add(course);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("수강 교과목 목록:");
        printCourse();
    }

    public void printCourse() {
        if (course.isEmpty()) {
            System.out.println("수강 교과목 목록이 비어 있습니다.");
        } else {
            for (String c : course) {
                System.out.println(c);
            }
        }
    }

//    private String id;
//    private String name;
//    private String status;
//    private String birthdate;
//    private String contact;
//    private ArrayList<String> course = new ArrayList<>();
//
//    public Student() {
//        id = "";
//        name = "";
//        status = "";
//        birthdate = "";
//        contact = "";
//    }
//
//    public Student(String id, String name, String status, String birthdate, String contact) {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
//    }
//
//    public void setStudent(String id, String name, String status, String birthdate, String contact) {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
//    }
//
//    public void addCourse(String courseName) {
//        coursec.add(courseName);
//    }
//
//    public void printInfo() {
//        if (coursec.isEmpty()) {
//            System.out.println("없음");
//        } else {
//            System.out.println("ID: " + id);
//            System.out.println("Name: " + name);
//            System.out.println("Status: " + status);
//            System.out.println("Birthdate: " + birthdate);
//            System.out.println("Contact: " + contact);
//        }
//    }
//
//    public void printCourse() {
//        if (coursec.isEmpty()) {
//            System.out.println("수강 교과목 목록이 비어 있습니다.");
//        } else {
//            for (String course : coursec) {
//                System.out.println(course);
//            }
//        }
//    }
}