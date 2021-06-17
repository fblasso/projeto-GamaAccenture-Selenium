package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SampleappFormularioProductPage {
	
	JavascriptExecutor js;

	public SampleappFormularioProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}
	
	// Mapeando Elementos do Formulario “Enter Vehicle Data”

		@FindBy(how = How.ID, using = "startdate")
		WebElement dataInicio;
		
		@FindBy(how = How.ID, using = "insurancesum")
		WebElement valorSeguro;
		
		@FindBy(how = How.ID, using = "meritrating")
		WebElement clasificacao;
		
		@FindBy(how = How.ID, using = "damageinsurance")
		WebElement cobertura;
		
		@FindBy(how = How.ID, using = "LegalDefenseInsurance")
		WebElement legalDefenseInsurance;
		
		@FindBy(how = How.ID, using = "EuroProtection")
		WebElement euroProtection;
		
		@FindBy(how = How.ID, using = "courtesycar")
		WebElement carroCortesia;
		
		@FindBy(how = How.ID, using = "nextselectpriceoption")
		WebElement btnNext;
		
		
		//Metodos de Preenchimento

		public void preencheDataInicio(String data) {
			dataInicio.sendKeys(data);
		}
				
		public void selecionaValorSeguro(String valor) {
			new Select(valorSeguro).selectByVisibleText(valor);
		}
		
		public void selecionaClassificacao(String clasificacao) {
			new Select(this.clasificacao).selectByVisibleText(clasificacao);
		}
		
		public void selecionaCobertura(String cobertura) {
			new Select(this.cobertura).selectByVisibleText(cobertura);
		}
		
		public void escolheProdutoOpcional(String produto) {
			if(produto.equals("Euro Protection")) {
				js.executeScript("arguments[0].click();", euroProtection);
			} 
			if (produto.equals("Legal Defense Insurance")) {
				js.executeScript("arguments[0].click();", legalDefenseInsurance);
			}
		}
		
		public void selecionaCortesiaCarrro(String carroCortesia) {
			new Select(this.carroCortesia).selectByVisibleText(carroCortesia);
		}
		
		public void clicaBtnNext() {
			btnNext.click();
		}
		
}
