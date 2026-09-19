public class ElvenFactory implements FactionFactory{
    @Override
    public Weapon CreatWeapon() { return new elfWeapon(); }

    @Override
    public Armor CreatArmor() { return new elfArmor(); }
}

