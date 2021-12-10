public class Player implements stats
{
    private int health;
    private int actionsPerTurn;
    private boolean isDead;
    private String[] inventory = new String[50];
    private static int timesHealthLost;
    private static int encountersBeaten;


    public Player(int health, int actionsPerTurn, boolean isDead, String[] inventory, int timesHealthLost, int encountersBeaten)
    {
        this.health = health;
        this.actionsPerTurn = actionsPerTurn;
        this.isDead = isDead;
        this.inventory = inventory;

    }
    public void setUpInventory(String[] inventory)
    {
        for (int index = 0; index < inventory.length; index++)
        {
            inventory[index].equals("empty space");
        }
    }
    public void useItem(String item)
    {

    }
    public boolean checkIfDead(int health)
    {
        if(health <= 0)
        {
            isDead = true;
        }
        else
        {
            isDead = false;
        }
        return isDead;
    }
    public String giveStats()
    {

    }
}
