package gits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CekPalindrom {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter String: ");
            String line = System.console().readLine();
            if (line.isEmpty())
                break;

            System.out.println(checkPalindrom(line));
        }
    }

    public static boolean checkPalindrom(String line) {
        String reverse = ReverseString.reverseString(line);
        if (line.toLowerCase().equals(reverse.toLowerCase()))
            return true;
        else
            return false;
    }

    @Test
    public void test() {
        assertEquals(true, checkPalindrom("Katak"));
        assertEquals(false, checkPalindrom("Ubi"));
    }

}
