package com.filminterpolator;

import java.io.File;
import java.util.ArrayList;

public class Interpolator {
    Options InterpolationOptions;
    Frame sourceFrame_a;
    Frame sourceFrame_b;
    Frame outputFrame;

    public static boolean processFilm()
    {
        /*Options interpolationOptions;
        interpolationOptions=Options.getSingleton();

        int filmFrames = IOManager.countFrames(interpolationOptions.inputDirectoryPath);

        int noSourceFrame_a = 1;
        int noSourceFrame_b = 2;

        int noOutputFrame_new=calculateIndexes(noSourceFrame_a);
        int noOutputFrame_a = noOutputFrame_new - 1;
        int noOutputFrame_b = noOutputFrame_new + 1;

        sourceFrame_a = new Frame(noSourceFrame_a, interpolationOptions.readPath('i'));
        sourceFrame_b = new Frame(noSourceFrame_b, interpolationOptions.readPath('i'));

        outputFrame = new Frame(noOutputFrame_new, ImageProcessor.processImage(sourceFrame_a.getImage(), sourceFrame_b.getImage()));

        sourceFrame_a.saveFrame();
        outputFrame.saveFrame();
        sourceFrame_b.saveFrame();

        //MAIN LOOP
        while(noSourceFrame_a<interpolationOptions.readNumberOfFrames())
        {
            noSourceFrame_a = noSourceFrame_b;
            noOutputFrame_new = calculateIndexes(noSourceFrame_a);
            noOutputFrame_a = noOutputFrame_new - 1;
            noOutputFrame_b = noOutputFrame_new + 1;

            sourceFrame_a = sourceFrame_b;
            sourceFrame_b = new Frame(noOutputFrame_new, interpolationOptions.readPath('i'));
            outputFrame = ImageProcessor.processImage(noOutputFrame_new, interpolationOptions.readPath('o'), sourceFrame_a, sourceFrame_b);

            outputFrame.saveFrame();
            sourceFrame_b.saveFrame();
        }

        return true;*/
        Options options = Options.getSingleton();
        int filecount = IOManager.countFrames(options.inputDirectoryPath);
        if(filecount <= 1) {
            System.out.println("Nie ma co Interpolować");
            return false;
        }


        switch (Options.getSingleton().getFPSvalue()){
            case 1:

        }


        return true;
    }

    private int calculateIndexes(int frame1)
    {
        int frame2=frame1*2;
        return frame2;
    }


}