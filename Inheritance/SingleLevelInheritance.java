package Inheritance;

public class SingleLevelInheritance {

    public static void main(String[] args) {
        Car c=new ElectricCar();
        
    }
    
}

class Car{
    String name="BMW";
    String model="first_class";
}

class ElectricCar extends Car{
    public ElectricCar(){
  System.out.println(name);
    }
}

