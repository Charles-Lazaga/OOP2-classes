import java.util.Random;

public class Lyra extends Hero {
    private Random rand = new Random();

    public Lyra() {
        super("Lyra",
              100, //HP
              150, //MANA
              "Staff"); //WEAPON
    }

    @Override
    public String[] getSkillList() {
        return new String[]{
            "Magic Bolt (10–20 dmg, -15 Mana)",
            "Arcane Shield (+30 HP, -25 Mana)",
            "Meteor Strike (30–40 dmg, -50 Mana)"
        };
    }

    @Override
    public int useSkill(int index) {
        int dmg = 0;
        switch (index) {
            case 0:
                if (mana < 15) return -1;
                mana -= 15;
                dmg = 10 + rand.nextInt(11);
                break;
            case 1:
                if (mana < 25) return -1;
                mana -= 25;
                hp += 30;
                break;
            case 2:
                if (mana < 50) return -1;
                mana -= 50;
                dmg = 30 + rand.nextInt(11);
                break;
        }
        return dmg;
    }
}