public class ConstructorChaining {

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        // Student2 s2 = new Student2("Aditya");
        // Student2 s3 = new Student2("Akash",23);
        // Student2 s4 = new Student2("Aman",23,103);
        // Student2 s5 = new Student2("Raj",24,104,"IIT Delhi");


        // System.out.println(s3.rollNumber);
        // System.out.println(s3.college);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
        
    }
}
class Student2{
    String name;
    int age;
    int rollNumber;
    String college;

    // Student2() {}
    Student2() {
        // this.name = "Unknown";
        // this.age = 0;
        // this.rollNumber = 0;
        // this.college = "Unknown";
        
        // this("Unknown",0,0,"Unknown");
        this("Unknown");
        System.out.println("I'm in first Constructor");
    }

    Student2(String name){
        // // name = name;
        // this.name = name;
        // this(name,0,0,"Unknown"); //this() refer to constructor with all parameters
        this(name,0);
        System.out.println("I'm in second Constructor");

    }
    Student2(String name,int age){
        // this.name = name;
        // this.age = age;

        // this(name,age,0,"Unknown");
        this(name,age,0);
        System.out.println("I'm in third Constructor");

    }
    Student2(String name,int age, int rollNumber){
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;

        this(name,age,rollNumber,"Unknown");
        System.out.println("I'm in fourth Constructor");


    }
    Student2(String name,int age, int rollNumber, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("I'm in final Constructor");

    }
}