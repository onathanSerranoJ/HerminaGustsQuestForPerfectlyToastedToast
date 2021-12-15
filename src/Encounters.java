import java.util.Scanner;
public class Encounters
{
    private String difficulty;
    private static int turn;
    private int monsterNumber;
    public Encounters(String difficulty, int monsterNumber)
    {
        this.difficulty = difficulty;
        this.monsterNumber = monsterNumber;
    }
    //create 50 monster objects and the player object
    Player Hermina = new Player(100, 25, false);
    static Monster carrot = new Monster(35, 15,1, false, "Carrot");
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
    public static void fail()
    {
        System.out.println("You were unable to find perfectly toasted toast, may you find something else to eat");
        System.exit(0);
    }
    public static void win()
    {
        System.out.println("You won, You can finally eat breakfast");
        System.exit(0);
    }
    public static void lose()
    {
        System.out.println("You died, You will never know what good toast tastes like");
        System.exit(0);
    }

    public static void runEncounter(double monsterNumber)
    {
        Scanner encounterInput = new Scanner(System.in);
        if(monsterNumber == 1)
        {
            System.out.println("You find yourself presented with an evil looking carrot looking for some fist-a-cuffs");

        }
        if(monsterNumber == 2)
        {
            System.out.println("Traversing the dungeon floor you find a menacingly looking potatoe eyeing you strangely");
        }
        if(monsterNumber == 3)
        {
            System.out.println("candy cane");
        }
        if(monsterNumber == 4)
        {
            System.out.println("Broccolli");
        }
        if(monsterNumber == 5)
        {
            System.out.println("Shrimp");
        }
        if(monsterNumber == 6)
        {
            System.out.println("cod");
        }
        if(monsterNumber == 7)
        {
            System.out.println("bass");
        }
        if(monsterNumber == 8)
        {
            System.out.println("salmon");
        }
        if(monsterNumber == 9)
        {
            System.out.println("BrusselSprouts");
        }
        if(monsterNumber == 10)
        {
            System.out.println("pufferFish");
        }
        if(monsterNumber == 11)
        {
            System.out.println("animalLiver");
        }
        if(monsterNumber == 12)
        {
            System.out.println("teaLeaves");
        }
        if(monsterNumber == 13)
        {
            System.out.println("cake");
        }
        if(monsterNumber == 14)
        {
            System.out.println("carrot cake");
        }
        if(monsterNumber == 15)
        {
            System.out.println("chocolate");
        }
        if(monsterNumber == 16)
        {
            System.out.println("iceCream");
        }
        if(monsterNumber == 17)
        {
            System.out.println("gelato");
        }
        if(monsterNumber == 18)
        {
            System.out.println("hamburger");
        }
        if(monsterNumber == 19)
        {
            System.out.println("steak");
        }
        if(monsterNumber == 20)
        {
            System.out.println("cheeseBurger");
        }
        if(monsterNumber == 21)
        {
            System.out.println("Mozarella");
        }
        if(monsterNumber == 22)
        {
            System.out.println("pizza");
        }
        if(monsterNumber == 23)
        {
            System.out.println("toastedWellToast");
        }
        if(monsterNumber == 24)
        {
            System.out.println("toastedGreatToast");
        }
        if(monsterNumber == 25)
        {
            System.out.println("perfectlyToastedToast");
        }
    }
}