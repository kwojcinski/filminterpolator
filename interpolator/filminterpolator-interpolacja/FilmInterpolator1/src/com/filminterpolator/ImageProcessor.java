package com.filminterpolator;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class ImageProcessor {
    public static BufferedImage processImage(BufferedImage img_a, BufferedImage img_b) {


        BufferedImage newImage = img_a;
        for(int i = 0; i < img_a.getWidth(); i++)
            for(int j = 0; j < img_a.getHeight(); j++){
                Color c1,c2,c3;
                c1 = new Color(img_a.getRGB(i,j));
                c2 = new Color(img_b.getRGB(i,j));

                c3 = new Color( (c1.getRed() + c2.getRed())/2,
                                (c1.getGreen() + c2.getGreen())/2,
                                (c1.getBlue()  + c2.getBlue()) /2
                                );
                newImage.setRGB(i, j, c3.getRGB());
            }

        return newImage;
    }
}