package com.stream.api;

public class Hero implements Actor{

	@Override
	public void act() {
		System.out.println("act");
		
	}

	@Override
	public void speak() {
		System.out.println("speak");
	}
	
	public void comedy() {
		System.out.println("comedy");
	}

}
