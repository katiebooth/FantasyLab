package Healers;

public enum HealingTool {
    POTION("potion", 20),
    HERBS("herbs", 10);

    String name;
    int healingPower;
    HealingTool(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String getName() {
        return name;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
