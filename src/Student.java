// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student {


    public String Name = "SPANDHANA";

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name =

                Name;
    }

    public static void main(String[] args) {


        Student student = new Student();

        String Student1 = student.getName();


        System.out.println(Student1);


        student.setName("ABC");


        System.out.println(student.Name);

    }
}