package main;


public class RnaTranscription {
	String transcription(String DnaStrand) {
		String RnaStrand = "";
		char[] DnaStrandArray = DnaStrand.toCharArray();
		for(int i = 0;i < DnaStrandArray.length;i++) {
			if(DnaStrandArray[i] == 'C')
				DnaStrandArray[i] = 'G';
			else if(DnaStrandArray[i] == 'G')
				DnaStrandArray[i] = 'C';
			else if(DnaStrandArray[i] == 'T')
				DnaStrandArray[i] = 'A';
			else if(DnaStrandArray[i] == 'A')
				DnaStrandArray[i] = 'U';
			else {
				RnaStrand = "Invalid Dna Strand";
				return RnaStrand;
			}
		}
		RnaStrand = new String(DnaStrandArray);
		return RnaStrand;
	}
}
