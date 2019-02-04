package Items;

public class Weapons extends items {
    String[] giveWeapons = {
            "Raggity Stick",//Start Weapon     Set Dmg:100
            "Knights Blade",//Drop Rate:75%    Set Dmg:150
            "BFF Sword",//Drop Rate:30%        Set Dmg:200
            "B.O.R.K"};//Drop Rate:1%          Set Dmg:300
    public int giveAttack(String name)
    {
        if(name.equalsIgnoreCase("Raggity Stick"))
        {
            return 10;
        }
        else if(name.equalsIgnoreCase("Knights Blade"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("BFF Sword"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("B.O.R.K"))
        {
            return 100;
        }else{
            return 0;
        }
    }

    public int giveDefense() {
        return 0;
    }

    public int givemp() {
        return 0;
    }
}
