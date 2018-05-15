/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Racquet {
	int x = 370;
	int xa = 0;
        int y = 370;
	int ya = 0;
        boolean vivo = true;
        
	private Game game;

	public Racquet(Game game) {
		this.game= game;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-30)
			x = x + xa;
                if (y + ya > 0 && y + ya < game.getHeight()-30)
			y = y + ya;
	}

	public void paint(Graphics2D g) {
            if (vivo){
		g.fillRect(x, y, 50, 50);
                /*
                g.fillRect(x+50, y, 10, 10);
                g.fillRect(x-50, y, 10, 10);
                g.fillRect(x, y-50, 10, 10);
                g.fillRect(x, y+50, 10, 10);
                */
            }
	}

	public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                if (xa<0 )
                    xa = 0;
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                if (xa>0 )
                    xa = 0;
            }
            if (e.getKeyCode() == KeyEvent.VK_UP){
                if (ya<0)
                    ya = 0;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                if (ya>0)
                    ya = 0;
            }
            if (e.getKeyCode() == KeyEvent.VK_F5){
                this.vivo = true;
            }
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -2;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 2;
                if (e.getKeyCode() == KeyEvent.VK_UP)
			ya = -2;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			ya = 2;
	}
}