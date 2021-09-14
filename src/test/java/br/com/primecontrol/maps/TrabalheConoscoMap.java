package br.com.primecontrol.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrabalheConoscoMap {
    @FindBy(linkText = "CONTATO")
    public WebElement linkContato;
    @FindBy(css = "#menu-item-2156 > a")
    public WebElement linkTrabalheConosco;
    @FindBy(linkText = "CADASTRE SEU CURRÍCULO")
    public WebElement btnCurriculo;
    @FindBy(css = "#name")
    public WebElement inpNome;
    @FindBy(css = "#headline")
    public WebElement inpCargo;
    @FindBy(css = "#salary")
    public WebElement inpPretensao;
    @FindBy(css = "#email")
    public WebElement inpEmail;
    @FindBy(css = "#phone-0")
    public WebElement inpTelefone;
    @FindBy(css = "#country")
    public WebElement slcPais;
    @FindBy(css = "#region")
    public WebElement inpEstado;
    @FindBy(css = "#city")
    public WebElement inpCidade;
    @FindBy(css = "#neighborhood")
    public WebElement inpBairro;
    @FindBy(css = "#address")
    public WebElement inpEndereco;
    @FindBy(css = "#zipcode")
    public WebElement inpCep;
    @FindBy(css = "#validatedCustomFile")
    public WebElement fileCurriculo;
    @FindBy(css = "button[type='submit']")
    public WebElement btnFinalizar;
    @FindBy(css = "h2")
    public WebElement textCadastroSucesso;


}
