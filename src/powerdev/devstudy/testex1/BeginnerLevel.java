package powerdev.devstudy.testex1;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("초급자는 천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("초급자는 JUMP를 하지 못합니다.");
    }

    @Override
    public void turn() {
        System.out.println("초급자는 TURN을 하지 못합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초급자 레벨입니다. *****");
    }
}
