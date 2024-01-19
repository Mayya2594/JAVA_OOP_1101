package Lesson_3.Exp001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        //#region ex1 Demo

        // BaseHero hero3 = new Magician();
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest();
        // System.out.println(hero4.getInfo());

        //#endregion

        //#region ex2 Attack

        // hero3.Attack(hero4);

        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        //#endregion

        //#region Teams

        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
        int druidCount = 0;

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(3);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    priestCount ++;
                    break;
                case 1:
                    teams.add(new Magician());
                    magicianCount ++;
                    break;
                default:
                    teams.add(new Druid());
                    druidCount ++;
                    break;
            }
            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicianCount: %d priestCount: %d druidCount: %d \n", magicianCount, priestCount, druidCount);
    }
}
