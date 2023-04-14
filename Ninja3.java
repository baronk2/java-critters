/*
Kevin Baron
3/16/13
Critter Project
Ninja3
*/

import java.awt.Color;
import java.util.Random;

public class Ninja3 extends Critter {
	
	private int infectCount = 0;
	private int stepCount = 0;
	public static final Random r = new Random();
	public static final String[] phrases = {"HAHAHAHAHAHA", "Losers", "Ninja"};
	
	public Color getColor() {
		return /*Color.MAGENTA;*/new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}//eo getColor
	
	public String toString() {
		//return "3";// + infectCount;
		if (stepCount < 10) {
			return "   N             N          N";
		} else if (stepCount < 200) {
			return "";
		} else if (stepCount < 250) {
			return "   N  I  N  J  A";
		} else if (stepCount < 400) {
			return "";
		} else if (stepCount < 450) {
			return "######";
		} else if (stepCount < 600) {
			return "";
		} else if (stepCount < 650) {
			return "O0oo0O";
		} else if (stepCount < 700) {
			return "";
		} else if (stepCount < 750) {
			return ".,.,.,";
		} else {
			String result = "";
			int rand = r.nextInt(10000);
			if (rand == 0) {
				result = phrases[r.nextInt(phrases.length)];
			} else if (rand <= 2) {
				for (int i = 0; i <= stepCount / 100; i++) {
					result += (char) r.nextInt(255);
				}//eo for
			}//eo if else block
			return result;
		}//eo if else
	}//eo toString
	
	public Action getMove(CritterInfo info) {
		infectCount = info.getInfectCount();
		stepCount++;
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}//eo if
		if (info.getFront() == Neighbor.EMPTY) {
			if (info.getBack() == Neighbor.OTHER || (info.getLeft() == Neighbor.OTHER && info.getRight() == Neighbor.OTHER)) {
				return Action.HOP;
			}//eo if
		}//eo if
		if (info.getRight() == Neighbor.OTHER) {
			return Action.RIGHT;
		}//eo if
		if (info.getLeft() == Neighbor.OTHER) {
			return Action.LEFT;
		}//eo if
		if (info.getFront() == Neighbor.EMPTY) {
			if (info.getBack() == Neighbor.WALL && info.getLeft() == Neighbor.SAME && info.getRight() == Neighbor.SAME) {
				return Action.INFECT;
			}//eo if
			int rand = r.nextInt(1000);
			if (rand == 0 && (info.getLeft() != Neighbor.WALL && info.getRight() != Neighbor.WALL && info.getBack() != Neighbor.WALL)) {
				return Action.HOP;
			}//eo if
			if (info.getRight() == Neighbor.EMPTY && info.getLeft() == Neighbor.EMPTY) {
				if (info.getBack() == Neighbor.EMPTY) {
					int rand3 = r.nextInt(10);
					if (rand3 == 0) {
						return Action.LEFT;
					}//eo if
					if (rand3 == 1) {
						return Action.RIGHT;
					}//eo if
					return Action.HOP;
				}//eo if
				int rand2 = r.nextInt(2);
				if (rand2 == 0) {
					return Action.RIGHT;
				}//eo if
				return Action.LEFT;
			}//eo if
			if (info.getRight() == Neighbor.EMPTY) {
				return Action.RIGHT;
			}//eo if
			if (info.getLeft() == Neighbor.EMPTY) {
				return Action.LEFT;
			}//eo if
			return Action.INFECT;
		}//eo if
		if (info.getRight() == Neighbor.WALL || info.getRight() == Neighbor.SAME) {
			return Action.LEFT;
		}//eo if
		if (info.getLeft() == Neighbor.WALL || info.getLeft() == Neighbor.SAME) {
			return Action.RIGHT;
		}//eo if
		if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		}//eo if
		return Action.HOP;
	}//eo getMove
	
}//eo Ninja3