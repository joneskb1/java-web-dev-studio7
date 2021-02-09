package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    public String title;
    public int speedSpin;
    public int storageSpace;

    public BaseDisc(String title, int speedSpin, int storageSpace) {
        this.title = title;
        this.speedSpin = speedSpin;
        this.storageSpace = storageSpace;
    }


    public String getTitle() {
        return title;
    }

    public int getSpeedSpin() {
        return speedSpin;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void printInfo() {
        System.out.println(this.title +" has a spin speed of " + this.speedSpin + " and has a storage space of " + this.storageSpace);
    };

}
