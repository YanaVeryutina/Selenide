package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

    @Test
    void shouldFindSelenideRepositoryInGitHub() {
        //открыть страницу githun.com
        open("https://github.com/");
        //ввести в поле selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        //Нажать на линк от первого результата поиска
        $$("ul.repo-list li").first().$("a").click();
        // проверить в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
    }
}
