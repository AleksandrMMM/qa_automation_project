import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("yandex")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class YandexMarket {

    @BeforeAll
    static void beforeOurTests() {
        System.out.println("text before all");
    }

    @BeforeEach
    void beforeOurEachTests() {
        System.out.println("text before each");
    }


    @Test
    @DisplayName("Positive test")
    void positiveTest() {
        open("https://market.yandex.ru/");

        $("#header-search").val("playstation").pressEnter();
        $(".link.n-link_theme_blue.link_type_cpc").click();
        $(byText("playstation")).should(exist);
    }
}

