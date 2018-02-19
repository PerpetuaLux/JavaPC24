package Java24;

public class TileTester {

    public static void main(String[] args) {
        testTile();
    }

    public static void testTile() {
        Tile test = new Tile('z', 10);
        printTile(test);
    }

    public static void printTile(Tile test) {
        char letter = test.getLetter();
        int value = test.getValue();
        System.out.printf("Letter: %c, Value: %d\n", letter, value);
    }
}
