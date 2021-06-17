package pages;

import javax.print.attribute.standard.MediaSize.Other;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SampleappFormularioInsurantPage {

	JavascriptExecutor js;

	public SampleappFormularioInsurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

// Mapeando Elementos do Formulario “Enter Vehicle Data”

	@FindBy(how = How.ID, using = "firstname")
	WebElement nome;

	@FindBy(how = How.ID, using = "lastname")
	WebElement sobrenome;

	@FindBy(how = How.ID, using = "birthdate")
	WebElement dataNascimento;

	@FindBy(how = How.ID, using = "genderfemale")
	WebElement sexoFeminino;

	@FindBy(how = How.ID, using = "gendermale")
	WebElement sexoMasculino;

	@FindBy(how = How.ID, using = "streetaddress")
	WebElement endereco;

	@FindBy(how = How.ID, using = "country")
	WebElement pais;

	@FindBy(how = How.ID, using = "zipcode")
	WebElement cep;

	@FindBy(how = How.ID, using = "city")
	WebElement cidade;

	@FindBy(how = How.ID, using = "occupation")
	WebElement profissao;

	@FindBy(how = How.ID, using = "speeding")
	WebElement hobbiesSpeeding;

	@FindBy(how = How.ID, using = "bungeejumping")
	WebElement hobbiesBungeeJumping;

	@FindBy(how = How.ID, using = "cliffdiving")
	WebElement hobbiesCliffDiving;

	@FindBy(how = How.ID, using = "skydiving")
	WebElement hobbiesSkyDiving;

	@FindBy(how = How.ID, using = "other")
	WebElement hobbiesOther;

	@FindBy(how = How.ID, using = "website")
	WebElement website;

	@FindBy(how = How.ID, using = "picture")
	WebElement foto;

	@FindBy(how = How.ID, using = "nextenterproductdata")
	WebElement btnNext;

//Metodos de Preenchimento

	public void preencheNome(String nome) {
		this.nome.sendKeys(nome);
	}

	public void preencheSobrenome(String sobrenome) {
		this.sobrenome.sendKeys(sobrenome);
	}

	public void preencheDataNascimento(String dataNascimento) {
		this.dataNascimento.sendKeys(dataNascimento);
	}

	public void escolheSexo(char sexo) {
		if (sexo == 'M') {
			js.executeScript("arguments[0].click();", sexoMasculino);
		} else {
			js.executeScript("arguments[0].click();", sexoFeminino);
		}
	}

	public void preencheEndereco(String endereco) {
		this.endereco.sendKeys(endereco);
	}

	public void selecionaPais(String pais) {
		new Select(this.pais).selectByVisibleText(pais);
	}

	public void preencheCep(String cep) {
		this.cep.sendKeys(cep);
	}

	public void preencheCidade(String cidade) {
		this.cidade.sendKeys(cidade);
	}

	public void selecionaProfissao(String profissao) {
		new Select(this.profissao).selectByVisibleText(profissao);
	}

	public void escolheHobbie(String hobbie) {
		if (hobbie.equals("Spedding")) {
			js.executeScript("arguments[0].click();", hobbiesSpeeding);
		}
		if (hobbie.equals("Bungee Jumping")) {
			js.executeScript("arguments[0].click();", hobbiesBungeeJumping);
		}
		if (hobbie.equals("Cliff Diving")) {
			js.executeScript("arguments[0].click();", hobbiesCliffDiving);
		}
		if (hobbie.equals("Skydiving")) {
			js.executeScript("arguments[0].click();", hobbiesSkyDiving);
		}
		if (hobbie.equals("Outros")) {
			js.executeScript("arguments[0].click();", hobbiesOther);
		}
	}

	public void preencheWebsite(String Website) {
		this.website.sendKeys(Website);
	}

	public void preencheFoto(String foto) {
		this.foto.sendKeys(foto);
	}

	public void clicaBtnNext() {
		btnNext.click();
	}
}