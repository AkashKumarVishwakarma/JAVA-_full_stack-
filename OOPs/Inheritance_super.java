public class Inheritance_super {
    public static void main(String[] args) {
        EngineeringStudent es1 = new EngineeringStudent("Aditya",22,1,"IIT");
        es1.print();
        
    }
}
class Student6{
    String name;
    int rollNumber;
    int age;

    Student6(){}

    Student6(String name,int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    void print(){
        System.out.println(name+" "+age+" "+rollNumber);
    }
}
class EngineeringStudent extends Student6{
    String college;

    EngineeringStudent(String name, int age, int rollNumber,String college){
        super(name, age, rollNumber);
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;

        this.college = college;
    }

    void print(){
        super.print();
        System.out.println(college);
    }

}
