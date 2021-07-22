package gits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ReverseString {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter String: ");
            String line = System.console().readLine();
            if (line.isEmpty())
                break;

            System.out.println(reverseString(line));
        }
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    @Test
    public void test() {
        assertEquals("Aplikasi", reverseString("isakilpA"));
        assertEquals("12345Test", reverseString("tseT54321"));
    }
}
