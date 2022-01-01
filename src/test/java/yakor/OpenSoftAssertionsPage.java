package yakor;


import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class OpenSoftAssertionsPage {

    @Test
    void shouldFindJUnit5CodeExample() {

        //Откройте страницу Selenide в Github
        open("https://github.com");
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").click();
        $("#wiki-pages-filter").setValue("soft");
        //Откройте страницу SoftAssertions
        $$(".Box-row").findBy(text("SoftAssertions")).click();
        //проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("JUnit5"));

    }
}
