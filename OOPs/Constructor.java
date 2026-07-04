public class Constructor {
    public static void main(String[] args) {
        // Student1 s1 = new Student1();

        Student1 s1 = new Student1("Rohit", 28, 102, "IIM");
        
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
        
        Student1 s2 = new Student1(); // when we comment out default constructer this will throw error .They need parameter
        
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNumber);
        System.out.println(s2.college);


    }
}
class Student1{
    String name;
    int age;
    int rollNumber;
    String college;

    // Default Constructor
    public Student1(){
        // name = "Aditya";
        // age = 28;
        // rollNumber = 102;
        // college = "IIT Delhi";

    }

    Student1(String n, int a, int rn, String c){
        name = n;
        age = a;
        rollNumber = rn;
        college = c;

    }
    void markAttendance(){
        System.out.println("Attendance marked for student "+name);
    }
}