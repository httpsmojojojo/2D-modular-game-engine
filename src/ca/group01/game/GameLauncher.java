package ca.group01.game;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameLauncher extends JPanel {

    private static Game game = new Game();
    public static final boolean DEBUG = false;

    public GameLauncher() {
        setLayout(new BorderLayout());
        add(game, BorderLayout.CENTER);
        setMaximumSize(Game.DIMENSIONS);
        setMinimumSize(Game.DIMENSIONS);
        setPreferredSize(Game.DIMENSIONS);
        game.debug = DEBUG;
        game.isApplet = true;
    }

    public void start() {
        game.start();
    }

    public void stop() {
        game.stop();
    }

    public static void main(String[] args) {
        game.setMinimumSize(Game.DIMENSIONS);
        game.setMaximumSize(Game.DIMENSIONS);
        game.setPreferredSize(Game.DIMENSIONS);

        game.frame = new JFrame(Game.NAME);

        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLayout(new BorderLayout());

        game.frame.add(game, BorderLayout.CENTER);
        game.frame.add(new GameLauncher(), BorderLayout.CENTER);

        game.frame.setResizable(false);
        game.frame.setLocationRelativeTo(null);
        game.frame.setVisible(true);

        game.windowHandler = new WindowHandler(game);
        game.debug = DEBUG;

        game.start();
    }
}
