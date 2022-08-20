package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    //A posição de uma peça recém criada deve ser inicialmente nula, pois deverá mostrar que essa
    //peça ainda não foi colocada no tabuleiro

    public Piece(Board board) {
        this.board = board;
        //Se não colocasse o valor nulo, ainda assim o java setaria a posição como nula
        position = null;
    }


    protected Board getBoard() {
        return board;
    }


    
    
    
}
