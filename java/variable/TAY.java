package variable;

import Operator.Operator;

public class TAY {
    public static class Car {
        String model;
        int speed;
        Car(String model) {
            this.model = model;
        }
        void setModel(String model) {
            this.model = model;
        }
        void setSpeed(int speed) {
            this.speed = speed;
        }
        void run() {
            for(int i = 10; i <= 50; i += 10) {
                this.setSpeed(i);
                System.out.println(this.model + "달립니다. (시속 :" + this.speed + "km/h)");
            }
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("경운기");

        myCar.run();
        yourCar.run();
    }
}
