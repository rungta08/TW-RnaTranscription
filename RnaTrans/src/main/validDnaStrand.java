package main;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class validDnaStrand {

	@Test
	public void test() {
		RnaTranscription validDna = new RnaTranscription();
		String actual = validDna.transcription("CGTACGTA");
		assertEquals("GCAUGCAU", actual);
	}

}
