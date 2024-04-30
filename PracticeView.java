package vocabulary;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class PracticeView {
    Dictionary dictionary;
    String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Parent getView() {
        this.word = this.dictionary.getRandomWord();
        //         UI components
        Label translateLabel = new Label("Translate the word " + this.word);
        TextField inputField = new TextField();
        Button checkButton = new Button("Check");
        Button generateNewWordButton = new Button("Try another word");
        Label validationLabel = new Label("");


//         Layouts
        HBox actions = new HBox();
        actions.setSpacing(10);
        actions.getChildren().addAll(checkButton, generateNewWordButton);
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(5);
        pane.setHgap(10);
        pane.add(translateLabel, 0, 0);
        pane.add(inputField, 0, 1);
        pane.add(actions, 0, 2);
        pane.add(validationLabel, 0, 3);
//         Event listeners
        checkButton.setOnAction((event)->{
            if (inputField.getText().equals(this.dictionary.get(this.word))) {
                validationLabel.setText("Correct !");
            }
            else {
                validationLabel.setText("Incorrect ! Try again.");
                inputField.setText("");
            }
        });
        generateNewWordButton.setOnAction((event)->{
            String random = this.dictionary.getRandomWord();
            this.word = random;
            translateLabel.setText("Translate the word " + this.word);
            validationLabel.setText("");
            inputField.setText("");
            System.out.println(this.word);
        });

        return pane;

    }


}
