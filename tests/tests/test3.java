package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.video.VideoFormat;

public class test3 {

	private VideoFormat videoFormat;

	@Test
	public void test() {
		float result; 
		videoFormat = new VideoFormat();;
        videoFormat.setScreenResolution(6);
        videoFormat.setquality(3);
        result= videoFormat.getSize();
        assertEquals(Float.toString(result), Float.toString(13));
	}
}

