package vocabulary;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

public class VocabularyJavaFx extends Application {

    Dictionary dictionary;
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage window) {
        // UI components
        Button inputButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        // layouts
        TranslationView translationView = new TranslationView(dictionary);
        Parent translationLayout  = translationView.getView();
        HBox menu = new HBox();
        menu.setSpacing(10);
        menu.setPadding(new Insets(20, 20, 20, 20));
        BorderPane pane = new BorderPane();
        menu.getChildren().addAll(inputButton, practiceButton);
        pane.setTop(menu);
        pane.setCenter(translationLayout);

        // Scenes
        Scene scene = new Scene(pane);

        // Windows
        window.setScene(scene);
        window.setTitle("Vocabulary app");
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyJavaFx.class);
    }
}
