package edu.sla.mypetsandroidversion;

class NamelessPet extends Pet {

    NamelessPet(int myAge) {
        super(myAge);
    }

    public void describe() {
        System.out.println(description());
    }

    public String description() {
        return "I'm a Pet of unknown type.\nI'm " + getAge() + " human years old.";
    }

}
