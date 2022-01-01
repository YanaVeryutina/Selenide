package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelectorMode;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import java.nio.channels.Selector;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributerTest {

    @Test
    void firstContributorShouldBeAndreiSolntsev() {
        // Открыть страницу репозитория Селенида
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому элементу в области contributor
        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
                .$$("ul li").first().hover();

        // check: в появившемся окне текст Andrei Solntsev
        $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));
    sleep(5000);
    }

}
