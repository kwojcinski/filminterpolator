package com.filminterpolator;

public abstract class UserInterface {

    public static Options getOptions()
    {
        //values taken from GUI
        //test values here:
        Options newOptions = new Options(GUI.getNoFPS(), 0 ,GUI.getInputdirpath(),GUI.getOutputdirpath());
        return newOptions;
    }
    int getFPSvalue(Options options)
    {
        return options.readFPSvalue();
    }
    int getNumberOfFrames(Options options)
    {
        return options.readNumberOfFrames();
    }
    String readPath(Options options, char io)
    {
        return options.readPath(io);
    }
}

