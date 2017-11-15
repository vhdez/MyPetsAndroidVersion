package edu.sla.mypetsandroidversion;

public class MyStuff {
    private Displayable[] stuff;
    private int current;


    public Displayable next() {
        Displayable next = stuff[current];
        // increment current to point to next stuff
        if (current < stuff.length - 1) {
            current++;
        } else {
            current = 0;
        }
        return next;
    }

    public MyStuff() {
        // There are 11 stuff
        stuff = new Displayable[11];
        current = 0;

        // Create and save all 11 stuffs
        stuff[0] = new Pony(false, 18, "FlutterShy");
        // The 1st pet is a dog named Rufus.
        stuff[1] = new Dog(false, 3, "Rufus");
        // The 2nd pet is an older dog named Tully.
        stuff[2] = new Dog(true, 5, "Tully");
        // The 3rd pet is cat named Ralph.
        stuff[3] = new Cat(false, 15, "Ralph");
        //CJ's cat
        stuff[4] = new Cat(true, 3, "Oreo");
        //CJ's GoodBoy1
        stuff[5] = new GoodBoy(true, "Stonk");
        //CJ's GoodBoy2
        stuff[6] = new GoodBoy(false, "Tarusk");
        //Eleanor's 1st pet
        stuff[7] = new Cat(true, 7, "Lola");
        //Eleanor's 2nd pet
        stuff[8] = new Cat(true, 5, "Jolene");
        //pet rock
        stuff[9] = new rock("small", "rainbow", "smooth", "Veronica");
        // Mr. Hernandez's unknown pet
        stuff[10] = new NamelessPet(95);

        // Report out the stuff we have.
        System.out.println("  =========   HIIIIIII =========");
        for (int i = 0; i < stuff.length; i++) {
            System.out.println(next().hiMessage());
            System.out.println("");
        }
        System.out.println("  =========   DESCRIPTIONS =========== ");
        for (int i = 0; i < stuff.length; i++) {
            System.out.println(next().description());
            System.out.println("");
        }
    }

}
