package com.samodeika.bridge.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {

		InventorySystem ims = new InventorySystem();
		
		ims.takeOrder("Movie IRobot", 123);
		ims.takeOrder("Samsung TV", 1234);
		ims.takeOrder("PS 4", 43223);
		ims.takeOrder("PES 2016", 532);
		ims.takeOrder("Dell notebook", 9812);
		ims.takeOrder("PS 4", 234);
		ims.takeOrder("PES 2016", 543534);
		ims.takeOrder("Dell notebook", 6546534);
		ims.takeOrder("Movie IRobot", 13);
		ims.takeOrder("Samsung TV", 124);
		ims.takeOrder("PS 4", 4322);
		ims.takeOrder("PES 2016", 32);
		ims.takeOrder("Dell notebook", 912);
		ims.takeOrder("PS 4", 24);
		ims.takeOrder("PES 2016", 5534);
		ims.takeOrder("Dell notebook", 46534);
		
		ims.process();
		
		System.out.println(ims.report());
		
	}

}
