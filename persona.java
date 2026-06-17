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