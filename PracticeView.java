package vocabulary;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    Dictionary dictionary;
    String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Parent getView() {
        // UI components
        Label translateLabel = new Label("Translate the word Sultan");
        TextField inputField = new TextField();
        Button checkButton = new Button("Check");
        Label validationLabel = new Label("");

        // Layouts
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.add(translateLabel, 0, 0);
        pane.add(inputField, 0, 1);
        pane.add(checkButton, 0, 2);
        pane.add(validationLabel, 0, 3);


        return pane;

    }


}
