package com.stream.api;

public interface Actor {

	void act();
	void speak();
	
	
	// new method after above two implemented by hero and villain
	default void comedy() {
		System.out.println("comedy");
	}
}
