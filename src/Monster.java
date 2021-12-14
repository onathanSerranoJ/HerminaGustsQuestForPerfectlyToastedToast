public class Monster  implements stats
{
    private int health;
    private int attack;
    private int monsterNumber;
    private boolean isDead;
    private String name;
    private static int encountersBeaten;

    public Monster(int health, int attack, int monsterNumber, boolean isDead, String name)
    {
        this.name = name;
        this.health = health;
        this.isDead = isDead;
        this.attack = attack;
    }

    public void changeHealth(int damageHeal)
    {
        health += damageHeal;
    }
    public void setHealth(int heal)
    {
        health = heal;
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
    public int getEncountersBeaten()
    {
        return encountersBeaten;
    }

    public boolean checkIfDead(int health)
    {
        if(health <= 0)
        {
            isDead = true;
            encountersBeaten++;
        }
        else
        {
            isDead = false;
        }
        return isDead;
    }
    public String giveStats()//a toString method
    {
        return "Monster health: " + health +"\nPlayer attack: " + attack +"\nMonster name: " + name +"\nMonster number: " + monsterNumber  +"\nis Monster dead: " + isDead;
    }
}
