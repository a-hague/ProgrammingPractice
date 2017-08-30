import java.util.Scanner;
import java.awt.Point;

public class breakice
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean[][] board;
        Point[] moves;
        int numGames;
        int boardDimensions;
        int numMoves;

        numGames = sc.nextInt();

        for(int i=0; i<numGames; i++)
        {
            boardDimensions = sc.nextInt();
            board = new boolean[boardDimensions][boardDimensions];

            numMoves = sc.nextInt();
            moves = new Point[numMoves];

            for(int j=0; j<numMoves; j++)
            {
                moves[j] = new Point(sc.nextInt(), sc.nextInt());
            }

            int numInvalidMoves = EvaluateBoard(board, boardDimensions, moves);

            System.out.println("Strategy #" + (1+i) + " " + numInvalidMoves);
            System.out.println();
        }

        sc.close();
    }

    static int EvaluateBoard(boolean[][] board, int boardDimensions, Point[] moves)
    {
        int numInvalidMoves = 0;

        for(Point move : moves)
        {
            if(board[move.x][move.y]) 
            {
                numInvalidMoves++;
                continue;
            }

            board[move.x][move.y] = true;
            boolean boardIsInEquilibrium = false;

            while(!boardIsInEquilibrium)
            {
                boardIsInEquilibrium = true;

                for(int i=0; i<boardDimensions; i++)
                {
                    for(int j=0; j<boardDimensions; j++)
                    {
                        if(!CheckRow(board, boardDimensions, i) && !CheckColumn(board, boardDimensions, j))
                        {
                            boardIsInEquilibrium = false;
                            board[i][j] = true;
                        }
                    }
                }
            }
        }

        return numInvalidMoves;
    }

    static boolean CheckRow(boolean[][] board, int boardDimensions, int row)
    {
        boolean isCompleteRow = true;

        for(int i=0; i<boardDimensions; i++)
        {
            if(board[i][row] == true) isCompleteRow = false;
        }

        return isCompleteRow;
    }

    static boolean CheckColumn(boolean[][] board, int boardDimensions, int column)
    {
        boolean isCompleteColumn = true;

        for(int i=0; i<boardDimensions; i++)
        {
            if(board[column][i] == true) isCompleteColumn = false;
        }

        return isCompleteColumn;
    }
}