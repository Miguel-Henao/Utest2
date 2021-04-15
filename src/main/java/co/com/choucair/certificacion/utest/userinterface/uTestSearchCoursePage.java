package co.com.choucair.certificacion.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class uTestSearchCoursePage extends PageObject {
    public static final Target BUTTON_AU = Target.the("Select the uTest academy").located(By.xpath("//div[@class='nav-sidebar-item__link nav-sidebar-item__link--selected']//strong]"));
    public static final Target INPUT_COURSE = Target.the("Search the course").located(By.id("searchInput"));
    public static final Target BUTTON_GO = Target.the("Click to search the course").located(By.xpath("//span[contains(@class,'ntux-nav-header-search__icon'"));
    public static final Target SELECT_COURSE = Target.the("Select the course").located(By.xpath("//h2[contains(@text(),'1. Introduction to uTest')]"));
    public static final Target NAME_COURSE = Target.the("Extract the name of the course").located(By.xpath("//h1[contains(@text(),'Welcome to uTest')]"));
}
