import java.util.ArrayList;

public class BattleshipGame {
    private ArrayList<Battleship> battleships;
    private GameHelper helper;
    private int numGuesses;
    public BattleshipGame() {
        battleships = new ArrayList<>();
        helper = new GameHelper();
        numGuesses = 0;
        battleships.add(new Battleship("Battleship 1", 2, 3));
        battleships.add(new Battleship("Battleship 2", 3, 5));
    }
    public void play() {
        while (!battleships.isEmpty()) {
            int guessRow = helper.getUserInput("Enter guess row: ");
            int guessColumn = helper.getUserInput("Enter guess column: ");
            numGuesses++;
            boolean hitOrSunk = false;
            for (Battleship battleship : battleships) {
                if (battleship.checkGuess(guessRow, guessColumn)) {
                    System.out.println("Hit or Sunk " + battleship.getName() + "!");
                    battleships.remove(battleship);
                    hitOrSunk = true;
                    break;
                }
            }
            if (!hitOrSunk) {
                System.out.println("Miss!");
            }
        }
        System.out.println("Congratulations! You sank all battleships in " + numGuesses + " guesses." +  " it took you long enough!");
    }
    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame();
        game.play();
    }
}
