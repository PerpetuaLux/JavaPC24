package Java24;

public class Virus {
    static int virusCount = 0;
    private int newSeconds = 0;
    
    public Virus() {
        virusCount++;
    }
    
    static int getVirusCount() {
        return virusCount;
    }
    int getNewSeconds() {
        return newSeconds;
    }
    void setNewSeconds(int args) {
        if (args > 60 && args < 100)
        newSeconds = args;
    }
}