/*
Kevin Baron
3/16/13
Critter Project
Ninja5
*/

import java.awt.Color;
import java.util.Random;

public class Ninja5 extends Critter {
	
	private int corner = 0;
	private int infectCount = 0;
	private int stepCount = 0;
	public static final Random r = new Random();
	public static final String[] phrases = {"HAHAHAHAHAHA", "Losers", "Ninja"};
	
	public Ninja5() {
		corner = r.nextInt(4);
	}//eo Ninja5 constructor
	
	public Color getColor() {
		return Color.GRAY;//new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}//eo getColor
	
	public String toString() {
		return "5";// + infectCount;
		/*
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
		}//eo if else*/
	}//eo toString
	
	public Action getMove(CritterInfo info) {
		infectCount = info.getInfectCount();
		stepCount++;
		switch (corner) {
			case 0:
				if (info.getFront() == Neighbor.OTHER) {
					return Action.INFECT;
				}//eo if
				if (info.getDirection() == Direction.NORTH) {
					if ((info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.LEFT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.RIGHT;
				}
				if (info.getDirection() == Direction.EAST) {
					if ((info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.RIGHT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.LEFT;
				}
				if (info.getDirection() == Direction.SOUTH) {
					if (info.getRight() == Neighbor.OTHER || info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
						if (info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.RIGHT;
					}//eo if
					return Action.LEFT;
				}//eo if
				if (info.getDirection() == Direction.WEST) {
					if (info.getLeft() == Neighbor.OTHER || info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
						if (info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.LEFT;
					}//eo if
					return Action.RIGHT;
				}//eo if
			case 1:
				if (info.getFront() == Neighbor.OTHER) {
					return Action.INFECT;
				}//eo if
				if (info.getDirection() == Direction.EAST) {
					if ((info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.LEFT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.RIGHT;
				}
				if (info.getDirection() == Direction.SOUTH) {
					if ((info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.RIGHT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.LEFT;
				}
				if (info.getDirection() == Direction.WEST) {
					if (info.getRight() == Neighbor.OTHER || info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
						if (info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.RIGHT;
					}//eo if
					return Action.LEFT;
				}//eo if
				if (info.getDirection() == Direction.NORTH) {
					if (info.getLeft() == Neighbor.OTHER || info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
						if (info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.LEFT;
					}//eo if
					return Action.RIGHT;
				}//eo if
			case 2:
				if (info.getFront() == Neighbor.OTHER) {
					return Action.INFECT;
				}//eo if
				if (info.getDirection() == Direction.SOUTH) {
					if ((info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.LEFT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.RIGHT;
				}
				if (info.getDirection() == Direction.WEST) {
					if ((info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.RIGHT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.LEFT;
				}
				if (info.getDirection() == Direction.NORTH) {
					if (info.getRight() == Neighbor.OTHER || info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
						if (info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.RIGHT;
					}//eo if
					return Action.LEFT;
				}//eo if
				if (info.getDirection() == Direction.EAST) {
					if (info.getLeft() == Neighbor.OTHER || info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
						if (info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.LEFT;
					}//eo if
					return Action.RIGHT;
				}//eo if
			case 3:
				if (info.getFront() == Neighbor.OTHER) {
					return Action.INFECT;
				}//eo if
				if (info.getDirection() == Direction.WEST) {
					if ((info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.LEFT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.RIGHT;
				}
				if (info.getDirection() == Direction.NORTH) {
					if ((info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) && (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL)) {
						return Action.RIGHT;
					}//eo if
					if (info.getFront() == Neighbor.EMPTY) {
						return Action.HOP;
					}//eo if
					return Action.LEFT;
				}
				if (info.getDirection() == Direction.EAST) {
					if (info.getRight() == Neighbor.OTHER || info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
						if (info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.RIGHT;
					}//eo if
					return Action.LEFT;
				}//eo if
				if (info.getDirection() == Direction.SOUTH) {
					if (info.getLeft() == Neighbor.OTHER || info.getRight() == Neighbor.SAME || info.getRight() == Neighbor.WALL) {
						if (info.getLeft() == Neighbor.SAME || info.getLeft() == Neighbor.WALL) {
							return Action.INFECT;
						}//eo if
						return Action.LEFT;
					}//eo if
					return Action.RIGHT;
				}//eo if
		}//eo switch
		return Action.HOP;
	}//eo getMove
	
}//eo Ninja5