package com.filminterpolator;

public class Options {
    int FPSvalue;
    int numberOfAddedFrames;
    String inputDirectoryPath;
    String outputDirectoryPath;
    static Options InstanceOf;

    private Options(int FPSvalue, int numberOfAddedFrame, String inputDirectoryPath, String outputDirectoryPath) {


        //System.out.println("Creating Options object ("+FPSvalue+", "+numberOfAddedFrames+", "+inputDirectoryPath+", "+outputDirectoryPath+")");

        this.FPSvalue = FPSvalue;
        this.numberOfAddedFrames = numberOfAddedFrames;
        this.inputDirectoryPath = inputDirectoryPath;
        this.outputDirectoryPath = outputDirectoryPath;
    }

    public static Options getSingleton(){
        if(InstanceOf == null){
            InstanceOf = new Options(2,0,"defaultInputPath", "defaultOutputPath");
        }
        return InstanceOf;
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

    public int getFPSvalue() {
        return FPSvalue;
    }

    public void setFPSvalue(int FPSvalue) {
        this.FPSvalue = FPSvalue;
    }

    public int getNumberOfAddedFrames() {
        return numberOfAddedFrames;
    }

    public void setNumberOfAddedFrames(int numberOfAddedFrames) {
        this.numberOfAddedFrames = numberOfAddedFrames;
    }

    public String getInputDirectoryPath() {
        return inputDirectoryPath;
    }

    public void setInputDirectoryPath(String inputDirectoryPath) {
        this.inputDirectoryPath = inputDirectoryPath;
    }

    public String getOutputDirectoryPath() {
        return outputDirectoryPath;
    }

    public void setOutputDirectoryPath(String outputDirectoryPath) {
        this.outputDirectoryPath = outputDirectoryPath;
    }
}