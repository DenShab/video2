package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.video.VideoFormat;

public class tesе4 {

	private VideoFormat videoFormat;

	@Test
	public void test() {
		String[] camBandwidth = {"156 ","Кб/с"};
		videoFormat = new VideoFormat();;
        videoFormat.setScreenResolution(6);
        videoFormat.setquality(3);
        videoFormat.calcBandwidth();//
        assertEquals(camBandwidth[1],videoFormat.camBandwidth[1]); //ожидаемый результат
	}
}

