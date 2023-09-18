package dstestcases;

import org.testng.annotations.Test;
import dsutilities.LoggerLoad;

public class LoggerTest {
@Test
	public void test01() throws InterruptedException{
		LoggerLoad.info("-----Testing Info----");
		LoggerLoad.warn("-----Testing Warn---");
		LoggerLoad.error("----Testing Error----");
		
	}
}
