package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFed;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFed = false;
        catCount++;
    }

    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFed = true;
            System.out.println(name + " поел(а) и теперь сыт(а)");
        } else {
            System.out.println(name + " не смог(ла) поесть");
        }
    }

    public boolean isFed() {
        return isFed;
    }

    public static int getCatCount() {
        return catCount;
    }
}