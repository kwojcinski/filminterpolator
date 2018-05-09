package com.filminterpolator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public abstract class IOManager {

    public static Frame loadFrame(int index){
        try {
            File inputfile = new File(Options.getSingleton().getInputDirectoryPath() + "//" + Options.getSingleton().getFilename() + String.valueOf(index));
            BufferedImage image = ImageIO.read(inputfile);

            return new Frame(index, Options.getSingleton().getFilename(), image);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
            return null;
        }
    }
    public static boolean saveFrame(Frame frame){
        File outputfile = new File(Options.getSingleton().getOutputDirectoryPath() + "//" + frame.getName());
        try {
            ImageIO.write(frame.getImage(),"png", outputfile);
        } catch (Exception e){
            System.out.print(e.getMessage());
            return false;
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

