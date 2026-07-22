public class Polymorphism {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
        
    }
}
 // static -> they belongs to class and not to objects
 // private methods cant be overriden
 // final method can't be overwritten

 // Final --> class ?? --> You cannot create child of that class.

 // Fields / Variables they cannot be polymorphic


class A{

    // static void fun(){
    void fun(){
        System.out.println("Hello Class-A");
    }
    private void fun2(){
        System.out.println("Private method class-A");
    }
    final void fun3(){
        System.out.println("Final method Class-A");
    }
}

class B extends A{
    // static void fun(){
    void fun(){
        System.out.println("Hello Class-B");
    }
    // void fun3(){
    //     System.out.println();
    // }
}
