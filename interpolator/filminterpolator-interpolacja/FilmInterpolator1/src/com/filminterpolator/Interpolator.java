package com.filminterpolator;

import java.util.ArrayList;

public class Interpolator {
    Options InterpolationOptions;
    Frame sourceFrame_a;
    Frame sourceFrame_b;
    Frame outputFrame;

    public static boolean processFilm()
    {
        Options options = Options.getSingleton();

        int fileCount = IOManager.countFrames(options.inputDirectoryPath);
        int outputFilecount = (fileCount + (fileCount - 1) * options.getFPSvalue());

        ArrayList<String> fileTitles =  new ArrayList<>();
        ArrayList<Frame> tempFrames = new ArrayList<>();


        for(int i = 1; i < outputFilecount+1; i++) {
            fileTitles.add(options.getFilename() + "" + String.valueOf(i));
            System.out.println(fileTitles.get(i-1));
        }
        if(fileCount <= 1) {
            System.out.println("Nie ma co Interpolować");
            return false;
        }

        for(int i = 0; i < fileCount-1; i++){
            tempFrames.add(IOManager.loadFrame(i)); //First Frame
            tempFrames.add(IOManager.loadFrame(i+1));

            for(int j = 0; j < options.getFPSvalue(); j++){

            }
            tempFrames.clear();
        }
        /*switch (Options.getSingleton().getFPSvalue()){
            case 1:

        }*/


        return true;
    }



}