package powerdev.devstudy.interfaceex1;

public interface Buy {
    void buy();

    default void order(){
        System.out.println("Buy Order");
    }
}
