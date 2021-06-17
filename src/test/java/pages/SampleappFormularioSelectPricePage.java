package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleappFormularioSelectPricePage {

	JavascriptExecutor js;
	WebDriverWait wait;

	public SampleappFormularioSelectPricePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver,5);
	}

// Mapeando Elementos do Formulario “Enter Vehicle Data”

	@FindBy(how = How.ID, using = "selectsilver")
	WebElement silver;

	@FindBy(how = How.ID, using = "selectgold")
	WebElement gold;

	@FindBy(how = How.ID, using = "selectplatinum")
	WebElement platinum;

	@FindBy(how = How.ID, using = "selectultimate")
	WebElement ultimate;

	@FindBy(how = How.ID, using = "nextsendquote")
	WebElement btnNext;

// Metodos de Preenchimento

	public void selecionaPreco(String preco) {
		if (preco.equals("Prata")) {
			js.executeScript("arguments[0].click();", silver);
		} else if (preco.equals("Ouro")) {
			js.executeScript("arguments[0].click();", gold);
		} else if (preco.equals("Platina")) {
			js.executeScript("arguments[0].click();", platinum);
		} else if (preco.equals("Ultimate")) {
			js.executeScript("arguments[0].click();", ultimate);
		}
	}

	public void clicaBtnNext() {
		wait.until(ExpectedConditions.visibilityOf(btnNext));
		btnNext.click();
	}

}
