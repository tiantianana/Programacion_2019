//Importing the Locale object to change the default configuration 
//of the computer to English
import java.util.Locale;

//Importing the GameBoardGUI library
import edu.uc3m.game.GameBoardGUI;

public class TestingGUI {

	public static void main(String[] args) {

		
		// Showing how to change the color of cells
		for (int ii = 0; ii < Constants.BOARD_WIDTH; ii++) {
			for (int jj = 0; jj < Constants.BOARD_HEIGHT; jj++) {
				board.gb_setSquareColor(ii, jj, 0, 0, 0);
			}
		}
		// Changing the player name on the GUI
		board.gb_setTextPlayerName("Testing GUI " + enemy.getX());
		// Changing the name of one of the text labels
		board.gb_setTextPointsUp("Points");
		// Adding a sprite to the board, it is done in three steps
		// 1) adding it. Parameters are a unique id, the file containing the
		// image and true if we want it to be on top of any other at the same
		// position
		board.gb_addSprite(0, enemy.getSprite(), true);
		// 2) placing the sprite at a board position. Parameters are the sprite
		// id, the x and the y
		board.gb_moveSpriteCoord(0, enemy.getX(), enemy.getY());
		// 3) making the sprite visible. Parameters are the id and true to show
		// it or false to hide it
		board.gb_setSpriteVisible(0, true);
		// Main game loop. This will be executing until we finish. As an example
		// we use an infinite loop
		// Finally we make the board visible
		board.setVisible(true);
		boolean keepRunning = true;
		boolean keepMoving = false;
		do {
			// The gb_getLastAction() method returns a String with the last
			// action the user performed in the GUI. Examples are "right", "up",
			// "space". See the documentation for more details.
			// trim() removes any heading or tailing space
			String lastAction = board.gb_getLastAction().trim();
			// We only execute it if the user did something or we need to keep
			// moving
			if (lastAction.length() > 0 || keepMoving) {
				// Printing the action on the console to check it is correct
				board.gb_println(lastAction);
				// Checking its value. We are not controlling the borders.
				switch (lastAction) {
				case "right":
					if(enemy.getX()+5 < 170){
						enemy.move(Constants.DIR_E, 1);	
					}
					break;/*
				case "down":
					enemy.move(Constants.DIR_S, 1);
					break;
				case "up":
					enemy.move(Constants.DIR_N, 1);
					break;*/
				case "left":
					
						enemy.move(Constants.DIR_W, 1);
					}
					break;
				case "tab":
					keepMoving = false;
					break;
				case "space":
					keepMoving = true;
					break;
				}
				if (keepMoving) {
					// Calculating the next direction, we use the remainder to
					// go from 15 to 0
					int nextDir = (enemy.getDirection() + 1) % 16;
					enemy.move(nextDir, 1);
				}
				// Now moving
				board.gb_setSpriteImage(enemy.getId(), enemy.getImage());
				board.gb_moveSpriteCoord(enemy.getId(), enemy.getX(), enemy.getY());

			}
			/*
			 * This makes the program to pause for 50 milliseconds. If not this
			 * loop will run so fast that the pressed keys will be lost.
			 * Invoking the sleep() method of the Thread class can produce an
			 * exception (an error). This can happen so often that Java forces
			 * us to either explicitly say that we don�t care or to handle it.
			 * The "throws InterruptedException" in the header of the main
			 * method is the way to say that we don�t care. If the error appears
			 * the program will stop. A better solution would have been to
			 * handle the exception using a try-catch sentence. But it is out of
			 * the scope of this course.
			 * 
			 */
			try {
				Thread.sleep(10L);
			} catch(Exception e) {
				System.out.println("He fallado pero el profe no habia corregido esto!");
			}

		} while (keepRunning );
	}

}