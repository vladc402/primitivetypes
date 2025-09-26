import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Информация о примитивных типах через классы обертки
        System.out.println("byte: размер = " + Byte.BYTES + " байт, мин = " + Byte.MIN_VALUE + ", макс = " + Byte.MAX_VALUE);
        System.out.println("short: размер = " + Short.BYTES + " байт, мин = " + Short.MIN_VALUE + ", макс = " + Short.MAX_VALUE);
        System.out.println("int: размер = " + Integer.BYTES + " байт, мин = " + Integer.MIN_VALUE + ", макс = " + Integer.MAX_VALUE);
        System.out.println("long: размер = " + Long.BYTES + " байт, мин = " + Long.MIN_VALUE + ", макс = " + Long.MAX_VALUE);
        System.out.println("float: размер = " + Float.BYTES + " байт, мин = " + Float.MIN_VALUE + ", макс = " + Float.MAX_VALUE);
        System.out.println("double: размер = " + Double.BYTES + " байт, мин = " + Double.MIN_VALUE + ", макс = " + Double.MAX_VALUE);
        System.out.println("char: размер = " + Character.BYTES + " байт, мин = " + (int) Character.MIN_VALUE + ", макс = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: размер зависит от JVM (примерно 1 бит)");

        System.out.println("\nТеперь введём значения:");

        byte b = Byte.parseByte(scanner.nextLine());
        short s = Short.parseShort(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());
        long l = Long.parseLong(scanner.nextLine());
        float f = Float.parseFloat(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        char c = scanner.nextLine().charAt(0);
        boolean bool = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("\nВы ввели:");
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + bool);
    }
}
