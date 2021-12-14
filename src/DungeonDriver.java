import java.util.Scanner;
public class DungeonDriver
{
    public static void main (String [] args)
    {
        //create 50 monster objects
        Player Hermina = new Player(100, 25, false);
        Monster carrot = new Monster(35, 15,1, false, "Carrot");
        Monster potatoe = new Monster(50, 15,2, false, "potatoe");
        Monster candyCane = new Monster(10, 45,3, false, "candyCane");
        Monster broccoli = new Monster(45, 15,4, false, "broccoli");
        Monster shrimp = new Monster(60, 22,5, false, "shrimp");
        Monster cod = new Monster(60, 22,6, false, "cod");
        Monster bass = new Monster(60, 22,7, false, "bass");
        Monster salmon = new Monster(60, 22,8, false, "salmon");
        Monster brusselSprouts = new Monster(54, 15,9, false, "brusselSprouts");
        Monster pufferFish = new Monster(25, 99,10, false, "pufferFish");
        Monster animalLiver = new Monster(25, 25,11, false, "animalLiver");
        Monster teaLeaves = new Monster(99, 1,12, false, "teaLeaves");
        Monster cake = new Monster(15, 65,13, false, "cake");
        Monster carrotCake = new Monster(25, 55,14, false, "carrotCake");
        Monster chocolateCake = new Monster(5, 75,15, false, "chocolateCake");
        Monster iceCream = new Monster(50, 50,16, false, "iceCream");
        Monster Gelato = new Monster(55, 55,17, false, "Gelato");
        Monster hamburger = new Monster(50, 30,18, false, "hamburger");
        Monster steak = new Monster(54, 12,19, false, "steak");
        Monster cheeseburger = new Monster(30, 50,20, false, "cheeseburger");
        Monster mozzarella = new Monster(50, 50,21, false, "mozarella");
        Monster pizza = new Monster(25, 25,22, false, "pizza");
        Monster toastedWellToast = new Monster(50, 25,23, false, "toastedWellToast");
        Monster toastedGreatToast = new Monster(75, 25,24, false, "toastedGreatToast");
        Monster perfectlyToastedToast = new Monster(100, 25,25, false, "perfectlyToastedToast");
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

    }
    public static void Dungeon()
    {
        int[] encounters = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        double randomNumber = Math.floor(Math.random()*100);
        for(int i=0;i > encounters.length;i++)
        {
            if()
            {
                Encounters.runEncounter(randomNumber);
            }
        }
    }

    // health calculator:
    ///code cod eocwersdfsesfd
    // monsterName.changeHealth(30)
}
// TODO: 12/14/2021 create the code that runs with each encounter, you are going to have to import the scanner class and have it take in inputs into a userInputChecker method  
// TODO: 12/14/2021 from there you'll have to add a description between battles, but you'll essentially repeat the dungeon method and description 5 times and if the person does
// TODO: 12/14/2021 not defeat perfectly toasted toast then it will run one of the end game methods that use System.exit. You'll have to use