package steps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.SampleappFormularioInsurantPage;
import pages.SampleappFormularioProductPage;
import pages.SampleappFormularioSelectPricePage;
import pages.SampleappFormularioSendQuotePage;
import pages.SampleappFormularioVehiclePage;

public class PreenchimentoFormularioSteps {

	WebDriver driver;

	SampleappFormularioVehiclePage formularioVehicleData;
	SampleappFormularioInsurantPage formularioInsurantData;
	SampleappFormularioProductPage formularioProductData;
	SampleappFormularioSelectPricePage formularioPriceOption;
	SampleappFormularioSendQuotePage formularioSendQuote;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", this.getClass().getResource("/chromedriver.exe").getPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		formularioVehicleData = new SampleappFormularioVehiclePage(driver);
		formularioInsurantData = new SampleappFormularioInsurantPage(driver);
		formularioProductData = new SampleappFormularioProductPage(driver);
		formularioPriceOption = new SampleappFormularioSelectPricePage(driver);
		formularioSendQuote = new SampleappFormularioSendQuotePage(driver);
	}

	@Dado("que o usuario esta no site {string}")
	public void que_o_usuario_esta_no_site(String url) {
		driver.navigate().to(url);
	}

	@Quando("preenche o formulário da aba “Enter Vehicle Data” e pressiona next")
	public void preenche_o_formulário_da_aba_enter_vehicle_data_e_pressiona_next() {
		formularioVehicleData.selecionaMarca("BMW");
		formularioVehicleData.selecionaModelo("Scooter");
		formularioVehicleData.preencheCapacidadeCilindro("20");
		formularioVehicleData.preencheDesempenhoMotor("15");
		formularioVehicleData.preencheDataFabricacao("03/13/2021");
		formularioVehicleData.selecionaNumeroAssentos("8");
		formularioVehicleData.ehDirecaoDireita(true);
		formularioVehicleData.selecionaNumeroAssentosMotocicleta("3");
		formularioVehicleData.selecionaTipoCombustivel("Diesel");
		formularioVehicleData.preencheCargaUtil("250");
		formularioVehicleData.preenchePesoTotal("200");
		formularioVehicleData.preencheNumeroPlaca("400ABC");
		formularioVehicleData.preenchePrecoTabela("3000");
		formularioVehicleData.preencheMilhagemAnual("50000");
		formularioVehicleData.clicaBtnNext();
	}

	@Quando("Preenche o formulário da aba “Enter Insurant Data” e pressiona next")
	public void preenche_o_formulário_da_aba_enter_insurant_data_e_pressiona_next() {
		formularioInsurantData.preencheNome("Fernanda");
		formularioInsurantData.preencheSobrenome("Lasso");
		formularioInsurantData.preencheDataNascimento("05/13/1999");
		formularioInsurantData.escolheSexo('f');
		formularioInsurantData.preencheEndereco("Rua A, 123 Apto.84");
		formularioInsurantData.selecionaPais("Ecuador");
		formularioInsurantData.preencheCep("898889");
		formularioInsurantData.preencheCidade("Rio de Janeiro");
		formularioInsurantData.selecionaProfissao("Employee");
		formularioInsurantData.escolheHobbie("Outros");
		formularioInsurantData.preencheWebsite("xxxxx.com.br");
		formularioInsurantData.clicaBtnNext();
		
	}

	@Quando("Preenche o formulário da aba “Enter Product Data” e pressiona next")
	public void preenche_o_formulário_da_aba_enter_product_data_e_pressiona_next() {
		formularioProductData.preencheDataInicio("08/16/2021");
		formularioProductData.selecionaValorSeguro("7.000.000,00");
		formularioProductData.selecionaClassificacao("Bonus 1");
		formularioProductData.selecionaCobertura("No Coverage");
		formularioProductData.escolheProdutoOpcional("Euro Protection");
		formularioProductData.selecionaCortesiaCarrro("Yes");
		formularioProductData.clicaBtnNext();
	}

	@Quando("Preenche o formulário da aba “Select Price Option” e pressiona next")
	public void preenche_o_formulário_da_aba_select_price_option_e_pressiona_next() {
		formularioPriceOption.selecionaPreco("Ultimate");
		formularioPriceOption.clicaBtnNext();
	}

	@Quando("Preenche o formulário da aba “Send Quote” e pressiona Send")
	public void preenche_o_formulário_da_aba_send_quote_e_pressiona_send() {
		formularioSendQuote.preencheEmail("teste@teste.com");
		formularioSendQuote.preencheTelefone("1122331122");
		formularioSendQuote.preencheUsuario("root");
		formularioSendQuote.preencheSenha("Admin1");
		formularioSendQuote.preencheConfirmacaoSenha("Admin1");
		formularioSendQuote.preencheComentario("Isto foi um teste automático");
		formularioSendQuote.clicaBtnEnviar();
	}
	
	@Então("verifica a mensagem {string} na tela")
	public void verifica_a_mensagem_na_tela(String mensagemEsperada) {
		assertEquals(mensagemEsperada, formularioSendQuote.popupMensagem());
	}

}
