package Items;

public class Weapons extends items {
    String[] giveWeapons = {
            "Raggity Stick",//Start Weapon     Set Dmg:100
            "Knights Blade",//Drop Rate:75%    Set Dmg:150
            "BFF Sword",//Drop Rate:30%        Set Dmg:200
            "B.O.R.K"};//Drop Rate:1%          Set Dmg:300
    public int giveAttack(String name)
    {
        int prob1= (int)(Math.random()*4)+1;
        System.out.println(prob1);
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 150;
        }
        prob1 = (int)(Math.random()*10)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 200;
        }
        prob1 = (int)(Math.random()*100)+1;
        if(prob1==1)
        {
            return 300;
        }
        return 0;
    }

    public int giveDefense() {
        return 0;
    }

    public int givemp() {
        return 0;
    }
}
