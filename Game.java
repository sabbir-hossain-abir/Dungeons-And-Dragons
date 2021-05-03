public class Game {
    public static void main(String[] args) {

    Rogue rogue=new Rogue("Night Crawler",2);
    rogue=new Rogue(rogue.getName(),rogue.getLevel(),rogue.getStrength(),rogue.getDexterity(),rogue.getConstitution(),rogue.getIntelligence(),rogue.getWisdom(),rogue.getCharisma(),rogue.getProficiencyMod(),rogue.getHealth(),rogue.getIsDead(),2);
        System.out.println(rogue);
        System.out.println("Health of "+rogue.getName()+": "+rogue.getHealth());
        System.out.println("Strength Modifier: "+rogue.getStrengthMod()+", "+"Dexterity Modifier: "+rogue.getDexterityMod()+", "+"Constitution Modifier: "+rogue.getConstitutionMod()+", "+"Intelligence Modifier: "+rogue.getIntelligenceMod()+", "+"Wisdom Modifier: "+rogue.getWisdomMod()+", "+"Charisma Modifier: "+rogue.getCharismaMod());
        rogue.levelUp();
        System.out.println(rogue);
        System.out.println("Health of "+rogue.getName()+": "+rogue.getHealth());
        System.out.println(rogue.getName()+" is Dead: "+rogue.getIsDead());
        System.out.println();

    Fighter fighter=new Fighter("Mad Max",4);
        fighter=new Fighter(fighter.getName(),fighter.getLevel(),fighter.getStrength(),fighter.getDexterity(),fighter.getConstitution(),fighter.getIntelligence(),fighter.getWisdom(),fighter.getCharisma(),fighter.getProficiencyMod(),fighter.getHealth(),fighter.getIsDead(),0);

        System.out.println(fighter);
        System.out.println("Health: "+fighter.getHealth());
        System.out.println("Strength Modifier: "+fighter.getStrengthMod()+", "+"Dexterity Modifier: "+fighter.getDexterityMod()+", "+"Constitution Modifier: "+fighter.getConstitutionMod()+", "+"Intelligence Modifier: "+fighter.getIntelligenceMod()+", "+"Wisdom Modifier: "+fighter.getWisdomMod()+", "+"Charisma Modifier: "+fighter.getCharismaMod());
        fighter.levelUp();
        System.out.println(fighter);
        System.out.println("Health of "+fighter.getName()+": "+fighter.getHealth());
        fighter.attack(rogue);
        System.out.println(rogue.getName()+"'s Health after getting attack: "+rogue.getHealth());
        fighter.attack(rogue);
        System.out.println(rogue.getName()+"'s Health after getting attack: "+rogue.getHealth());
        System.out.println(rogue.getName()+" is Dead: "+rogue.getIsDead());
        System.out.println();


    Cleric cleric=new Cleric("Yoda",3);
        cleric=new Cleric(cleric.getName(),cleric.getLevel(),cleric.getStrength(),cleric.getDexterity(),cleric.getConstitution(),cleric.getIntelligence(),cleric.getWisdom(),cleric.getCharisma(),cleric.getProficiencyMod(),cleric.getHealth(),cleric.getIsDead(),3);

        System.out.println(cleric);
        System.out.println("Health: "+cleric.getHealth());
        System.out.println("Strength Modifier: "+cleric.getStrengthMod()+", "+"Dexterity Modifier: "+cleric.getDexterityMod()+", "+"Constitution Modifier: "+cleric.getConstitutionMod()+", "+"Intelligence Modifier: "+cleric.getIntelligenceMod()+", "+"Wisdom Modifier: "+cleric.getWisdomMod()+", "+"Charisma Modifier: "+cleric.getCharismaMod());
        cleric.levelUp();
        System.out.println(cleric);
        System.out.println(cleric.getName()+"'s Health: "+cleric.getHealth());
        cleric.heal(rogue);
        System.out.println(rogue.getName()+"'s Health after healed by "+cleric.getName()+": "+rogue.getHealth());
        cleric.heal(fighter);
        System.out.println(fighter.getName()+"'s Health after healed by "+cleric.getName()+": "+fighter.getHealth());
        System.out.println(cleric.getName()+" is Dead: "+cleric.getIsDead());
        System.out.println();


    Wizard wizard=new Wizard("Voldemort",6);
        wizard=new Wizard(wizard.getName(),wizard.getLevel(),wizard.getStrength(),wizard.getDexterity(),wizard.getConstitution(),wizard.getIntelligence(),wizard.getWisdom(),wizard.getCharisma(),wizard.getProficiencyMod(),wizard.getHealth(),wizard.getIsDead(),1);

        System.out.println(wizard);
        System.out.println("Health: "+wizard.getHealth());
        System.out.println("Strength Modifier: "+wizard.getStrengthMod()+", "+"Dexterity Modifier: "+wizard.getDexterityMod()+", "+"Constitution Modifier: "+wizard.getConstitutionMod()+", "+"Intelligence Modifier: "+wizard.getIntelligenceMod()+", "+"Wisdom Modifier: "+wizard.getWisdomMod()+", "+"Charisma Modifier: "+wizard.getCharismaMod());
        wizard.levelUp();
        System.out.println(wizard);
        System.out.println(wizard.getName()+"'s Health: "+wizard.getHealth());
        fighter.attack(wizard);
        System.out.println(wizard.getName()+"'s Health after getting attack by "+fighter.getName()+": "+wizard.getHealth());
        Character[] c={rogue,fighter,cleric};
        wizard.multiAttack(c);
        System.out.println(rogue.getName()+"'s Health: "+rogue.getHealth()+", "+fighter.getName()+"'s Health: "+fighter.getHealth()+", "+cleric.getName()+"'s Health': "+cleric.getHealth());
        System.out.println(wizard.getName()+" is Dead: "+wizard.getIsDead());
        System.out.println();

    }

}