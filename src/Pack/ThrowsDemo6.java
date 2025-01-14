package Pack;

public class ThrowsDemo6 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo6 demo = new ThrowsDemo6();
        demo.printMessage("validKey"); // Правильное значение
        demo.printMessage(null); // Нулевое значение
    }
}