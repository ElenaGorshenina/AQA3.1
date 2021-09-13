package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardRequestTest {
    @Test
    void shouldTest() {
        open("http://localhost:9999");
        $("[name='name']").setValue("Елена");
        $("[name='phone']").setValue("+79345678901");
        $("[data-test-id='agreement']").click();
        $("[type='button']").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
