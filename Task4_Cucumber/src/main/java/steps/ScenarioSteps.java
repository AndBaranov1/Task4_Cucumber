package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by 1 on 16.06.2018.
 */
public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    //error 404
    MainSteps mainSteps1 = new MainSteps();
    TravelsSteps travelsSteps = new TravelsSteps();
    Page1Step page1Step = new Page1Step();
    Page2Step page2Step = new Page2Step();



    @When("^выбран пункт меню \"(.+)\"$")
    public void stepSelectMainMenu(String menuItem){
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^выбран вид страхования \"(.+)\"$")
    public void stepSelectSubMenu(String menuItem){
        mainSteps.stepSelectSubMenu(menuItem);
    }
    /**
     * Добавлен дополнительный выбор, так как есть баг: При переходе на форму "Путешествия и покупки" ошибка 404.
     * Если еще раз кликуть на "Страхование", "Путешествия и покупки" то переходит на форму "Сбербанк страхование
     */

    @When("^выбран пункт меню1 \"(.+)\"$")
    public void stepSelec1tMainMenu(String menuItem){
        mainSteps1.stepSelect1MainMenu(menuItem);
    }

    @When("^выбран вид страхования1 \"(.+)\"$")
    public void stepSelect1SubMenu(String menuItem){
        mainSteps1.stepSelect1SubMenu(menuItem);
    }
    @Then("^заголовок страницы равен \"(.+)\"$")
    public void stepTitle(String title){
        travelsSteps.stepTitle(title);
    }
    @When("^выполнено нажатие на кнопку Оформить онлайн$")
    public void stepissueButtonTravels() {
        travelsSteps.stepissueButtonTravels();
    }
    @Then("переход на другую вкладку")
    public void switchTab() {
        travelsSteps.switchTab();
    }
    @When("^выполнен выбор суммы Минимальная$")
    public void stepSelectSum() {
        page1Step.stepSelectSum();
    }
    @When("^выполнено нажатие на кнопку Оформить$")
    public void stepissueButton() {
        page1Step.stepissueButton();
    }
    @When("^заполняются поля:$")
    public void stepFillField(DataTable fields) {
        fields.asMap(String.class, String.class).forEach((key, value)->page2Step.stepFillField(key, value));

    }
    @Then("^значения полей равны:$")
    public void stepCheckFillField(DataTable field) {
        field.asMap(String.class, String.class).forEach((key, value)->page2Step.stepCheckFillField(key, value));
    }

//    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке \"(.+)\"$")
//    public void stepPhone(String expectedPhone) {
//
//    }


    @When("^выполнено нажатие на кнопку Продолжить$")
    public void stepcontButton(){
        page2Step.stepcontButton();
    }
}
