package com.filminterpolator;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.ArrayList;

public abstract class IOManager {

    boolean loadFrame(){
        return true;
    }
    static boolean saveFrame(Frame frame){
        File outputfile = new File(Options.getSingleton().getOutputDirectoryPath() + "//" + frame.getName());

        try {
            ImageIO.write(frame.getImage(),"png", outputfile);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
        return true;
    }
    public static int countFrames(String path){
        File directory =  new File(path);
        try {
            int fileCount = directory.list().length;
            System.out.println("File count = " + fileCount);
            return fileCount;
        } catch (Exception e) {
            System.out.println("Wrong Directory");
        }
        return 0;
    }

}

