package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece{

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		//NW moves
		p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		p.setValues(position.getRow() - 1, position.getColumn() - 2);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//NE moves
		p.setValues(position.getRow() - 2, position.getColumn() + 1);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		p.setValues(position.getRow() - 1, position.getColumn() + 2);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SW moves
		p.setValues(position.getRow() + 2, position.getColumn() - 1);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SW moves
		p.setValues(position.getRow() + 2, position.getColumn() + 1);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		p.setValues(position.getRow() + 1, position.getColumn() +2);
		if((getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) || (getBoard().positionExists(p) && isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
	
	public String toString() {
		return"N";
	}
}
