package edu.sla.mypetsandroidversion;

class rock extends Pet {
    private String size;
    private String color;
    private String texture;

    rock(String mySize, String myColor, String myTexture, String myName) {
        super(myName);
        size = mySize;
        color = myColor;
        texture = myTexture;
    }

    public void sayHi() {
        System.out.println(hiMessage());
    }

    public void describe() {
        System.out.println(description());
    }

    public String hiMessage() {
        return "Don't take me for granite! My name is " + getName() + ".";
    }

    public String description() {
        return "I'm a rock named " + getName() + ".\n" + "I am " + size + ".\n" + "I am " + texture + " and " + color + ".";
    }

}
