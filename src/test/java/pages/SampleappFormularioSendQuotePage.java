package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleappFormularioSendQuotePage {
	
	WebDriverWait wait;

	public SampleappFormularioSendQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
	}

// Mapeando Elementos do Formulario “Enter Vehicle Data”

	@FindBy(how = How.ID, using = "email")
	WebElement email;

	@FindBy(how = How.ID, using = "phone")
	WebElement telefone;

	@FindBy(how = How.ID, using = "username")
	WebElement usuario;

	@FindBy(how = How.ID, using = "password")
	WebElement senha;

	@FindBy(how = How.ID, using = "confirmpassword")
	WebElement confirmaSenha;

	@FindBy(how = How.ID, using = "Comments")
	WebElement comentarios;
	
	@FindBy(how = How.ID, using = "sendemail")
	WebElement btnEnviar;
	
	@FindBy(how = How.XPATH, using = "//div[@class='sweet-alert showSweetAlert visible']//h2")
	WebElement mensagemAlerta;

// Metodos de Preenchimento

	public void preencheEmail(String email) {
		this.email.sendKeys(email);
	}

	public void preencheTelefone(String telefone) {
		this.telefone.sendKeys(telefone);
	}

	public void preencheUsuario(String usuario) {
		this.usuario.sendKeys(usuario);
	}

	public void preencheSenha(String senha) {
		this.senha.sendKeys(senha);
	}

	public void preencheConfirmacaoSenha(String senha) {
		confirmaSenha.sendKeys(senha);
	}

	public void preencheComentario(String comentario) {
		this.comentarios.sendKeys(comentario);
	}
	
	public void clicaBtnEnviar() {
		btnEnviar.click();
	}
	
	public String popupMensagem() {
		wait.until(ExpectedConditions.visibilityOf(mensagemAlerta));
		System.out.println(" A MENSAGEM É "+mensagemAlerta.getText());
		return mensagemAlerta.getText();
	}

}
