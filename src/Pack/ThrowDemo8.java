package Pack;

import java.util.Scanner;

public class ThrowDemo8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validKey = false;

        while (!validKey) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                validKey = true; // Если исключение не выброшено, ключ считается валидным
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter a valid key.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowDemo8 demo = new ThrowDemo8();
        demo.getKey();
    }
}