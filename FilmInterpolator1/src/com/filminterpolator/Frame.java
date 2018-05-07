package com.filminterpolator;

import java.awt.image.BufferedImage;

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
        System.out.println("Save Frame");

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
