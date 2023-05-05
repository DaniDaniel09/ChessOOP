package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Piece Class. It is an abstract class from which all the actual pieces are inherited.
 * It defines all the function common to all the pieces
 * The move() function an abstract function that has to be overridden in all the inherited class
 * It implements Cloneable interface as a copy of the piece is required very often
 * @author ashish1294/Daniel Zanon Lopez
 * @version JDK 20
 * @since JDK 7
 * @see <a href="https://github.com/ashish1294/ChessOOP">Proyecto original en Github</a>
 */
public abstract class Piece implements Cloneable{

	//Member Variables
	private int color;
	private String id=null;
	private String path;

    /**
     *
     */
    protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();  //Protected (access from child classes)

    /**
     *
     * @param pos
     * @param x
     * @param y
     * @return
     */
    public abstract ArrayList<Cell> move(Cell pos[][],int x,int y);  //Abstract Function. Must be overridden
	
	//Id Setter

    /**
     *
     * @param id
     */
	public void setId(String id)
	{
		this.id=id;
	}
	
	//Path Setter

    /**
     *
     * @param path
     */
	public void setPath(String path)
	{
		this.path=path;
	}
	
	//Color Setter

    /**
     *
     * @param c
     */
	public void setColor(int c)
	{
		this.color=c;
	}
	
	//Path getter

    /**
     *
     * @return
     */
	public String getPath()
	{
		return path;
	}
	
	//Id getter

    /**
     *
     * @return
     */
	public String getId()
	{
		return id;
	}
	
	//Color Getter

    /**
     *
     * @return
     */
	public int getcolor()
	{
		return this.color;
	}
	
	//Function to return the a "shallow" copy of the object. The copy has exact same variable value but different reference

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
	public Piece getcopy() throws CloneNotSupportedException
	{
		return (Piece) this.clone();
	}
}