package gits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class HelloWorld {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nInput Number: ");
            String line = System.console().readLine();
            if (line.isEmpty())
                break;

            int number = Integer.parseInt(line);
            System.out.println(helloWorld(number));
        }
    }

    public static String helloWorld(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "Hello World";
        } else if (num % 3 == 0) {
            return "Hello";
        } else if (num % 5 == 0) {
            return "World";
        }
        return "";
    }

    @Test
    public void test() {
        // multiple of 3
        assertEquals("Hello", helloWorld(3));
        assertEquals("Hello", helloWorld(6));

        // multiple of 5
        assertEquals("World", helloWorld(5));
        assertEquals("World", helloWorld(500));

        // multiple of 15
        assertEquals("Hello World", helloWorld(15));
        assertEquals("Hello World", helloWorld(150));

        // multiple of neither 3 nor 5
        assertEquals("", helloWorld(2));
        assertEquals("", helloWorld(7));
    }
}
