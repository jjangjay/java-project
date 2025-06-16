public class Person {
    protected String id;
    protected String name;
    protected String status;
    protected String birthdate;
    protected String contact;

    public Person() {
        id = "";
        name = "";
        status = "";
        birthdate = "";
        contact = "";
    }

    public Person(String id, String name, String status, String birthdate, String contact) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.birthdate = birthdate;
        this.contact = contact;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Contact: " + contact);
    }
}
