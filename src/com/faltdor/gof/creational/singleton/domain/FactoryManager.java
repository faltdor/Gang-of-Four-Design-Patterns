package com.faltdor.gof.creational.singleton.domain;

public class FactoryManager {
	private static FactoryManager instance = null;
    private FactoryManager() {}
    
    synchronized
    public static FactoryManager getInstance()
    {
        if (instance == null)
        {
            instance = new FactoryManager();
        }
        return instance;
    }
    
    private static int numTracks = 5;
    
    public static void startTracks()
    {
        for(int i=0;i<numTracks;++i)
        {
           System.out.println("Starting:" + i);
        }
    }
}
