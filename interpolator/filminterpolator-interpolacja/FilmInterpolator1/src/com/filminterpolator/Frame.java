package com.filminterpolator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by specu on 04.04.2018.
 */
public class Frame {


    BufferedImage image;
    String name;
    int index;

    public BufferedImage getImage() {
        return image;
    }
    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
    public boolean saveFrame()
    {
        /*File outputfile = new File("saved.png")
        ImageIO.write("")
*/
        return true;
    }
    Frame(BufferedImage image) {
        this.image = image;
    }
    Frame(int newIndex, String newName) {
        this.index = newIndex;
        this.name = newName;
        System.out.println("Creating new frameeeeee! (" + newIndex + ")");
    }
    Frame(int newIndex, String newName, BufferedImage img) {
        this.index = newIndex;
        this.name = newName;
        this.image = img;
        System.out.println("Creating new frameeeeee! (" + newIndex + ")");
    }

}
