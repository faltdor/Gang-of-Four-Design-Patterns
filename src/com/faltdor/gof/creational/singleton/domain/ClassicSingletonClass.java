package com.faltdor.gof.creational.singleton.domain;

public class ClassicSingletonClass {
	private static ClassicSingletonClass instance = null; //lazy initialization 

    private ClassicSingletonClass() {
    }

    public static ClassicSingletonClass getInstance() {
    	
        if (instance == null) {
            instance = new ClassicSingletonClass();
        }
        //eager initialization: Just return the instance and create an instance static an final
        return instance;
    }
}
