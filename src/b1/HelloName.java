package b1;

/**
 * B1 - Bai tap 1:
 * In ra "Hello <name>". Name truyen tu tham so dong lenh.
 *
 * Chay: java b1.HelloName An
 */
public class HelloName {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui long truyen ten: java b1.HelloName <name>");
            return;
        }
        System.out.println("Hello " + args[0]);
    }
}
