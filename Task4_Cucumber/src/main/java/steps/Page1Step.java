package steps;

import pages.Page1;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by 1 on 14.06.2018.
 */
public class Page1Step {

    @Step("выполнен выбор минимальной суммы")
    public void stepSelectSum() {
        new Page1().titlesumma.click();
    }

    @Step("выполнено нажатие на кнопку - Оформить")
    public void stepissueButton() {
        new Page1().issueButton.click();
    }


}