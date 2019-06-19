package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.homepageobject;

public class homepagetest {

	homepageobject hp;

	public homepagetest() {
		hp = new homepageobject();

	}

	@Test
	public void verifyTabText() {
		Assert.assertTrue(hp.getdressestabinhomepage().isDisplayed());

		Assert.assertTrue(hp.gettshirtstabinhomepage().isDisplayed());

		Assert.assertTrue(hp.getwomentabinhomepage().isDisplayed());

	}

	@Test
	public void verifynavigated() {

		hp.naviwomen();
		Assert.assertTrue(hp.womeninhomepage().trim().equalsIgnoreCase("WOMEN"), "FAILED");

	}
}
