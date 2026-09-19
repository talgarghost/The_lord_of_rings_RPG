public class PlayerDirector {

    // Передаем фабрику (FactionFactory) в качестве параметра
    public Pleyer buildHeroOfLight(Builder builder, FactionFactory factory) {
        return builder.setName("Aragorn")
                .setAge(87)
                .setRacee(Racee.Men)
                .setFaction(Faction.Gondor)
                // Фабрика сама создаст MenWeapon и MenArmor
                .setWeapon(factory.CreatWeapon())
                .setArmor(factory.CreatArmor())
                .build();
    }

    public Pleyer buildHeroOfEvil(Builder builder, FactionFactory factory) {
        return builder.setName("Witch-king")
                .setAge(4000)
                .setRacee(Racee.nazgul)
                .setFaction(Faction.Mordor)
                // Обязательно выдаем оружие и броню, чтобы сборка не упала с ошибкой
                .setWeapon(factory.CreatWeapon())
                .setArmor(factory.CreatArmor())
                .build();
    }
}