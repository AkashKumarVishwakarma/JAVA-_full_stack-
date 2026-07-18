public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        // ba.balance = 1000;

        ba.deposit(100);
        System.out.println("balance = "+ba.getBalance());
        ba.withdraw(50);
        System.out.println("balance = "+ba.getBalance());

        Student5 s = new Student5("Akash", 10, 20);
        System.out.println("Name : "+s.getName());
        System.out.println("College : "+s.getCollege());
        s.setCollege("AITD");
        System.out.println("College : "+s.getCollege());


     
    }
}
class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
}

class Student5 {
    private String name;
    private final int rollNumber;
    private int age;
    private String college; 

    Student5(String name, int rollNumber, int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;

    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        // Validation --> college should be real;
        this.college = college;
    }
}
