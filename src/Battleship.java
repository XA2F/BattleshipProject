public class Battleship {
    private String name;
    private int row;
    private int column;
    public Battleship(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
    }
    public boolean checkGuess(int guessRow, int guessColumn) {
        return guessRow == row && guessColumn == column;
    }
    public String getName() {
        return name;
    }
}
