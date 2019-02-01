package Items;

public class Health extends items {
    String[] giveDefense = {
            "Band-Aid",//Drop Rate:1%    health: 5
            "Health Pot",//Drop Rate:1%   health: 15
            "Mom's Chicken Soup",//Drop Rate:1%   health: 25
            "Rainbow Health Drop"};//Drop Rate:1% overall health: +5

    public int giveAttack() {
        return 0;
    }

    public int giveDefense() {
        return 0;
    }


}
