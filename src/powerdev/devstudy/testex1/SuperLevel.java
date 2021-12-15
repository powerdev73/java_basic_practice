package powerdev.devstudy.testex1;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("고급자는 엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("고급자는 아주 높이 JUMP합니다.");
    }

    @Override
    public void turn() {
        System.out.println("고급자는 TURN을 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}
