package pacman.game.instance;

public class Blinky extends Ghost {

    // CONSTRUCTORS -------------------- //

    public Blinky(String name, int x_position, int y_position, int speed, Player player) {
        super(name, x_position, y_position, speed, player);
    }

    // METHODS ------------------------- //

    @Override
    public void move(double delta) {
        // move...
    }
}
