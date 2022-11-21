package Curs__3;

public class BoxingMatch {
    private fightWin f1;
    private fightWin f2;

    public BoxingMatch(fightWin f1, fightWin f2) {
        this.f1 = f1;
        this.f2 = f2;
    }


    public String fightWin() {
        while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            f1.attack(f2);
            if (f2.getHealth() <= 0)
                return f1.toString();
                {
                    f2.attack(f1);
                }

            }
            return f2.toString();
        }

    }

