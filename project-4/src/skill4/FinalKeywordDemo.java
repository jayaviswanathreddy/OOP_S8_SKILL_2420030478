package skill4;

import java.util.ArrayList;

public class FinalKeywordDemo {
    private final int number;

    public FinalKeywordDemo(int value) {
        this.number = value;
    }

    public final void displayNumber() {
        System.out.println("Final variable number = " + number);
    }

    public static void main(String[] args) {
        FinalKeywordDemo demo = new FinalKeywordDemo(42);
        demo.displayNumber();

        final ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List content: " + list);

        list.set(1, "Mango");
        System.out.println("Modified list: " + list);
    }
}