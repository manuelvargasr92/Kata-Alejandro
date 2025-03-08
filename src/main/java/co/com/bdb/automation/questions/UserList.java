package co.com.bdb.automation.questions;

import co.com.bdb.automation.ui.WebObjectEditUserUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;
import java.util.stream.Collectors;

public class UserList {

    public static Question<Boolean> doesNotContain(String username) {
        return actor -> {
            Question<java.util.Collection<String>> userListQuestion = Text.ofEach(WebObjectEditUserUI.USER_LIST_ITEMS);
            List<String> userList = userListQuestion.answeredBy(actor).stream().collect(Collectors.toList());
            return !userList.contains(username);
        };
    }
}