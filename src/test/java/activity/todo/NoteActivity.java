package activity.todo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class NoteActivity {

    public TextBox enterTitle;
    public TextBox enterNote;
    public Button saveButton;

    public NoteActivity() {

        enterTitle = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        enterNote = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    }
}
