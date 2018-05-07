package com.filminterpolator;

import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public abstract class ImageProcessor {
    public static Frame processImage(int newIndex, String newName, Frame sourceFrame_a, Frame sourceFrame_b) {

        BufferedImage b1,b2;
        try {
            b1 = ImageIO.read(new File("bialy.png"));
            b2 = ImageIO.read(new File("czarny.png"));
        BufferedImage newImage = b1;
        for(int i = 0; i < b1.getWidth(); i++)
            for(int j = 0; j < b1.getHeight(); j++){
                Color c1,c2,c3;
                c1 = new Color(b1.getRGB(i,j));
                c2 = new Color(b2.getRGB(i,j));

                c3 = new Color( (c1.getRed() + c2.getRed())/2,
                                (c1.getGreen() + c2.getGreen())/2,
                                (c1.getBlue()  + c2.getBlue()) /2
                                );
                newImage.setRGB(i, j, c3.getRGB());
            }


            File outputfile = new File("image.png");
        ImageIO.write(newImage, "png", outputfile);
        Frame newFrame = new Frame(newIndex, newName, newImage);

        return newFrame;
        } catch (Exception e) {
            System.out.println("Exceptioooooon: " + e.getMessage());
            return null;
        }
    }
}