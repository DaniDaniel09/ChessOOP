package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Knight Class inherited from the Piece abstract class
 * @author ashish1294/Daniel Zanon Lopez
 * @version JDK 20
 * @since JDK 7
 * @see <a href="https://github.com/ashish1294/ChessOOP">Proyecto original en Github</a>
 */
public class Knight extends Piece{
	
	//Constructor

    /**
     *
     * @param i
     * @param p
     * @param c
     */
	public Knight(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	//Move Function overridden
	//There are at max 8 possible moves for a knight at any point of time.
	//Knight moves only 2(1/2) steps

    /**
     *
     * @param state
     * @param x
     * @param y
     * @return
     */
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		possiblemoves.clear();
		int posx[]={x+1,x+1,x+2,x+2,x-1,x-1,x-2,x-2};
		int posy[]={y-2,y+2,y-1,y+1,y-2,y+2,y-1,y+1};
		for(int i=0;i<8;i++)
			if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
				if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
				{
					possiblemoves.add(state[posx[i]][posy[i]]);
				}
		return possiblemoves;
	}
}