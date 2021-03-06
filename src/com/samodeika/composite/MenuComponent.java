package com.samodeika.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	
	String name;
	String url;
	List<MenuComponent> menuComponent = new ArrayList<>();

	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature is not implemented at this level!");
	}
	
	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature is not implemented at this level!");
	}
	
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}

	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
	
	public abstract String toString();
	
}
