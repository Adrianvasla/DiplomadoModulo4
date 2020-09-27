package activity.todo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;


public class MainActivity {

    public Button addNoteButton;
    public Button deleteButton;
    public Button confirmDeleteButton;
    public Label note1Label;


    public MainActivity(){

        addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
        confirmDeleteButton = new Button(By.id("android:id/button1"));
        note1Label = new Label(By.xpath("//android.widget.ListView[@resource-id='com.vrproductiveapps.whendo:id/notesList']/android.view.ViewGroup"));
    }

    public boolean isDisplayedNote(String noteTitle){
        String locator="//android.widget.TextView[@text='"+noteTitle+"']";
        Label note = new Label(By.xpath(locator));
        return note.isDisplayed();
    }

}
