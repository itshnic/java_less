package Game_HW.Model;


import Game_HW.View.View;

/**
 * Шкала от 0 до 100
 * power - сила атаки
 * skill - ловкость/навыки
 * endurance - выносливость
 * intelligence - интелект
 * armor - броня/ доспехи
 * health - здоровье
 * mana - магия
 * age - возраст игрока
 * weapon - оружие
 * name - имя игрока
 * speed - инициатива
 * attack() - атака
 * hail() - лечение
 * defense() - защита
 */
public abstract class Person implements PersonMethod {
    protected int power;
    protected int skill;
    protected int endurance;
    protected int intelligence;
    protected int armor;
    protected int health;
    protected int mana;
    protected String weapon;
    protected int age;

    protected String name;
    public int speed;
    protected int positionX;
    protected int positionY;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Person(
            int power,
            int skill,
            int endurance,
            int intelligence,
            int armor,
            int mana,
            String weapon,
            int age,
            String name,
            int speed,
            int positionX, int positionY) {
        this.power = power;
        this.skill = skill;
        this.endurance = endurance;
        this.intelligence = intelligence;
        this.armor = armor;
        this.health = 100;
        this.mana = mana;
        this.weapon = weapon;
        this.age = age;
        this.name = name;
        this.speed = speed;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String toString() {
        return this.getClass().getSimpleName()
                + " --> "
                + this.name
                + " /"
                + this.age
                + " лет /"
                + this.health
                + " жизнь /"
                + "Позиция X="
                + this.positionX
                + " Y="
                + this.positionY
                + " /"
                + this.speed;
    }

    /**
     * Атака
     * impactForce - сила удара
     *
     * @param person
     */
    public void attack(Person person) {
        int impactForce = (int) (this.power - this.power * defense(person));
        if ((person.health -= impactForce) < 0)
            person.health = 0;
    }

    /**
     * Защита от повреждений при атаке соперника - снижает силу удара
     *
     * @param person
     * @return
     */
    public double defense(Person person) {
        return (double) (person.skill + person.endurance + person.armor) / 1000;
    }

    public int getHealth() {
        return health;
    }

    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}
