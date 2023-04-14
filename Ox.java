/*
Kevin Baron
3/11/13
Critter Project
*/

import java.awt.Color;

public class Bear extends Critter {
	
	private Color color;
	
	public Bear(boolean polar) {
		if (polar
	}//eo
	
	public Action getMove (CritterInfo info) {
		
		return Action.HOP;
	}//eo getMove
	
	public Color getColor() {
		return Color.Red;
	}//eo getColor
	
	public String toString() {
		return "B";
	}//eo toString
	
}//eo Ox