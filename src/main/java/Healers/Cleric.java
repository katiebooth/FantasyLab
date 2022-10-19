package Healers;

public class Cleric implements IHeal{

    String name;
    HealingTool healingTool;

    public Cleric(String name, HealingTool healingTool) {
        this.name = name;
        this.healingTool = healingTool;
    }

    public String getName() {
        return name;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    @Override
    public String heal(HealingTool healingTool) {
        return "Cleric has chosen "+healingTool.getName()+ " to heal";
    }
}
