package powerdev.devstudy.testex1;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("중급자는 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("중급자는 높이 JUMP를 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("중급자는 TURN을 하지 못합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다. *****");    }
}
