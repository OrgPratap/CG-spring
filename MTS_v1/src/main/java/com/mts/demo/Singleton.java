package com.mts.demo;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {
		//System.out.println("singleton instance created...");
	}

	// Factory method
	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
