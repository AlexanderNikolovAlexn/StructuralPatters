package com.samodeika.composite;

public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		mainMenu.add(safetyMenuItem);
		
		Menu claimSubMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		claimSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	
	}

}
