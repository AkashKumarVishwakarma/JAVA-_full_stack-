public class Functions2 {
    public static void main(String[] args) {
        // // Function Overloading
        // int x = sum(2, 4);
        // System.out.println(x);

        // int y = sum(5,6,7);
        // System.out.println(y);

        // int z = sum(2.5, 3.4);
        // System.out.println(z);

        // greet("Akash", 23);
        // greet(24,"Ravi");



        //***********************Chaining of Fuction********** */
        System.out.println("Hello from main.");
        fun1();
        System.out.println("Bye from main.");

    }

        // static int sum(int a, int b){
        //     return (a + b);
        // }

        // static int sum(int a, int b, int c){  // difrent no. of parameters
        //     return (a+b+c);
        // }

        // static int sum(double a, double b){  // difrent types of parameters
        //     return (int)(a * b);
        // }

        // static void greet(String name, int age){
        //     System.out.println("Hi "+name+". Your age is "+age);
        // }

        // static void greet(int age, String name){  // Ordering of parameters
        //     System.out.println("Your age is "+age+" .and name is "+ name);
        // }

        // static void fun(){
        //     System.out.println("Hello");
        // }

        // // // static int fun(){
        // // static void fun(){   // can't diside only based on return type
        // //     return 5;
        // // }


        //***********************Chaining of Fuction********** */
        static void fun1(){
            System.out.println("Hello from fun1");
            fun2();
            System.out.println("Bye from fun1.");
        }
        static void fun2(){
            System.out.println("Hello from fun2");
            fun3();
            System.out.println("Bye from fun2.");
        }
        static void fun3(){
            System.out.println("Hello from fun3");
            System.out.println("Bye from fun3.");
        }

}
