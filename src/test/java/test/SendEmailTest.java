package test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import page.SearchLettersPage;
import page.SendEmailPage;
import page.SignUpPage;

public class SendEmailTest extends BaseTest {
    private String dataLogin = "gordeeva1991@mail.ru";
    private String dataPassword= System.getenv("password");
    private String dataFrom = "Alina Shukurova <alina.work@shukurov.com>";
    private String dataTo = "gordeeva1991@mail.ru";
    private String dataSubject = "Тестовое задание. Гордеева";
    private String dataMessage = "Hello, we found %d messages from %s";


    @Test
    public void signUpTest() {
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.inputLogin(dataLogin);
        signUpPage.clickLoginBtn();
        signUpPage.inputPasswd(dataPassword);
        signUpPage.clickOnPasswrdBtn();

        SearchLettersPage searchLettersPage = PageFactory.initElements(driver, SearchLettersPage.class);
        searchLettersPage.clickOnSearch();
        searchLettersPage.inputSearch(dataFrom);

        SendEmailPage sendEmailPage = PageFactory.initElements(driver, SendEmailPage.class);
        sendEmailPage.openForm();
        sendEmailPage.fillFieldTo(dataTo);
        sendEmailPage.openSubjectForm();
        sendEmailPage.fillSubject(dataSubject);
        sendEmailPage.fillMessageField();
        sendEmailPage.makeMessage();
    }
}
