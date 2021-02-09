package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD("JAVA", 200, 400);
        DVD myDVD = new DVD("CODE", 250, 450);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.writeData();
        myCD.readData();
        myCD.spinDisc();
        myCD.printInfo();


        myDVD.writeData();
        myDVD.readData();
        myDVD.spinDisc();
        myDVD.printInfo();

    }
}
