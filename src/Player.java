public class Player implements stats
{
    private int health;
    private int attack;
    private boolean isDead;


    public Player(int health, int attack, boolean isDead)
    {
        this.health = health;
        this.attack = attack;
        this.isDead = isDead;
    }

    public void changeHealth(int damageHeal)
    {
        health += damageHeal;
    }
    public int getHealth()
    {
        return health;
    }
    public int getAttack()
    {
        return attack;
    }
    public boolean getIsDead()
    {
        return isDead;
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
    public String giveStats()// a toString method
    {
        return "Player health: " + health +"\nPlayer attack: " + attack + "\nis player dead: " + isDead;
    }
}