package org.launchcode.studio7;

public class LP implements OpticalDisk {

    @Override
    public void spin() {
        System.out.println("LP spins at 33.3 RPM");
    }
}
