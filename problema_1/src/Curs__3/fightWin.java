package Curs__3;

public class fightWin {
    private String name;
    private int health;
    private int dmgPerattck;



    public void attack(fightWin fightWin) {
        fightWin.health=health-this.dmgPerattck;
    }
    public fightWin(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.dmgPerattck= damagePerAttack;
    }

    public int getHealth(){
        return health;
    }
 public String toString(){
        return this.name;
 }
}

