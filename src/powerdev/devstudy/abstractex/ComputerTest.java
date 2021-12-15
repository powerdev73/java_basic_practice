package powerdev.devstudy.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        desktop.turnOn();
        desktop.display();
        desktop.typing();
        desktop.turnOff();

        System.out.println("================================");

        Computer mynotebook = new MyNoteBook();
        mynotebook.turnOn();
        mynotebook.display();
        mynotebook.typing();
        mynotebook.turnOff();
    }
}
