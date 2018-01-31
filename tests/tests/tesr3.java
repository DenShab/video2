package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import calculate.Calculator;
import org.junit.BeforeClass;
import org.junit.Before;
import main.video.VideoFormat;

public class tesr3 {
	@Test
	public void test() {
		VideoFormat videoFormat;
		float result; 
		videoFormat = new VideoFormat();;
        videoFormat.setScreenResolution(6);
        videoFormat.setquality(3);
        result= videoFormat.getSize();
        float abs= 12;
        assertTrue(result == abs); 
	}
}
