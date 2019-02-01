package Characters;

public class player implements Person {
    @Override
    public int getBaseHealth() {
        return 100;
    }

    @Override
    public int getBaseDefense() {
        return 75;
    }

    @Override
    public int getBaseMagic() {
        return 25;
    }

    @Override
    public int getBaseAttack() {
        return 0;
    }

    @Override
    public int getBaseMana() {
        return 100;
    }
}
