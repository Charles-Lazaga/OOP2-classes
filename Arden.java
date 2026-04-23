import java.util.Random;

public class Arden extends Hero {
    private Random rand = new Random();

    public Arden() {
        super("Arden",
              120, //HP
              120, //MANA
              "Bow"); // WEAPON
    }

    @Override
    public String[] getSkillList() {
        return new String[]{
            "Arrow Shot (0–10 dmg, +10 Mana)",
            "Piercing Arrow (15–25 dmg, -20 Mana)",
            "Rain of Arrows (25–35 dmg, -40 Mana)"
        };
    }

    @Override
    public int useSkill(int index) {
        int dmg = 0;
        switch (index) {
            case 0: //Arrow Shot
                dmg = rand.nextInt(11);
                mana += 10;
                break;
            case 1: //Piercing Arrow
                if (mana < 20) return -1;
                mana -= 20;
                dmg = 15 + rand.nextInt(11);
                break;
            case 2: //Rain of Arrows
                if (mana < 40) return -1;
                mana -= 40;
                dmg = 25 + rand.nextInt(11);
                break;
        }
        return dmg;
    }
}