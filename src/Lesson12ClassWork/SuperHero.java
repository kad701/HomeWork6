package Lesson12ClassWork;

public enum SuperHero {
    SpyderMan("Jump like a Spider", 20), SyperMan("Strong", 25), CaptanAmerica("Has a shield", 24);

    private String superPower;
    private int power;

    public String getSuperPower() {
        return superPower;
    }

    public void fight(SuperHero sh) {
        if (this.power > sh.power) {
            System.out.println(this.toString() + " stronger then " + sh);
        } else
            System.out.println(this.toString() + " not stronger then " + sh);

    }

    SuperHero(String superPower, int power) {
        this.superPower = superPower;
        this.power = power;
    }
}
