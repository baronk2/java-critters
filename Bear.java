/*
Kevin Baron
3/11/13
Critter Project
Bear
*/

import java.awt.Color;
import java.util.Random;

public class Bear extends Critter {
	
	private Color color;
	
	public Bear(boolean polar) {
		if (polar) {
			color = Color.WHITE;
		} else {
			color = Color.BLACK;
		}//eo if else
	}//eo Bear constructor
	
	public Action getMove (CritterInfo info) {
		if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else {
			Random r = new Random();
			switch (r.nextInt(2)) {
				case 0:
					return Action.LEFT;
				case 1:
					return Action.RIGHT;
			}//eo switch
			return Action.LEFT;
		}//eo if else block
	}//eo getMove
	
	public Color getColor() {
		return color;
	}//eo getColor
	
	public String toString() {
		return "B";
	}//eo toString
	
}//eo Bear