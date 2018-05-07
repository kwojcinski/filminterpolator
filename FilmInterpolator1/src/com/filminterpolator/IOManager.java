package com.filminterpolator;

public abstract class IOManager {

    boolean loadFrame(){
        return true;
    }
    boolean saveFrame(){
        return true;
    }
    public static int countFrames(String path){
        return 0;
    }

}

