package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD(0.7, "Top", "CIRC and EFMP");
        DVD dvd = new DVD(4.7, "Middle", "RS-PC and EFMplus");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spin();
        dvd.spin();

    }
}
