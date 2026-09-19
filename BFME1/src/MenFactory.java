public class MenFactory implements FactionFactory{
    @Override
    public Weapon CreatWeapon() { return new MenWeapon(); }

    @Override
    public Armor CreatArmor() { return new MenArmor(); }
}
