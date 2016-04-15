package ru.qatools.school.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qatools.school.pages.blocks.WeatherWidget;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;

/**
 * Created by kurau.
 */
public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    @Name("Список виджетов")
    @FindBy(css = ".card.card_md")
    private List<WeatherWidget> weatherWidget;

    @Name("Кнопка добавления города")
    @FindBy(css = ".new-card")
    private WebElement addCityButton;

    @Name("Всплывающее меню")
    @FindBy(css = ".city")
    private WebElement popUpMenu;

    public List<WeatherWidget> getWeatherWidget() {
        return weatherWidget;
    }

    public WebElement getAddCityButton() {
        return addCityButton;
    }

    public WebElement getPopUpMenu() {
        return popUpMenu;
    }

}
