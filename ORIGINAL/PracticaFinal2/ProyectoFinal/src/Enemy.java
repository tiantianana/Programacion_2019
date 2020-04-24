
/**
 * A simple enemy with fields and methods allowing it to move in polar
 * coordinates
 * 
 * @author Angel Garcia Olaya - PLG - UC3M
 * @since November 2018
 * @version 1.0
 *
 */
public class Enemy {
	/*
	 * All the fields are defined as private so they cannot directly changed by
	 * any external program
	 * 
	 */
	/** The x coordinate of the enemy */
	private int x;
	/** The y coordinate of the enemy */
	private int y;
	/** The enemy ID */
	private int id;
	/** The image file of the enemy */
	private String image;
	/** The current direction of the enemy to show the right image */
	private int direction;

	public String getSprite() {
		return "player.png";
	}
	/**
	 * Constructor, we use decomposition to make it easier to understand. We do
	 * not provide any no-argument constructor as we want the objects to be
	 * created always with all the fields filled
	 * 
	 * @param x
	 * @param y
	 * @param id
	 * @param image
	 * @param direction
	 */
	public Enemy(int x, int y, int id, String image, int direction) {
		setX(x);
		setY(y);
		setId(id);
		setImage(image);
		setDirection(direction);
	}

	/**
	 * Sets the value of the field, the only way we will allow enemies to move
	 * will be with the move method, so we will do it private
	 */
	private void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	/**
	 * Sets the value of the field, the only way we will allow enemies to move
	 * will be with the move method, so we will do it private
	 */
	private void setY(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}

	/**
	 * Sets the value of the field, this will not change once created, so it
	 * will be private,
	 */
	private void setId(int id) {
		this.id = id;
	}

	/**
	 * Sets the value of the field
	 */
	public void setImage(String im) {
		this.image = im;
	}

	/**
	 * We do it private as we will only allow to change direction by using the
	 * move method
	 * 
	 * @param direction
	 */
	private void setDirection(int direction) {
		
	}

	/**
	 * Returns the value of the field
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Returns the value of the field
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Returns the value of the field
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Returns the value of the field. The image depends on the direction
	 */
	public String getImage() {
		// To add a 0 in case direction is <=9
		String directionCode;
		if (direction <= 9) {
			directionCode = "0" + direction;
		} else {
			directionCode = "" + direction;
		}
		// We use the split method to separate the name and the file extension
		String[] fileName = this.image.split("\\.");
		// Creating the file name using the prefix, the direction code and the
		// extension
		return fileName[0] + directionCode + "." + fileName[1];
	}

	/**
	 * Returns the value of the field
	 */
	public int getDirection() {
		return this.direction;
	}

	/**
	 * Method to move the enemy to a new position, receives the direction and
	 * the steps and calculates the new (x,y)
	 * 
	 * @param direction
	 *            the direction to move
	 * @param steps
	 *            the steps to move in that direction
	 * @return true if it can move in that direction, false otherwise
	 */
	public boolean move(int direction, int steps) {
		// If parameters are wrong we don't move and return false. 
		if (direction < 0 || direction > 16 || steps < 1) {
			return false;
		} else {
			// changing the direction
			this.direction = direction;
			// calculating the new x and y
			this.x = this.x + Constants.MOVES[direction][0] * steps;
			this.y = this.y + Constants.MOVES[direction][1] * steps;
			return true;
		}
	}

}