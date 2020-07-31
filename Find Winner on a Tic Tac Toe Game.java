class Solution {
    public String tictactoe(int[][] moves)
    {
        char[][] boards = new char[3][3];
    int turn = 1;
    String winner = null;
    
    //putting all the moves to the board
    for(int[] move : moves){
        if(turn %2 != 0){
            boards[move[0]][move[1]] = 'X';
        }
        else{
            boards[move[0]][move[1]] = 'O';
        }
        turn++;
    }

    
    for(int i=0;i<boards.length; i++){
        
        //check all rows
        if(boards[i][0]=='X'&&boards[i][1]=='X'&&boards[i][2]=='X'){
            winner = "A";
        }
        else if(boards[i][0]=='O'&&boards[i][1]=='O'&&boards[i][2]=='O'){
            winner = "B";
        }
        
        //check all columns
        if(boards[0][i]=='X'&&boards[1][i]=='X'&&boards[2][i]=='X'){
            winner = "A";
        }
        else if(boards[0][i]=='O'&&boards[1][i]=='O'&&boards[2][i]=='O'){
            winner = "B";
        }
        
        //check diagonals
        if(boards[0][0]=='X'&&boards[1][1]=='X'&&boards[2][2]=='X' || boards[0][2]=='X'&&boards[1][1]=='X'&&boards[2][0]=='X'){
            winner = "A";
        }
        else if(boards[0][0]=='O'&&boards[1][1]=='O'&&boards[2][2]=='O' || boards[0][2]=='O'&&boards[1][1]=='O'&&boards[2][0]=='O'){
            winner = "B";
        }
        
        //if the board is full and the conditions above never met
        if(turn>9 && winner ==null){
            winner = "Draw";
        }
        //if the board isn't full and all the conditions above never met
        else if(turn<10 && winner==null){
            winner = "Pending";
        }
    }
    
    return winner;
        
    }
}