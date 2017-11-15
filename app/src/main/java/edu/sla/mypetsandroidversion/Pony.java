package edu.sla.mypetsandroidversion;

class Pony extends Pet {
    private boolean eatsFriendship;

    Pony(boolean doesEatFriendship, int age, String name) {
        super(age, name);
        eatsFriendship = doesEatFriendship;
    }

    public void sayHi() {System.out.println(hiMessage());}

    public void describe() {
        System.out.println(description());
    }

    public String hiMessage() {
        return "Uh, hello (pony noises) my name is " + getName() + ".";
    }

    public String description() {
        return "Im a pony named " + getName() + "!\nI am " + getAge() + ".\n" + (eatsFriendship ? "I eat plenty of Friendship!" : "I'm allergic to Friendship...");
    }

}
