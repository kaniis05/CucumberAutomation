package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeHomePage {

    public DemoBlazeHomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "signing2")

    public WebElement singUoBtn;


    @FindBy(id = "sign-ussername ")
    public  WebElement formEmailInputBox;


    @FindBy(id ="sign-password")
    public WebElement fromPasswordIpuntBox;


   @FindBy(xpath = "//button[.= 'Sing up']")
    public WebElement fromSigUpBth;


}
