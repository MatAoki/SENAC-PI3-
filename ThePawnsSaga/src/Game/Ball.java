/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author acronuslg_sup
 */
import java.awt.Graphics2D;

public class Ball {
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Game game;

	public Ball(Game game) {
		this.game= game;
	}

	void move() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > game.getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > game.getHeight() - 30)
			ya = -1;

		x = x + xa;
		y = y + ya;
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, 30, 30);
                /*
                g.fillOval(x+30, y, 5, 5);
                g.fillOval(x-30, y, 5, 5);
                g.fillOval(x, y-30, 5, 5);
                g.fillOval(x, y+30, 5, 5);
                */
	}
        
        public boolean colidiu(Racquet player, Ball inimigo){
            if (player.x + 50 > inimigo.x && player.x - 50 < inimigo.x)
                if (player.y + 45 > inimigo.y && player.y - 45 < inimigo.y)
                    return true;
            return false;
        }
}