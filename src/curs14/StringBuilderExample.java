package curs14;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString("masina");
		replaceFromString("Salut Popescu", 0, 5, "Oana");
		//                 0123456789101112 
		deleteFromString("Salut Ion Popescu", 6, 10);
		//                0123456789
		insertIntoString("tele", 1, "vizor");
		appendToString("tele", "vizor");
		addSpacesToText("acestaEsteUnStringCareFolosesteUnFormatCamelCase");
	}
	
	public static void reverseString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
		
	}
	
	public static void replaceFromString
			(String text, int indexStart, int indexEnd, String textToReplace) {
		StringBuilder sb =  new StringBuilder(text);
		sb.replace(indexStart, indexEnd, textToReplace);
		System.out.println(sb);
		
	}
	
	public static void deleteFromString(String text, int startIndex, int endIndex) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex, String textToInsert) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
		
	}
	
	public static void appendToString(String text, String textToAppend) {
		StringBuilder sb = new StringBuilder(text);
		sb.append(textToAppend);
		System.out.println(sb);
	}
	
	//acestaEsteUnStringCareFolosesteFormatCamelCase
	public static void addSpacesToText(String text) {
		StringBuilder sb = new StringBuilder(text);
		
		for(int i = 0; i< sb.length(); i++) {
			
			if(Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
		}
		System.out.println(sb);
	}
	
	
}