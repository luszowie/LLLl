import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionTester {

    public static void main(String[] args) {
        CheckedExceptionTester checkedExceptionTester = new CheckedExceptionTester();
        checkedExceptionTester.urlTesterByTryCatch("http://wszib.edu.pl");
        //checkedExceptionTester.urlTesterByThrows("http://wszib.edu.pl");

    }
    public void urlTesterByTryCatch (String urlString) {
        try {
            URL url = new URL(urlString);
            System.out.println("tutaj nie wejdziemy");
            System.out.println("Protokół " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        }catch (MalformedURLException murle){
            System.out.println("Obsługujemy wyjątek...");
            murle.printStackTrace();

        }
        System.out.println("Program działa nadal");
    }

    public void urlTesterByThrows(String urlStrng) throws MalformedURLException {
        URL url = new URL (urlStrng);
        System.out.println("tutaj nie wejdziemy");
        System.out.println("Protokół " + url.getProtocol());

    }
}





