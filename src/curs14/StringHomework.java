package curs14;

import java.util.StringTokenizer;

public class StringHomework {

	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		searchNulla(text);
		nrOfSentences(text);
		deleteChar(text);
		replaceChar(text);
}
	public static void searchNulla(String text) {
		String word ="Nulla";
		int nr=0;
		while(text.indexOf(word)>0) {
			nr++;
			text=text.substring(text.indexOf(word) + word.length());
		}
System.out.println(nr);
	
	}
	
	public static void nrOfSentences(String text) {
		StringTokenizer st = new StringTokenizer(text,".");
		for (int i = 1; st.hasMoreTokens(); i++)
	         System.out.println(st.nextToken().trim() + ".");
	
	}
	
	public static void deleteChar(String text) {
		StringBuilder sb =  new StringBuilder(text);
		char letter = 'a';
		
		while(text.indexOf(letter)>0) {
			sb.deleteCharAt(text.indexOf(letter));
			text =sb.toString();
			
		}
		
		System.out.println(sb);	
		
	}
	
	public static void replaceChar(String text) {
		char character ='o';
		StringBuilder sb =  new StringBuilder(text);

		while(text.indexOf(character)>0) {
			
			sb.replace(text.indexOf(character),text.indexOf(character)+1, "#");
			text =sb.toString();
		}
		System.out.println(sb);
	
	}
}


