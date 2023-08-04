package Simple;

public class Client {
    public static void main(String[] args) {
        MilkShakeFactory milkShakeFactory = new MilkShakeFactory();

        OreoMilkShake oreoMilkShake=
                (OreoMilkShake) milkShakeFactory.prepare(MilkShakeNames.OREOMILKSHAKE);

        ButterScotchMilkShake butterScotchMilkShake =
                (ButterScotchMilkShake) milkShakeFactory.prepare(MilkShakeNames.BUTTERSCOTCHMILKSHAKE);

        VanillaMilkShake vanillaMilkShake =
                (VanillaMilkShake) milkShakeFactory.prepare(MilkShakeNames.VANILLAMILKSHAKE);
    }
}
