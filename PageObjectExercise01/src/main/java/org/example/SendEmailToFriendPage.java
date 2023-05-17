package org.example;

import org.openqa.selenium.By;

public class EmailToFriendPage extends Utils {
    //private By _appleProduct=By.xpath("//a[@ href=\\\"/apple-macbook-pro-13-inch\\\"]\"");
    private By _emailAFriend =By.className("email-a-friend");
    private By _EnterFriendEmail = By.className("friend-email");
    private By _yourEmail =By.className("yourEmail");
    private By _sendEmailButton =By.name("send-email");

public void enterFriendsDetail(){
    //click on product
    clickOnElement(By.xpath("//a[@ href=\\\"/apple-macbook-pro-13-inch\\\"]\""));
    //click on email a friend
    clickOnElement(_emailAFriend);
    //Enter friend email
    typeText(_EnterFriendEmail,"testmail+\" + timestamp() + \"@gmail.com");
    //Enter your email
    typeText(_yourEmail,"test1235+\" + timestamp() + \"@gmail.com");
    //click on send email button
    clickOnElement(_sendEmailButton);




}
}
