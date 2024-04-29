package vocabulary;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TranslationView {
    Dictionary dictionary;

    public TranslationView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Parent getView() {
        // UI Layout
        Label wordLabel = new Label("Word");
        Label translationLabel = new Label("Translation");
        TextField wordArea = new TextField();
        TextField translationArea = new TextField();
        Button addButton = new Button("Add the word pair ");

        // Component
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.add(wordLabel, 0, 0);
        pane.add(wordArea, 0, 1);
        pane.add(translationLabel, 0, 2);
        pane.add(translationArea, 0, 3);
        pane.add(addButton, 0, 4);
        return pane;
    }


}
