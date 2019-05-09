package main;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class invalidDnaStrand {

	@Test
	public void test() {
		RnaTranscription validDna = new RnaTranscription();
		String actual = validDna.transcription("CGTACGTH");
		assertEquals("Invalid Dna Strand", actual);
	}

}
