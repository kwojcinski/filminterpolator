package com.filminterpolator;

public class Options {
    int FPSvalue;
    int numberOfAddedFrames;
    String inputDirectoryPath;
    String outputDirectoryPath;

    Options(int FPSvalue, int numberOfAddedFrames,
            String inputDirectoryPath, String outputDirectoryPath) {

        System.out.println("Creating Options object ("+FPSvalue+", "+numberOfAddedFrames+", "+inputDirectoryPath+", "+outputDirectoryPath+")");

        this.FPSvalue = FPSvalue;
        this.numberOfAddedFrames = numberOfAddedFrames;
        this.inputDirectoryPath = inputDirectoryPath;
        this.outputDirectoryPath = outputDirectoryPath;
    }

    public int readFPSvalue() {
        return FPSvalue;
    }

    public int readNumberOfFrames() {
        return numberOfAddedFrames;
    }

    public String readPath(char io) {
        if (io == 'i')
            return inputDirectoryPath;
        else if (io == 'o')
            return outputDirectoryPath;
        else return "";
    }
}
