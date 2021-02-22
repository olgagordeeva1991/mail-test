package test;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import page.SearchLettersPage;
import page.SendEmailPage;
import page.SignUpPage;

public class SendEmailTest extends BaseTest {
    private String dataLogin = "gordeeva1991@mail.ru";
    private String dataPassword = System.getenv("password");
    private String dataFrom = "alina.work@shukurov.com";
    private String dataTo = "alina.work@shukurov.com";
    private String dataSubject = "Тестовое задание. Гордеева";

    @Test
    @Description(value = "Тест проверяет наличие письма на почте, подсчитывает кол-во и отправляет ответное письмо")
    @Owner("Гордеева Ольга")
    public void signUpTest() {
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.inputLogin(dataLogin);
        signUpPage.clickLoginBtn();
        signUpPage.inputPasswd(dataPassword);
        signUpPage.clickOnPasswrdBtn();

        SearchLettersPage searchLettersPage = PageFactory.initElements(driver, SearchLettersPage.class);
        searchLettersPage.clickOnSearchOnMailField();
        searchLettersPage.inputSearchData(dataFrom);
        searchLettersPage.clickOnSearchBtn();
        int letters = searchLettersPage.countLetters();
        String dataMessage = "Добрый день, найдено " + letters + " писем от " + dataFrom;

        SendEmailPage sendEmailPage = PageFactory.initElements(driver, SendEmailPage.class);
        sendEmailPage.openForm();
        sendEmailPage.fillFieldTo(dataTo);
        sendEmailPage.fillSubject(dataSubject);
        sendEmailPage.fillMessageField(dataMessage);
        sendEmailPage.clickSendBtn();
    }
}
