package Java24;

public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        AcousticModem acoustic = new AcousticModem();
        surfBoard.speed = 500_000;
        gateway.speed = 400_000;
        acoustic.speed = 300;
        System.out.println("Trying the Cable modem:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnect();
        System.out.println("Trying the DSL modem:");
        gateway.displaySpeed();
        gateway.connect();
        gateway.disconnect();
        System.out.println("Trying the Acoustic modem:");
        acoustic.displaySpeed();
        acoustic.connect();
        acoustic.disconnect();
    }
}