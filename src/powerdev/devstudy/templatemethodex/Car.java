package powerdev.devstudy.templatemethodex;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 몸통이 있으나 구현하지 않음.
    public void washCar() {}

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        // 하위 클래스에서 재정의하여 사용할 수 있다.
        washCar();
    }
}
