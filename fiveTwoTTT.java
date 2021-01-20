import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class fiveTwoTTT {

	
	static ArrayList<Integer> playerOnePositions = new ArrayList<Integer>();
	static ArrayList<Integer> playerTwoPositions = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		
		char [][] gameBoard = { {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '}, 
				  			    {'-', '|', '-', '|', '-', '|', '-', '|', '-'},
								{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
							    {'-', '|', '-', '|', '-', '|', '-', '|', '-'},
								{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
								{'-', '|', '-', '|', '-', '|', '-', '|', '-'},
								{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
								{'-', '|', '-', '|', '-', '|', '-', '|', '-'},
								{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '}};
		
		printGameBoard(gameBoard);
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your placement player X (1-25):");
			int playerOnePos = scan.nextInt();
			while(playerOnePositions.contains(playerOnePos) || playerTwoPositions.contains(playerOnePos))
			{
				System.out.println("Already taken! Enter a correct position");
				playerOnePos = scan.nextInt();
			}
			placePiece(gameBoard, playerOnePos, "player1");
			
			printGameBoard(gameBoard);
			//checks for the winner
			String result = checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			
			System.out.println("Enter your placement player 0 (1-25):");
			int playerTwoPos = scan.nextInt();
			while(playerOnePositions.contains(playerTwoPos) || playerTwoPositions.contains(playerTwoPos))
			{
				System.out.println("Already taken! Enter a correct position");
				playerTwoPos = scan.nextInt();
			}
			placePiece(gameBoard, playerTwoPos, "player2");
			
			printGameBoard(gameBoard);
			//checks for the winner
			 result = checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
	}
}

	public static void printGameBoard(char[] [] gameBoard) {
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void placePiece(char[] [] gameBoard, int pos, String user) {
		
		char symbol = ' ';
		
		if(user.equals("player1")) {
			symbol = 'X';
			playerOnePositions.add(pos);
		} else if(user.equals("player2")) {
			symbol = '0';
			playerTwoPositions.add(pos);
		}
		
		switch(pos) {
		case 1:
			gameBoard[0][0] = symbol;
		    break;
		case 2:
			gameBoard[0][2] = symbol;
		    break;
		case 3:
			gameBoard[0][4] = symbol;
		    break;
		case 4:
			gameBoard[0][6] = symbol;
		    break;
		case 5:
			gameBoard[0][8] = symbol;
		    break;

		case 6:
			gameBoard[2][0] = symbol;
		    break;
		case 7:
			gameBoard[2][2] = symbol;
		    break;
		case 8:
			gameBoard[2][4] = symbol;
		    break;
		case 9:
			gameBoard[2][6] = symbol;
		    break;
		case 10:
			gameBoard[2][8] = symbol;
		    break;

		case 11:
			gameBoard[4][0] = symbol;
		    break;
		case 12:
			gameBoard[4][2] = symbol;
		    break;
		case 13:
			gameBoard[4][4] = symbol;
		    break;
		case 14:
			gameBoard[4][6] = symbol;
		    break;
		case 15:
			gameBoard[4][8] = symbol;
		    break;

		case 16:
			gameBoard[6][0] = symbol;
		    break;
		case 17:
			gameBoard[6][2] = symbol;
		    break;
		case 18:
			gameBoard[6][4] = symbol;
		    break;
		case 19:
			gameBoard[6][6] = symbol;
		    break;
		case 20:
			gameBoard[6][8] = symbol;
		    break;

		case 21:
			gameBoard[8][0] = symbol;
		    break;
		case 22:
			gameBoard[8][2] = symbol;
		    break;
		case 23:
			gameBoard[8][4] = symbol;
		    break;
		case 24:
			gameBoard[8][6] = symbol;
		    break;
		case 25:
			gameBoard[8][8] = symbol;
		    break;

		default:
			break;
	}
}
	 public static String checkWinner() {
		 //rows
		 List<Integer> firstRow = Arrays.asList(1, 2, 3, 4, 5);
		 List<Integer> secRow = Arrays.asList(6, 7, 8, 9, 10);
		 List<Integer> thirdRow = Arrays.asList(11, 12, 13, 14, 15);
		 List<Integer> forthRow = Arrays.asList(16, 17, 18, 19, 20);
		 List<Integer> fifthRow = Arrays.asList(21, 22, 23, 24, 25);
		 //columns
		 List<Integer> firstCol = Arrays.asList(1, 6, 11, 16, 21);
		 List<Integer> secCol = Arrays.asList(2, 7, 12, 17, 22);
		 List<Integer> thirdCol = Arrays.asList(3, 8, 13, 18, 23);
		 List<Integer> forthCol = Arrays.asList(4, 9, 14, 19, 24);
		 List<Integer> fifthCol = Arrays.asList(5, 10, 15, 20, 25);
		 //diagonal
		 List<Integer> cross1 = Arrays.asList(1, 7, 13, 19, 25);
		 List<Integer> cross2 = Arrays.asList(5, 9, 13, 17, 21);
		 
		 List<List> winningConditions = new ArrayList<List>();
		 winningConditions.add(firstRow);
		 winningConditions.add(secRow);
		 winningConditions.add(thirdRow);
		 winningConditions.add(forthRow);
		 winningConditions.add(fifthRow);
		 
		 winningConditions.add(firstCol);
		 winningConditions.add(secCol);
		 winningConditions.add(thirdCol);
		 winningConditions.add(forthCol);
		 winningConditions.add(fifthCol);
		 
		 winningConditions.add(cross1);
		 winningConditions.add(cross2);
		 
		 for(List l : winningConditions) {
			 if(playerOnePositions.containsAll(l)) {
				 return "Player X wins!!";
			 } else {
				List l2 = l;
				if(playerTwoPositions.containsAll(l2)){
					 return "Player 0 wins!!!";
				 } else if(playerOnePositions.size() + playerTwoPositions.size() == 25) {
					 return "TIE!";
				 }
			}
		 }
		 return "";
	 }
}

