package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisk {

    public DVD(double storageCapacityInGB, String recordingLayerLocation, String errorCorrectingCodes) {
        super(storageCapacityInGB, recordingLayerLocation, errorCorrectingCodes);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void writeData(double amount) {
        System.out.println("DVD laser activated for writeData");
        double newDataAmount = getAvailableDiscSpace() - amount;
        setAvailableDiscSpace(newDataAmount);
    }

    @Override
    public void readData() {
        System.out.println("Reading DVD data");
    }

    @Override
    public void spin() {
        System.out.println("DVD is spinning at 1500 RPM");
    }

}
