package Items;

public class Mysticals extends items {
    String[] giveMysticals = {
            "SmolFire",//What the player is starts with   Cost: 10 Mana Dmg:10
            "BiggerFire", //Drop Rate:25%                 Cost: 20 Mana Dmg:30
            "Napalm",//Drop Rate:10%                      Cost: 50 Mana Dmg:50
            "SuperNova"}; //Drop Rate:1%                  Cost: 75 Mana Dmg:100
    public int giveAttack() {
        return 0;
    }

    public int giveDefense() {
        return 0;
    }

    public int givemp() {
        return 0;
    }
}
