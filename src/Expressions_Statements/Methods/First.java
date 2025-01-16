package Expressions_Statements.Methods;

public class First
{
    public static void main(String[] args)
    {
        int playerPosition = calculateHighScorePosition(1000);
        System.out.println(playerPosition);
        System.out.println(displayHighScorePosition("Ahsan",playerPosition));
    }


    public static String displayHighScorePosition(String playersName,int playerPosition)
    {

        return playersName+" managed to get into position "+playerPosition+" on the high score list.";
    }

    public static int calculateHighScorePosition(int playersScore)
    {
        if(playersScore>=1000)
        {
            return 1;
        }
        else if(playersScore>=500 && playersScore<1000)
        {
            return 2;
        }
        else if(playersScore>=100 && playersScore<500)
        {
            return 3;
        }
        else
        return 4;
    }


}
