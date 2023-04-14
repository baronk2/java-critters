/*
Kevin Baron
3/16/13
Critter Project
Ninja6
*/

import java.awt.Color;
import java.util.Random;

public class Ninja6 extends Critter {
	
	private int corner = 0;
	private int personality = 0;
	private int infectCount = 0;
	private int stepCount = 0;
	public static final Random r = new Random();
	public static final String[] phrases = {"HAHAHAHAHAHA", "Losers", "Ninja"};
	
	public Ninja6() {
		corner = r.nextInt(4);
		personality = r.nextInt(3);
	}//eo Ninja5 constructor
	
	public Color getColor() {
		switch (personality) {
			case 0:
				return Color.GRAY;
			case 1:
				return Color.BLUE;
			case 2: return
				Color.MAGENTA;
		}//eo switch
		return Color.GRAY;//new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}//eo getColor
	
	public String toString() {
		return "6";// + infectCount;
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
		switch (personality) {
			case 0:
				switch (corner) {
					case 0://Ninja5
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
			case 1://Ninja4
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
				return Action.HOP;
			case 2://Ninja3
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
					int rand = r.nextInt(100);
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
		}//eo switch
		return Action.HOP;
	}//eo getMove
	
}//eo Ninja6