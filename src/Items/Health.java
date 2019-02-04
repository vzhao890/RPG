package Items;

public class Health extends items {
    String[] giveHealth = {
            "Band-Aid",//Drop Rate:75%    health: 10
            "Health Pot",//Drop Rate:50%   health: 20
            "Mom's Chicken Soup",//Drop Rate:30%   health: 30
            "Rainbow Health Drop"};//Drop Rate:1% Max health: +50 Health Recovery:50

    public int giveHealth(String name) {
        if(name.equalsIgnoreCase("Band-Aid"))
        {
            return 10;
        }
        else if(name.equalsIgnoreCase("Health Pot"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("Mom's Chicken Soup"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("Rainbow Health Drop"))
        {
            return 100;
        }else{
            return 0;
        }
    }

    public int giveDefense() {
        return 0;
    }


}
