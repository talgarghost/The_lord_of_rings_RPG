public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        PlayerDirector director = new PlayerDirector();

        // === 1. СОЗДАЕМ АРАГОРНА (Через Директора) ===
        FactionFactory menForge = new MenFactory();
        Pleyer aragorn = director.buildHeroOfLight(builder, menForge);

        System.out.println("=== ВОИНСТВО СВЕТА ===");
        System.out.println(aragorn);
        aragorn.getWeapon().attack();
        aragorn.getArmor().defend();

        System.out.println("\n--------------------\n");

        // === 2. СОЗДАЕМ КОРОЛЯ-ЧАРОДЕЯ (Через Директора) ===
        FactionFactory nazgulForge = new NazgulFactory();
        Pleyer witchKing = director.buildHeroOfEvil(builder, nazgulForge);

        System.out.println("=== ВОИНСТВО ТЬМЫ ===");
        System.out.println(witchKing);
        witchKing.getWeapon().attack();
        witchKing.getArmor().defend();

        System.out.println("\n--------------------\n");

        // === 3. СОЗДАЕМ КАСТОМНОГО ГЕРОЯ (Вручную через Строителя) ===
        // Берем фабрику эльфов
        FactionFactory elvenForge = new ElvenFactory();

        // Собираем уникального персонажа цепочкой вызовов, минуя Директора
        Pleyer customHero = builder.setName("Леголас")
                .setAge(2931)
                .setRacee(Racee.elf) // Используем твой enum Racee
                .setFaction(Faction.Rivendel) // Используем твой enum Faction
                .setWeapon(elvenForge.CreatWeapon())
                .setArmor(elvenForge.CreatArmor())
                .build();

        System.out.println("=== КАСТОМНЫЙ ГЕРОЙ ===");
        System.out.println(customHero);
        customHero.getWeapon().attack();
        customHero.getArmor().defend();
    }
}