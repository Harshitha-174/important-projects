public class Car {
    String brand;
    int speed;
    void drive(){
        System.out.println(brand+" "+speed);
    }
    public static void main(String[] args){
        Car obj=new Car();
        obj.brand="Honda";
        obj.speed=40;
        obj.drive();
    }
}

