import java.util.ArrayList;
import.java.util.Random;

	//Enumerated type that describes the direction pent moves 
	enum Direction
	{
	UP, DOWN, LEFT, RIGHT
	}

public class Game
{
	//Constructors
	public Game(Board initBoard, /*Hscore currentHScores,*/ ArrayList<Pentomino> pieces)
	{
		
	}
	
	
	/*Play method
	//@return Gives the highscore including the current game
	//Plays the game
	
	public HScore play()
	{
		
	}
	*/
	
	//Checking Methods
	/**@param direc Takes the direction game wants to move the pent 
	 * @return True if move is valid, false if not
	 */
	public boolean checkOverlap(Direction direc)
	{
		return false;
	}
	
	/**@param direc Takes the direction game wants to rotate the pent 
	 * @return True if move is valid, false if not
	 */
	public boolean checkRotate(Direction direc)
	{
		return true;
	}
	
	/** @return True if game over, else false
	 * If any overlap, game over
	 */
	public boolean gameOverChecker()
	{
		return false;
	}

	/**@return void
	 * Makes the pentomino fall by 1 block after a set amount of time has elapsed
	 */
	private void pentFaller()
	{
		//A check involving the timer needs to be added

	}
	
	/** @param direc indicates the direction the pentomino should move
	 * @return void
	 * Moves the block in a direction
	 */
	//works way easier: only adjust the position of the pentomino
	//use assertion to prevent a method from feeding direc == UP (consult the book)
	private void move(Direction direc)
	{
		assert direc == LEFT || direc == RIGHT || direc == DOWN;

		if (direc == LEFT && checkMove(LEFT)==true)
			coord.addX(-1);
			
		else if (direc == RIGHT && checkMove(RIGHT)==true)
			coord.addX(1)
			
		else if (direc == DOWN){
			//pentFaller x2-faster
		}
	}
	
	/**@param direc indicates the direction the pentomino should move
	 * @return void
	 * Turns the block in a direction
	 */
	//good job ;)
	private void turn(Direction direc)
	{
		if (direc == LEFT && checkRotate(LEFT)==true){
			this.pentUsed.rotate();
			this.pentUsed.rotate();
			this.pentUsed.rotate();
		}
		else if (direc == RIGHT && checkRotate(RIGHT)==true){
			this.pentUsed.rotate();
		}
		
	}
	
	/**@return void
	 * Places the block in the bottom most row (with a block)
	 */
	private void fallPlace()
	{
		if (nBoard.pentFits(this.item, coord)) 
		{
			for (int i=0; i< this.item.getWidth(); i++) 
			{
				for (int j=0; j< this.item.getHeight(); j++) 
				{
					if (this.item.getElement(i,j) != 0) 
					{
						mMatrix.setCell(i + coord.getX(), j + coord.getY(), this.item.getElement(i,j));
					}
				}
			}
			mListPents.add (pent.clone());
		}
	}
	
	/**@return void
	 * Chooses from 1 of the pentominos and places it at the top of the board
	 */
	//Maybe consider "smart placing" of initial pentomino
	//good job ;)
	private void pentPicker()
	{
		Random random = new Random();
		int index = random.nextInt(blocks.size());
		Pentomino pentUsed = blocks.get(index);
		pentPosition = new Position(field.getWidth()/2,0);
		
	}
	
	
	/**@return void
	 * Checks for filled rows (bottom up) and removes them
	 */
	//works but full rows are just being assigned value of 0
// row mover needs to be called
	private void rowClearer()
	{
		for (int i=field.getHeight()-1; i=0;i--){
			while (field.isRowFilled(i) == true){
				field.clearRow(i);
				while (field.isRowEmpty(i) == false)
				rowMover(i);
			}
		}	
	}
	
	/**@return void
	 * After a row is cleared, replaces cleared rows with above rows.
	 * Does this until rows with all zeros is going to be moved
	 */
	//good idea to write a helper method!
	private void rowMover(int index)
	{
		field.moveRows()
	}

	//Contains a Board
	private Board field;
	
	//Contains the list of highscores
	//private HScore highScore;
	
	//Contains all the tetris pieces
	private ArrayList<Pentomino> blocks;
	
	//Contains the current Pentomino the game is using
	private Pentomino pentUsed;
	
	//Contains the (x,y) of a Pentomino
	private Position pentPosition;
	
	//Timer for the falling of tetris block
	//private Clock fallTimer;

	private MatrixHandler mMatrix;