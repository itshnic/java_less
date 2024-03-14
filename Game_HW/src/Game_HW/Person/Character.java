package Game_HW.Person;

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
 * attack() - атака
 * hail() - лечение
 * defense() - защита
 */
abstract class Character {
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

    public Character(
            int power,
            int skill,
            int endurance,
            int intelligence,
            int armor,
            int mana,
            String weapon,
            int age,
            String name) {
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
    }
    public String toString(){
        return this.getClass().getSimpleName()+" Имя игрока "+this.name+" /возраст "+this.age+" лет";
    }
    public  void attack(Character character){
        int lightBlow =(int) (this.power-this.power*defense(character));
        int charHealht = character.health;
        character.health-=lightBlow;
        System.out.println(this.getClass().getSimpleName()+" атакует "+character.getClass().getSimpleName()+" нанесен урон -> " + (charHealht-character.health));
    }
    public void hail(Character character){
        if(this.mana>=10){
            character.health+=(int)(this.mana*0.1);
            this.mana-=(int)(this.mana*0.1);
            System.out.println(this.getClass().getSimpleName()+" вылечил -> "+ character.getClass().getSimpleName());
            System.out.println("Запас здоровья "+character.getClass().getSimpleName() + " -> " + character.health);
            System.out.println(this.getClass().getSimpleName()+" осталось Mana -> "+this.mana);
        }
        else System.out.println(this.getClass().getSimpleName()+" Лечить нельзя Mana -> "+this.mana);

    }
    public double defense(Character character){
        return (double) (character.skill + character.endurance + character.armor) /1000;
    }

}
