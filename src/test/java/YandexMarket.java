import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class YandexMarket {
    public static void main(String[] args) {
        open("https://market.yandex.ru/");

        $("#header-search").val("playstation").pressEnter();
        $(".link.n-link_theme_blue.link_type_cpc").click();
        $(byText("playstation")).should(exist);
    }
}

