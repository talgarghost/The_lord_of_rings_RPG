public class Builder {
    String name;
    Racee racee; // Из твоего старого проекта BFME1[cite: 2]
    Faction faction; // Из твоего старого проекта BFME1[cite: 2]
    int age;

    // Добавляем поля продуктов от нашей Абстрактной Фабрики
    Weapon weapon;
    Armor armor;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setRacee(Racee racee) { // Немного поправил регистр (setracee -> setRacee) для красоты
        this.racee = racee;
        return this;
    }

    public Builder setFaction(Faction faction) {
        this.faction = faction;
        return this;
    }

    public Builder setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }


    public Builder setArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public Pleyer build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Имя персонажа обязательно!");
        }
        if (age < 18) {
            throw new IllegalStateException("Персонаж должен быть строго 18 лет или старше!");
        }
        if (weapon == null || armor == null) {
            throw new IllegalStateException("Ошибка: Вы забыли выдать персонажу стартовое оружие и броню через Фабрику!");
        }

        return new Pleyer(this);
    }
}