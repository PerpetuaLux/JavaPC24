package Java24;

public class AcousticModem extends Modem {
    String method = "Acoustic connection";
    
    public void connect() {
        System.out.println("Connection to the Internet ...");
        System.out.println("Using a " + method);
    }
}