package edu.sla.mypetsandroidversion;

class Cat extends Pet {
    private boolean eatsDryFood;

    Cat(boolean doesEatDryFood, int age, String name) {
        super(age, name);
        eatsDryFood = doesEatDryFood;
    }

    public void sayHi() {
        System.out.println(hiMessage());
    }

    public void describe() {
        System.out.println(description());
    }

    public String hiMessage() {
        return "Meow!  My name is " + getName() + ".";
    }

    public String description() {
        return "I'm a Cat named " + getName() + ".\nI'm " + getAge() + " human years old.\n" + (eatsDryFood ? "I eat dry food." : "I eat wet food.");
    }

}
