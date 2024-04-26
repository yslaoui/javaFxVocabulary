package vocabulary;

import javafx.application.Application;
import javafx.stage.Stage;

public class VocabularyJavaFx extends Application {
    @Override
    public void start(Stage window) {
        window.setTitle("Vocabulary app");
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyJavaFx.class);
    }

}
