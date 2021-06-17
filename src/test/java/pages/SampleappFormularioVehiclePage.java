package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SampleappFormularioVehiclePage {
	
	JavascriptExecutor js;

	public SampleappFormularioVehiclePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

// Mapeando Elementos do Formulario “Enter Vehicle Data”

	@FindBy(how = How.ID, using = "make")
	WebElement marca;

	@FindBy(how = How.ID, using = "model")
	WebElement modelo;

	@FindBy(how = How.ID, using = "cylindercapacity")
	WebElement capacidadeCilindro;

	@FindBy(how = How.ID, using = "engineperformance")
	WebElement desempenhoMotor;

	@FindBy(how = How.ID, using = "dateofmanufacture")
	WebElement dataFabricacao;

	@FindBy(how = How.ID, using = "numberofseats")
	WebElement numeroAssentos;
	
	@FindBy(how = How.ID, using = "righthanddriveno")
	WebElement 	direcaoDireitaNao;

	@FindBy(how = How.ID, using = "righthanddriveyes")
	WebElement 	direcaoDireitaSim;

	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	WebElement numeroAssentosMotocicleta;

	@FindBy(how = How.ID, using = "fuel")
	WebElement tipoCombustivel;

	@FindBy(how = How.ID, using = "payload")
	WebElement cargaUtil;

	@FindBy(how = How.ID, using = "totalweight")
	WebElement pesoTotal;

	@FindBy(how = How.ID, using = "listprice")
	WebElement precoTabela;
	
	@FindBy(how = How.ID, using = "licenseplatenumber")
	WebElement numeroPlaca;

	@FindBy(how = How.ID, using = "annualmileage")
	WebElement milhagemAnual;
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	WebElement btnNext;
	
	

// Metodos de Preenchimento

	public void selecionaMarca(String marca) {
		new Select(this.marca).selectByVisibleText(marca);
	}

	public void selecionaModelo(String modelo) {
		new Select(this.modelo).selectByVisibleText(modelo);
	}

	public void preencheCapacidadeCilindro(String capacidade) {
		capacidadeCilindro.sendKeys(capacidade);
	}

	public void preencheDesempenhoMotor(String desempenho) {
		desempenhoMotor.sendKeys(desempenho);
	}

	public void preencheDataFabricacao(String dataFabricacao) {
		this.dataFabricacao.sendKeys(dataFabricacao);
	}

	public void selecionaNumeroAssentos(String qtdAssentos) {
		new Select(numeroAssentos).selectByVisibleText(qtdAssentos);
	}
	
	public void ehDirecaoDireita(boolean direcaoDireita) {
		if (direcaoDireita) {
			js.executeScript("arguments[0].click();", direcaoDireitaSim);
		}else {
			js.executeScript("arguments[0].click();", direcaoDireitaNao);
		}
	}

	public void selecionaNumeroAssentosMotocicleta(String qtdAssentos) {
		new Select(numeroAssentosMotocicleta).selectByVisibleText(qtdAssentos);
	}

	public void selecionaTipoCombustivel(String combustivel) {
		new Select(tipoCombustivel).selectByVisibleText(combustivel);
	}

	public void preencheCargaUtil(String carga) {
		cargaUtil.sendKeys(carga);
	}

	public void preenchePesoTotal(String peso) {
		pesoTotal.sendKeys(peso);
	}

	public void preenchePrecoTabela(String preco) {
		precoTabela.sendKeys(preco);
	}
	
	public void preencheNumeroPlaca(String placa) {
		numeroPlaca.sendKeys(placa);
	}
	
	public void preencheMilhagemAnual(String milhagem) {
		milhagemAnual.sendKeys(milhagem);
	}
	
	public void clicaBtnNext() {
		btnNext.click();
	}

}
