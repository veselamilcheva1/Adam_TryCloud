package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
