package Icons;
import javax.swing.ImageIcon;

public interface Icons {
	String iconsRep="/icons/";
	ImageIcon pawnWhite = new ImageIcon(Icons.class.getResource("pawn.png"));
	ImageIcon bishopWhite = new ImageIcon(Icons.class.getResource("bishop.png"));
	ImageIcon knightWhite = new ImageIcon(Icons.class.getResource("knight.png"));
	ImageIcon towerWhite = new ImageIcon(Icons.class.getResource("tower.png"));
	ImageIcon queenWhite = new ImageIcon(Icons.class.getResource("queen.png"));
	ImageIcon kingWhite = new ImageIcon(Icons.class.getResource("king.png"));
	ImageIcon pawnBlack = new ImageIcon(Icons.class.getResource("blackPawn.png"));
	ImageIcon bishopBlack = new ImageIcon(Icons.class.getResource("blackBishop.png"));
	ImageIcon knightBlack = new ImageIcon(Icons.class.getResource("blackKnight.png"));
	ImageIcon towerBlack = new ImageIcon(Icons.class.getResource("blackTower.png"));
	ImageIcon queenBlack = new ImageIcon(Icons.class.getResource("blackQueen.png"));
	ImageIcon kingBlack = new ImageIcon(Icons.class.getResource("blackKing.png"));

}