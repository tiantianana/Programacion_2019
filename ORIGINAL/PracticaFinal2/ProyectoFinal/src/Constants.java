
/**
 * A class to store the constants of our final project. Even if can be argued
 * that constants should go inside the class (the object) that uses them to have
 * true Encapsulation, usually a specific class to store all the constants is
 * created. Constants are declared as "static" variables, which is the Java's
 * equivalent to global variables in other languages. That means that constants
 * created here can be used by any other class in this package (and by any other
 * class outside it if this class is imported) by just using Constants.<name of
 * the constant>. See the TestingGUI.java class for examples of their use.
 * 
 * @author Angel
 *
 */
public class Constants {
	// We create a constant for each of the directions
	public static final int DIR_N = 0;
	public static final int DIR_NNE = 1;
	public static final int DIR_NE = 2;
	public static final int DIR_ENE = 3;
	public static final int DIR_E = 4;
	public static final int DIR_ESE = 5;
	public static final int DIR_SE = 6;
	public static final int DIR_SSE = 7;
	public static final int DIR_S = 8;
	public static final int DIR_SSW = 9;
	public static final int DIR_SW = 10;
	public static final int DIR_WSW = 11;
	public static final int DIR_W = 12;
	public static final int DIR_WNW = 13;
	public static final int DIR_NW = 14;
	public static final int DIR_NNW = 15;

	// The move deltas for the directions: dX,dY}
	// Moving in direction i (0<=i<=15) means adding MOVES[i][0] to the
	// current x and MOVES[i][1] to the current y
	public static final int[][] MOVES = { { 0, -4 }, // DIR_N
			{ 1, -4 }, // DIR_NNE
			{ 3, -3 }, // DIR_NE
			{ 4, -1 }, // DIR_ENE
			{ 4, 0 }, // DIR_E
			{ 4, 1 }, // DIR_ESE
			{ 3, 3 }, // DIR_SE
			{ 1, 4 }, // DIR_SSE
			{ 0, 4 }, // DIR_S
			{ -1, 4 }, // DIR_SSW
			{ -3, 3 }, // DIR_SW
			{ -4, 1 }, // DIR_WSW
			{ -4, 0 }, // DIR_W
			{ -4, -1 }, // DIR_WNW
			{ -3, -3 }, // DIR_NW
			{ -1, -4 }, // DIR_NNW
	};
	
	//The size of the board
	public static final int BOARD_WIDTH = 17;
	public static final int BOARD_HEIGHT = 22;
}