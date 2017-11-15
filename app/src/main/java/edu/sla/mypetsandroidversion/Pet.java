package edu.sla.mypetsandroidversion;

class Pet implements Displayable {
    private int myAge;
    private String myName;

    Pet(int age, String name) {
        myAge = age;
        myName = name;
    }

    Pet(int age) {
        myAge = age;
    }

    Pet(String name) {
        myName = name;
    }

    int getAge() {
        return myAge;
    }

    String getName() {
        return myName;
    }

    public void sayHi() {
        System.out.println(hiMessage());
    }

    public void describe() {
        System.out.println(description());
    }

    public String hiMessage() {
        if (myName == null) {
            return "[GENERIC] Hi, what's my name?";
        } else {
            return "[GENERIC] Hi, my name is " + myName;
        }
    }

    public String description() {
        return "[GENERIC] Hi, I'm a pet.  I'm " + myAge + " human years old.";
    }

}
