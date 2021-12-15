package powerdev.devstudy.interfaceex1;

public interface Sell {
    void sell();
    default void order() {
        System.out.println("Sell Order");
    }
}
