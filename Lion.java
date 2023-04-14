/*
Kevin Baron
3/15/13
Critter Project
Lion
*/

import java.awt.Color;

public class Lion extends Critter {
	
	private int leftRightCount = -1;
	
	public Color getColor() {
		return Color.RED;
	}//eo getColor
	
	public String toString() {
		return "L";
	}//eo toString
	
	public Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else {
			leftRightCount++;
			if (leftRightCount % 4 <= 1) {
				return Action.LEFT;
			} else {
				return Action.RIGHT;
			}//eo if else
		}//eo if else block
	}//eo getMove
	
}//eo Lion