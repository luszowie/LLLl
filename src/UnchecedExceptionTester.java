import java.sql.SQLOutput;

public class UnchecedExceptionTester {
    public static void main(String[] args) {
        UnchecedExceptionTester unchecedExceptionTester = new UnchecedExceptionTester();
        int i = unchecedExceptionTester.getNumberFromString("9b");
        if (i != -1);
        System.out.println("oto nasz liczba pomnożona przez 99" + (i * 99));
    }

    public int getNumberFromString (String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("Coś poszło nie tak upewnij sie że przerkazywany string jest liczbą");

        }
        return -1;
    }
}
