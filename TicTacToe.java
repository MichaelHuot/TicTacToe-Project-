// Michael Huot
// Tic Tac Toe Project

// Import Statements
import java.util.*;

// Create class 
public class TicTacToe
{ 
   // Create method to print board
   public static void PrintBoard(char [][] gameBoard)
   {
      System.out.println(gameBoard[0][0]+ " | " + gameBoard[0][1]+ " | " + gameBoard[0][2] +  
                         "\n--+---+--");
      System.out.println(gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] +
                         "\n--+---+--");
      System.out.println(gameBoard[2][0] + " | " +  gameBoard[2][1] + " | " + gameBoard[2][2]);
   }
   
   // Create method to get input from user on where to place mark 
   public static void PlayerTurn( char [][] gameBoard, int Row, int Col)
   {  

 
         if (Row == 0 && Col == 0)
           {
            gameBoard[0][0] = 'X';
            
           }
         else if (Row == 1 && Col == 0)
           {
            gameBoard[1][0] = 'X';
          
           }
         else if (Row == 2 && Col == 0)
           {
            gameBoard[2][0] = 'X';
            
           }
         else if (Row == 0 && Col == 1)
           {
            gameBoard[0][1] = 'X';
         
           }   
         else if (Row == 1 && Col == 1)
           {
            gameBoard[1][1] = 'X';
           
           }
         else if (Row == 2 && Col == 1)
           {
            gameBoard[2][1] = 'X';
     
           }  
         else if (Row == 0 && Col == 2)
           {
            gameBoard[0][2] = 'X';
            
           } 
         else if (Row == 1 && Col == 2)
           {
            gameBoard[1][2] = 'X';
        
           }  
         else if (Row == 2 && Col == 2)
           {
            gameBoard[2][2] = 'X';
           
           }


         
   }
  // Create method for computers turn
  public static void CompTurn(char [][] gameBoard, int Row, int Col)
  {

         if (Row == 0 && Col == 0 )
           {
            gameBoard[0][0] = 'O';
       
           }
         else if (Row == 1 && Col == 0)
           {
            gameBoard[1][0] = 'O';
           }
         else if (Row == 2 && Col == 0)
           {
            gameBoard[2][0] = 'O';
           
           }
         else if (Row == 0 && Col == 1)
           {
            gameBoard[0][1] = 'O';
        
           }   
         else if (Row == 1 && Col == 1)
           {
            gameBoard[1][1] = 'O';
     
           }
         else if (Row == 2 && Col == 1)
           {
            gameBoard[2][1] = 'O';
   
           }  
         else if (Row == 0 && Col == 2)
           {
            gameBoard[0][2] = 'O';
         
           } 
         else if (Row == 1 && Col == 2)
           {
            gameBoard[1][2] = 'O';
         
           }  
         else if (Row == 2 && Col == 2)
           {
            gameBoard[2][2] = 'O';

           } 
         System.out.println();
      
  }
  // Create method to check if the move the player wants to make is valid
  public static boolean Check(char[][]gameBoard, int a, int b)
  {
     if (gameBoard[a][b] == ' ')
     {
      return true;
     }
     else
     {
      return false;
     }
  }
  
  // Create method to check if there is a winner
  public static boolean Winner(char [][] gameBoard, char mark)
  {   
      if (gameBoard[0][0] == mark && gameBoard[0][1] == mark && gameBoard[0][2] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
          
         }
      else if (gameBoard[1][0] == mark && gameBoard[1][1] == mark && gameBoard[1][2] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[2][0] == mark && gameBoard[2][1] == mark && gameBoard[2][2] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[0][0] == mark && gameBoard[1][0] == mark && gameBoard[2][0] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[1][0] == mark && gameBoard[1][1] == mark && gameBoard[1][2] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[2][0] == mark && gameBoard[2][1] == mark && gameBoard[2][2] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[0][0] == mark && gameBoard[1][1] == mark && gameBoard[2][2] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[0][2] == mark && gameBoard[1][1] == mark && gameBoard[2][0] == mark)
         {
            System.out.println("The winner is " + mark + "'s.");
            return true;
         }
      else if (gameBoard[0][0] != ' ' && gameBoard[0][1] != ' ' && gameBoard[0][2] != ' ' && gameBoard[1][0] != ' ' && gameBoard[1][1] != ' ' && gameBoard[1][2] != ' ' && gameBoard[2][0] != ' ' && gameBoard[2][1] != ' ' && gameBoard[2][2] != ' ')
         {
            System.out.println("It's a draw! \n");
            return true;
         }
      else 
         {
            return false;
         }
  }
  
  // Game code  
  static Scanner scan = new Scanner(System.in);
  public static void main (String [] arg)
  {
   // Create game board
   System.out.println("Welcome to tic tac toe. You are X's and the computer is O's.");
   char[][] gameBoard = {{' ',' ',' '}, 
                         {' ',' ',' '}, 
                         {' ',' ',' '}};
   char playerMark = 'X';
   char compMark = 'O';                      
   
   // Create loop to go until there is a winner
   while (true)
   {
      
      int playerRow;
      int playerCol;
      
      while (true)
      {
         // Get input from the user 
         System.out.print("Enter a value 1-3 for your row: ");
         playerRow = (scan.nextInt() - 1);
         System.out.print("Enter a value 1-3 for your column: ");
         playerCol = (scan.nextInt() - 1);
         if (Check(gameBoard, playerRow, playerCol))
            break;
         else
         {
            System.out.print("Looks like a mark is already there. Try again. \n");
         }
      }
      PlayerTurn(gameBoard, playerRow, playerCol);
      PrintBoard(gameBoard); 
      if (Winner(gameBoard, playerMark))
         break;    
      int compRow;
      int compCol;
      while (true)
      {
         Random rand = new Random();
         compRow = rand.nextInt(3);
         compCol = rand.nextInt(3);
         if (Check(gameBoard, compRow, compCol))
            break;
      }   
      
      CompTurn(gameBoard, compRow, compCol);   
      PrintBoard(gameBoard);  
      if (Winner(gameBoard, compMark))
         break;
   }       
                          
  }

}