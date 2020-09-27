package testTarea;

import activity.todo.MainActivity;
import activity.todo.NoteActivity;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class todoTest {

    MainActivity mainActivity = new MainActivity();
    NoteActivity noteActivity = new NoteActivity();
    String Title = "ToDoNote1";

    @Test
    public void createNote() throws MalformedURLException {

        mainActivity.addNoteButton.click();
        noteActivity.enterTitle.type(Title);
        noteActivity.enterNote.type("This is a test note");
        noteActivity.saveButton.click();

        // Verificacion

        Assert.assertTrue("Error ! the note doesn't exist", mainActivity.isDisplayedNote(Title));
    }

    @Test
    public void deleteNote() throws MalformedURLException {

        mainActivity.note1Label.longClick();
        mainActivity.deleteButton.click();
        mainActivity.confirmDeleteButton.click();

        // Verificacion

        Assert.assertFalse("Error ! the note was not deleted", mainActivity.isDisplayedNote(Title));

    }

    @AfterClass
    public static void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
