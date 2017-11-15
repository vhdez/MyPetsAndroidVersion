package edu.sla.mypetsandroidversion;

class Dog extends Pet {
    private boolean eatsDryFood;

    Dog(boolean doesEatDryFood, int age, String name) {
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
        return "Woof!  My name is " + getName() + ".";
    }

    public String description() {
        return "I'm a Dog named " + getName() + ".\nI'm " + getAge()*7 + " dog years old.\n" + (eatsDryFood ? "I eat dry food." : "I eat wet food.");
    }

}
