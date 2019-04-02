package package2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import package1.BasePage;
import package1.HomePageObject;
import package1.dressespageobject;

public class dressespage {
	dressespageobject dressespage;
	BasePage bp;
	HomePageObject homepage;

	public dressespage() {
		dressespage = new dressespageobject();
		bp = new dressespageobject();
		homepage = new HomePageObject();
	}

	public void verifySize() {
		Assert.assertTrue(dressespage.elementfound(dressespage.getmediumsize()));
		dressespage.getmediumsize();

	}
}

