public class FunctionsInJava {
    public static void main(String[] args) {
        //Functions in Java

        // greet();
        // sayHello("Akash");

        // // int x = getNumber();
        // // System.out.println(x);
        // System.out.println(getNumber());

        System.out.println(multiply(12, 7));
        


    }



    //No Ip, No op
    static void greet(){
        System.out.println("Good Morning");
        return; // Optinal
    }

    //Ip, No Op
    static void sayHello(String name){//Number of parmeter can be anything
        System.out.println("Hello " + name);
    }

    //No Ip, OP
    static int getNumber(){
        return 10;
    }

    //Ip, Op
    static int multiply(int a, int b){
        return (a * b);
    }


}
