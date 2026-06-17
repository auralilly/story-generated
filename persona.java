import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Persona extends Application {

    // Persona-themed options
    private final String[][] options = {
        {"Ren Amamiya", "Makoto Niijima", "Ryuji Sakamoto", "Ann Takamaki", "Yusuke Kitagawa"},
        {"summoned their Persona", "struck down a powerful Shadow", "infiltrated the Palace", "made a pact with a demon", "awakened a new power"},
        {"the Metaverse Palace", "Mementos' depths", "the Velvet Room", "a distorted Tokyo", "the Cognitive World"},
        {"a katana that cuts through lies", "a revolver of rebellion", "a whip of passion", "a paintbrush of creation", "a mask of trickery"},
        {"The Fool", "The Magician", "The Priestess", "The Chariot", "The Lovers"}
    };

    private final String[] selections = new String[5];
    //i know the style isn't good practice
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #0f0f1e; -fx-font-family: 'Segoe UI';");

        Label title = new Label("PERSONA AWAKENING");
        title.setStyle("-fx-font-size: 28px; -fx-text-fill: #ff00aa; -fx-font-weight: bold;");

        Label subtitle = new Label("Choose your fate... The Velvet Room is calling.");
        subtitle.setStyle("-fx-text-fill: #a0ffff; -fx-font-size: 14px;");

        Button[] buttons = new Button[5];
        Label[] labels = new Label[5];

        for (int i = 0; i < 5; i++) {
            final int index = i;
            buttons[i] = new Button("Arcana " + (i + 1));
            labels[i] = new Label("---");

            buttons[i].setStyle("-fx-background-color: #1a0033; -fx-text-fill: #00ffff; -fx-border-color: #ff00aa; -fx-border-width: 2; -fx-padding: 12px;");

            buttons[i].setOnAction(e -> {
                if (selections[index] == null) {
                    selections[index] = options[index][0];
                } else {
                    int pos = java.util.Arrays.asList(options[index]).indexOf(selections[index]);
                    selections[index] = options[index][(pos + 1) % options[index].length];
                }
                labels[index].setText(selections[index]);
            });

            root.getChildren().addAll(new Label("Part " + (i+1) + ":"), buttons[i], labels[i]);
        }