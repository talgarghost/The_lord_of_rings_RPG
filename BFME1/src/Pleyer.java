enum Racee { elf, Men,nazgul }
enum Faction { Gondor, Rohan, Rivendel, Mordor }

public class Pleyer {

    private final String name;
    private final int age;
    private final Racee Race;
    private final Faction faction;
    private final Weapon weapon;
    private final  Armor armor;




    public Pleyer(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.Race = builder.racee;
        this.faction = builder.faction;
    this.weapon=builder.weapon;
    this.armor=builder.armor;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Racee getRace() { return Race; }
    public Faction faction() { return faction; }
    public Armor getArmor(){return armor;}
    public Weapon getWeapon(){return weapon;}

    @Override
    public String toString() {
        return String.format("Имя: %s | Возраст: %d | Раса: %s | Фракция: %s ",
                name, age, Race, faction);
    }
}