package Java24;

public class Tile {
    private char letter;
    private int value;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", value=" + value +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return letter == tile.letter &&
                value == tile.value;
    }
}
