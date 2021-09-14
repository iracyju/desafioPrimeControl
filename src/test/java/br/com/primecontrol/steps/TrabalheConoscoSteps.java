package br.com.primecontrol.steps;

import br.com.primecontrol.core.Driver;
import br.com.primecontrol.enums.Browser;
import br.com.primecontrol.pages.TrabalheConoscoPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrabalheConoscoSteps {
    TrabalheConoscoPage trabalheConoscoPage;

    @Before
    public void iniciaNavegador(Scenario cenario){
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();
    }

    @After
    public void fechaNavegador(Scenario cenario){
        Driver.getDriver().quit();
    }

    @Dado("que esteja na pagina na pagina principal")
    public void queEstejaNaPaginaNaPaginaPrincipal() {
        Driver.getDriver().get("https://www.primecontrol.com.br/");
        trabalheConoscoPage = new TrabalheConoscoPage();
    }
    @Dado("acesse a pagina trabalhe conosco")
    public void acesseAPaginaTrabalheConosco() throws IOException {
        Driver.printScreen("Pagina Principal");
        trabalheConoscoPage.clickContato()
                .clickTrabalheConosco()
                .clickCurriculo();

        List<String> abas = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(abas.get(1));


    }
    @Quando("o formulario for preenchido com os valores")
    public void oFormularioForPreenchidoComOsValores(Map<String, String> map) throws IOException {
        trabalheConoscoPage.setNome(map.get("nome"))
                .setCargo(map.get("cargo"))
                .setPretensao(map.get("pretencao"))
                .setEmail(map.get("email"))
                .setTelefone(map.get("telefone"))
                .selectPais(map.get("pais"))
                .setEstado(map.get("estado"))
                .setCidade(map.get("cidade"))
                .setBairro(map.get("bairro"))
                .setEndereco(map.get("endereco"))
                .setCep(map.get("cep"))
                .setFileCurriculo(map.get("curriculo"));
        Driver.printScreen("Formulario Preenchido");
    }
    @Quando("o botao de finalizar for realizado o clique")
    public void oBotaoDeFinalizarForRealizadoOClique() {
        trabalheConoscoPage.clickFinalizar();
    }
    @Entao("cadastro realizado")
    public void cadastroRealizado() throws IOException {
        Assert.assertEquals("Seu currículo foi recebido com sucesso.\n" +
                "Obrigado!",trabalheConoscoPage.getTextCadastroSucesso());

        Driver.printScreen("Formulario Enviado");
    }
}
