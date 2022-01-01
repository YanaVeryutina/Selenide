package yakor;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class MoveFigure {

    @Test
    void shoudMoveFiqureAToB(){

        open("https://the-internet.herokuapp.com/drag_and_drop");
        //зажать квадрат А перенести на место квадрата В
        $("#column-b").dragAndDropTo($("#column-a"));
        //Проверить, корректность перенесение квадратов
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));

    }
}
