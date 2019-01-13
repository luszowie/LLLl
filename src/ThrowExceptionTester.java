public class ThrowExceptionTester {
    public static void main(String[] args) {
        ThrowExceptionTester throwExceptionTester = new ThrowExceptionTester();


        int houers = -3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = throwExceptionTester.getNumberOfSeconds(houers);
        } catch (IllegalArgumentException iae) {
            numberOfSeconds = throwExceptionTester.getNumberOfSeconds(houers * -1);

        }
        System.out.println("Liczba secund to " + numberOfSeconds);
        }





    public int getNumberOfSeconds(int hours) {
        if (hours < 0){
            throw new IllegalArgumentException("Liczba musi być >=0" + hours);
        }
        return hours * 60 * 60;

    }

}
