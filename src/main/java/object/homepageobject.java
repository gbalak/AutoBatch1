package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends basepage {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement tabwomen;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement tabdresses;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tabtshirts;

	@FindBy(xpath = "//*[@class='cat-name']")
	private WebElement women;

	public homepageobject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomentabinhomepage() {
		return tabwomen;
	}

	public WebElement getdressestabinhomepage() {
		return tabdresses;
	}

	public WebElement gettshirtstabinhomepage() {
		return tabtshirts;
	}

	public String womeninhomepage() {
		return women.getText();
	}

	public void naviwomen() {
		tabwomen.click();
	}

}
