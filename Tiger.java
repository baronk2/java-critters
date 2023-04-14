/*
Kevin Baron
3/15/13
Critter Project
Tiger
*/

import java.awt.Color;

public class Tiger extends Critter {
	
	private int leftHopCount = -1;
	
	public Color getColor() {
		return Color.YELLOW;
	}//eo getColor
	
	public String toString() {
		return "T";
	}//eo toString
	
	public Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.WALL) {
			return Action.RIGHT;
		} else if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else {
			leftHopCount++;
			if (leftHopCount % 6 == 5) {
				return Action.LEFT;
			} else {
				return Action.HOP;
			}//eo if else
		}//eo if else block
	}//eo getMove
	
}//eo Tiger