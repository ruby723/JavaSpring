package com.douzone.container.config.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.soundsystem.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerJavaConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule();
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlayerNotNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertNotNull(cdPlayer);
	}
}
