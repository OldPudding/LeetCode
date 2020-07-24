package searchInsertPosition;

public interface Car {
    void run();

    default void test(){
        System.out.println("interface test");
    }

    static void testStatic(){
        System.out.println("This is a static method");
    }
}
