import java.util.Random;
import java.util.Scanner;
public class DungeonDriver
{
    public static void main (String [] args)
    {
//if scan.nextLine().equals(ur quit command) or scan.nextInt() == int for quit command,{ System.exit(0);}

        Scanner gameChecker = new Scanner(System.in);
        System.out.println("Welcome to Hermina Gust's Quest for Perfectly Toasted Toast\n input any button to continue");
        String userInput = gameChecker.nextLine();
        System.out.println("Game starting:");
        System.out.println("There once was an adventurer who wanted toast, but no matter he made his toast it would always be way too toasted for his toast needs." +
                " In order to find the perfectly toasted toast he travels the world in search of what he believes to be the perfect toast. Lucky for him he lives in a world" +
                " where demons like to possess really good food(This is also the reason no one knows how to cook, including Hermina Gust)." +
                " With this quest in mind he goes from dungeon to dungeon looking for a demon that has possessed the perfectly toasted toast.\n input anything to continue.");
        userInput = gameChecker.nextLine();
        Dungeon();
        Dungeon();
        Dungeon();
        System.out.println("A las it seems your breakfast is incomplete this morning. May next morning be better than this one, for now you shall go hungry with no toast to eat with your egg");
        Encounters.fail();

    }
    public static void Dungeon()
    {
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(25) + 1;
        Encounters.runEncounter(randomNumber);

    }

    // health calculator:
    ///code cod eocwersdfsesfd
    // monsterName.changeHealth(30)
}
// TODO: 12/14/2021 create the code that runs with each encounter, you are going to have to import the scanner class and have it take in inputs into a userInputChecker method
// TODO: 12/14/2021 from there you'll have to add a description between battles, but you'll essentially repeat the dungeon method and description 5 times and if the person does
// TODO: 12/14/2021 not defeat perfectly toasted toast then it will run one of the end game methods that use System.exit. You'll have to use to use