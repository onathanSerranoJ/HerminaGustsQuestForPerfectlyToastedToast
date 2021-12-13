public class Player implements stats
{
    private int health;
    private final int ACTIONS_PER_TURN = 1;
    private boolean isDead;
    private static int timesHealthLost;


    public Player(int health, boolean isDead)
    {
        this.health = health;
        this.isDead = isDead;

    }
    public void attack()
    {

    }
    public void
    public boolean checkIfDead(int health)
    {
        if (health <= 0) {
            isDead = true;
        } else {
            isDead = false;
        }
        return isDead;
    }
    public String giveStats()
    {
        System.out.println();
    }
}
