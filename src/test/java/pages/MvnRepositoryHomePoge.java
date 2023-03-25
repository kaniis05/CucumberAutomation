package pages;


import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MvnRepositoryHomePoge {

    public MvnRepositoryHomePoge(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "query")
    public WebElement searchInputBox;

    @FindBy(xpath = "//h2[@class='im-title']")
    public List<WebElement> searchResultTitles;

}
