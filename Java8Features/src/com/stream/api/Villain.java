package com.stream.api;

public class Villain implements Actor {

	@Override
	public void act() {
		System.out.println("act");
	}

	@Override
	public void speak() {
		System.out.println("speak");
	}
	
	public void rude() {
		System.out.println("rude");
	}

}
