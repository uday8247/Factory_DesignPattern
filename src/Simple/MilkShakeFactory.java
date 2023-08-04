package Simple;

import java.util.HashMap;
import java.util.Map;

public class MilkShakeFactory {
    private Map<MilkShakeNames,MilkShake> milkShakeMenu;

    public MilkShakeFactory() {
        buildMilkShakeMenu();
    }

    public MilkShake prepare(MilkShakeNames milkShakeNames){
        if(milkShakeNames==null){
            System.out.println("Please provide milkshake name to prepare!!");
            return null;
        }
        System.out.println(milkShakeNames + "ready!");
        return milkShakeMenu.get(milkShakeNames);
    }

    private void buildMilkShakeMenu() {
        milkShakeMenu = new HashMap<>();

        milkShakeMenu.put(MilkShakeNames.OREOMILKSHAKE,new OreoMilkShake());
        milkShakeMenu.put(MilkShakeNames.BUTTERSCOTCHMILKSHAKE,new ButterScotchMilkShake());
        milkShakeMenu.put(MilkShakeNames.VANILLAMILKSHAKE,new VanillaMilkShake());

    }
}
