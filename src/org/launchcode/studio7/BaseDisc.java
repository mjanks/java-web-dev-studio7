package org.launchcode.studio7;

public abstract class BaseDisc {
    private double availableDiscSpace;
    private final double storageCapacityInGB;
    private final String recordingLayerLocation;
    private final String errorCorrectingCodes;

    public BaseDisc(double storageCapacityInGB, String recordingLayerLocation, String errorCorrectingCodes) {
        availableDiscSpace = storageCapacityInGB;
        this.storageCapacityInGB = storageCapacityInGB;
        this.recordingLayerLocation = recordingLayerLocation;
        this.errorCorrectingCodes = errorCorrectingCodes;
    }

    public double getAvailableDiscSpace() {
        return availableDiscSpace;
    }

    public void setAvailableDiscSpace(double availableDiscSpace) {
        this.availableDiscSpace = availableDiscSpace;
    }

    public double getStorageCapacityInGB() {
        return storageCapacityInGB;
    }

    public String getRecordingLayerLocation() {
        return recordingLayerLocation;
    }

    public String getErrorCorrectingCodes() {
        return errorCorrectingCodes;
    }

    public abstract void writeData(double amount);

    public abstract void readData();
}