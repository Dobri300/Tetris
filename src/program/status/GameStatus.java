package program.status;

public class GameStatus 
{
	public static boolean gameStarted;
	public static int[][] field = new int[20][10];
	
	
	public static void generateField()
	{
		for(int i = 0; i< field.length; i++) 
		{
			for(int j= 0; j< field[0].length; j++) 
			{
				field[i][j] = 0;
			}
			
		}
	}
}
