public class StaticKeyword {

    public static void main(String[] args) {
        Student4 s1 = new Student4("Aditya", 28, 101);
        Student4 s2 = new Student4("Rohit", 30, 102);

        // Student4.college = "IIT Guwahati"; // no need if static block exist

        System.out.println(s1.name+" "+s1.age+" "+s1.rollNumber+" "+s1.college+" "+s1.grade);
        // System.out.println(s1.name+" "+s1.age+" "+s1.rollNumber+" "+Student4.college);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollNumber+" "+Student4.college+" "+Student4.grade);


        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x = 4;
        // x=5;  // value of x can't be changed
        System.out.println(x);
        
    }
}
class Student4{
    String name;
    int age;
    int rollNumber;
    static String college;
    static int grade = 8;

    // Student4(String name, int age, int rollNumber, String college){
    Student4(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        // this.college = college; // show warning that's why args not take
    }

    //Static block
    static{
        college = "IIT Guwahati";
    }


}
class Random{
    final double PI;
    Random(){
        this.PI = 3.14;
    }
}