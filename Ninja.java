/*
Kevin Baron
3/15/13
Critter Project
Ninja
*/

import java.awt.Color;
import java.util.Random;

public class Ninja extends Critter {
	
	private int infectCount = 0;
	private int stepCount = 0;
	public static final Random r = new Random();
	public static final String[] phrases = {"HAHAHAHAHAHA", "Losers", "Ninja"};
	
	public Color getColor() {
		return Color.PINK;//new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}//eo getColor
	
	public String toString() {
		
		return "N";// + infectCount;
		/*
		if (stepCount < 100) {
			return "N            N";
		} else if (stepCount < 600) {
			return "";
		} else {
			String result = "";
			int rand = r.nextInt(100);
			if (rand == 0) {
				result = phrases[r.nextInt(phrases.length)];
			} else if (rand <= 2) {
				for (int i = 0; i <= stepCount / 100; i++) {
					result += (char) r.nextInt(255);
				}//eo for
			}//eo if else block
			return result;
		}//eo if else*/
	}//eo toString
	
	public Action getMove(CritterInfo info) {
		infectCount = info.getInfectCount();
		stepCount++;
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}//eo if
		if (info.getLeft() == Neighbor.OTHER) {
			return Action.LEFT;
		}//eo if
		if (info.getRight() == Neighbor.OTHER) {
			return Action.RIGHT;
		}//eo if
		if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
			if (info.getRight() == Neighbor.WALL || info.getRight() == Neighbor.SAME) {
				return Action.LEFT;
			}//eo if
			if (info.getLeft() == Neighbor.WALL || info.getLeft() == Neighbor.SAME) {
				return Action.RIGHT;
			}//eo if
			return Action.RIGHT;
		}//eo if
		if (info.getBack() == Neighbor.OTHER) {
			return Action.HOP;
		}//eo if
		if (info.getLeft() == Neighbor.WALL || info.getLeft() == Neighbor.SAME) {
			return Action.RIGHT;
		}//eo if
		return Action.HOP;
	}//eo getMove
	
}//eo Ninja