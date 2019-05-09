package main;

import java.util.Scanner;

public class Parent {
	private static Scanner sc;

	public static void main(String[] args) {
		try {
			System.out.println("Enter DNA Strand");
			sc = new Scanner(System.in);
			String DnaStrand = sc.nextLine();
			RnaTranscription obj = new RnaTranscription();
			System.out.println(obj.transcription(DnaStrand));
		}
		catch(Exception e) {
			System.out.println("Converted Rna Strand:");
			System.out.println("Something Went Wrong");
		}
	}
}
