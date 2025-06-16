public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("20230001", "홍길동", "재학", "2000-01-01", "010-1234-5678");

        student2.addCourse("Java");
        student2.addCourse("Python");

        System.out.print("학생1의 정보:\n");
        student1.printInfo();

        System.out.print("학생2의 정보:\n");
        student2.printInfo();

        Professor professor = new Professor("20230001", "김교수", "재직", "1970-01-01", "010-9876-5432");
        professor.addLecture("Java");
        professor.addLecture("Application Swcurity");

        System.out.print("교수의 정보:\n");
        professor.printInfo();



//        Student student1 = new Student();
//        student1.setStudent("20230001", "홍길동", "재학", "2000-01-01", "010-1234-5678");
//        student1.addCourse("자바");
//        student1.addCourse("자료구조");
//        student1.printInfo();
//        student1.printCourse();
    }
}