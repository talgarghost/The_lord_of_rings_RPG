public class NazgulFactory implements FactionFactory{
    @Override
    public Weapon CreatWeapon() { return new NazgulWeapon(); }

    @Override
    public Armor CreatArmor() { return new NazgulArmor(); }
}
