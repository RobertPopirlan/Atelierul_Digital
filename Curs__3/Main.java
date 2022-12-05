package Curs__3;

public class Main {
    public static void main(String[] args) {
        fightWin f1 = new fightWin("f1", 200, 15);
        fightWin f2 = new fightWin("f2", 100, 10);
        BoxingMatch BoxingMatch = new BoxingMatch(f1, f2);
        String winner = BoxingMatch.fightWin();
        System.out.println(winner);
    }
}
