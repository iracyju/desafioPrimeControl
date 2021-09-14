package br.com.primecontrol.pages;

import br.com.primecontrol.core.Driver;
import br.com.primecontrol.maps.TrabalheConoscoMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class TrabalheConoscoPage {
    TrabalheConoscoMap trabalheConoscoMap;
    public TrabalheConoscoPage(){
        trabalheConoscoMap = new TrabalheConoscoMap();
        PageFactory.initElements(Driver.getDriver(), trabalheConoscoMap);
    }

    public TrabalheConoscoPage clickContato(){
        trabalheConoscoMap.linkContato.click();
        return this;
    }
    public TrabalheConoscoPage clickTrabalheConosco(){
        trabalheConoscoMap.linkTrabalheConosco.click();
        return this;
    }
    public TrabalheConoscoPage clickCurriculo(){
        trabalheConoscoMap.btnCurriculo.click();
        return this;
    }
    public TrabalheConoscoPage setNome(String nome){
        trabalheConoscoMap.inpNome.sendKeys(nome);
        return this;
    }
    public TrabalheConoscoPage setCargo(String cargo){
        trabalheConoscoMap.inpCargo.sendKeys(cargo);
        return this;
    }
    public TrabalheConoscoPage setPretensao(String pretensao){
        trabalheConoscoMap.inpPretensao.sendKeys(pretensao);
        return this;
    }
    public TrabalheConoscoPage setEmail(String email){
        trabalheConoscoMap.inpEmail.sendKeys(email);
        return this;
    }
    public TrabalheConoscoPage setTelefone(String telefone){
        trabalheConoscoMap.inpTelefone.sendKeys(telefone);
        return this;
    }
    public TrabalheConoscoPage selectPais(String pais){
        Select select = new Select(trabalheConoscoMap.slcPais);
        select.selectByVisibleText(pais);
        return this;
    }
    public TrabalheConoscoPage setEstado(String estado){
        trabalheConoscoMap.inpEstado.sendKeys(estado);
        return this;
    }
    public TrabalheConoscoPage setCidade(String cidade){
        trabalheConoscoMap.inpCidade.sendKeys(cidade);
        return this;
    }
    public TrabalheConoscoPage setBairro(String bairro){
        trabalheConoscoMap.inpBairro.sendKeys(bairro);
        return this;
    }
    public TrabalheConoscoPage setEndereco(String endereco){
        trabalheConoscoMap.inpEndereco.sendKeys(endereco);
        return this;
    }
    public TrabalheConoscoPage setCep(String cep){
        trabalheConoscoMap.inpCep.sendKeys(cep);
        return this;
    }

    public void setFileCurriculo(String caminho){
        File file = new File("src\\test\\resources\\"+caminho);

        trabalheConoscoMap.fileCurriculo.sendKeys(file.getAbsolutePath());
    }

    public TrabalheConoscoPage clickFinalizar(){
        Driver.waitExplicit(2000);
        trabalheConoscoMap.btnFinalizar.click();
        return this;
    }

    public String getTextCadastroSucesso(){
        Driver.visibilityOf(trabalheConoscoMap.textCadastroSucesso);
       return trabalheConoscoMap.textCadastroSucesso.getText();
    }
}

