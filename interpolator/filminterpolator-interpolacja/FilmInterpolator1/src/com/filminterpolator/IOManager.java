package com.filminterpolator;

import javax.imageio.ImageIO;
import java.io.File;

public abstract class IOManager {

    boolean loadFrame(){
        return true;
    }
    static boolean saveFrame(Frame frame){
        File outputfile = new File(Options.getSingleton().getOutputDirectoryPath());

        try {
            ImageIO.write(frame.getImage(),"png", outputfile);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
        return true;
    }
    public static int countFrames(String path){
        File directory =  new File(path);
        int fileCount =  directory.list().length;
        System.out.println("File count = " + fileCount);
        return fileCount;
    }

}

