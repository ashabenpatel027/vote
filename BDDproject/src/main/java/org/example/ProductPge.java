package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPage extends  Utils{
    private By _appleProductName =By.linkText("Apple MacBook Pro 13-inch");

public void userShouldReferAppleProductToFriend(){
    clickOnElement(_appleProductName);
}
    }


