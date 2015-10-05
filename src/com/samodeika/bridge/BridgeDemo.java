package com.samodeika.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:16");
		movie.setYear("2014");
		
		Formatter printFormatter = new PrintFormatter();
		
		Printer moviePrinter = new MoviePrinter(movie);
		String printedMaterial = moviePrinter.print(printFormatter);
		System.out.println(printedMaterial);
		
		Formatter htmlFormatter = new HtmlFormater();
		String htmlMaterial = moviePrinter.print(htmlFormatter);
		System.out.println(htmlMaterial);
		
	}

}
