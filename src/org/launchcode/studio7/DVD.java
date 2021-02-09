package org.launchcode.studio7;

public class DVD extends BaseDisc{

    public DVD(String title, int speedSpin, int storageSpace) {
        super(title, speedSpin, storageSpace);
    }

    @Override
    public void writeData() {
        System.out.println("writing data on DVD at high speed!");

    }

    @Override
    public void readData() {
        System.out.println("reading data on DVD at high speed!");

    }

    @Override
    public void spinDisc() {
        System.out.println("spinning DVD at high speed!");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
