/*
 * Program: Demonstrate Overflow when Casting to a Smaller Type
 */

public class ByteOverflowDemo {
    public static void main(String[] args) {
        int largeNum = 260;
        byte smallNum = (byte) largeNum; // narrowing causes overflow

        System.out.println("Original int value: " + largeNum);
        System.out.println("After casting to byte (overflowed): " + smallNum);
    }
}
