package edu.sla.mypetsandroidversion;
//CJ's class
class GoodBoy extends Pet {
    private boolean speaks;

    GoodBoy(boolean doesSpeak, String name) {
        super(name);
        speaks = doesSpeak;
    }

    public void sayHi() {
        System.out.println(hiMessage());
    }

    public void giveAdvice() {
        if(speaks) System.out.println(getName() + ": Don't eat glue.");
        else System.out.println("*" + getName() + " grunts in a seemingly helpful way. you feel inspired*");
    }

    public String hiMessage() {
        return (speaks ? "Greetings, I am " + getName() + "." : "*it's name is " + getName() + "*");

    }

}
