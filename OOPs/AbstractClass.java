class AbstractClass{
    public static void main(String[] args) {

        // Car c1 = new ElectricCar();
        Car c1 = new FuleCar();
        c1.start();
        c1.accelerate();
        c1.stop();
        
    }
}
abstract class Car{
    void start(){
        System.out.println("Car Started.");
    }
    abstract void accelerate();
    abstract void stop();
}

class FuleCar extends Car{
    @Override
    void accelerate(){
        System.out.println("Fule Car is accelerating.");
    }

    @Override
    void stop(){
        System.out.println("Fule Car stop");
    }
}

class ElectricCar extends Car{
    @Override
    void accelerate(){
        System.out.println("Electric Car is accelerating.");
    }

    @Override
    void stop(){
        System.out.println("Electric Car is stoped");
    }
}