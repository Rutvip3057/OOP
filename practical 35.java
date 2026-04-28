import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeBarChartFX extends Application {

    @Override
    public void start(Stage stage) {
        HBox root = new HBox(25);
        root.setAlignment(Pos.BOTTOM_CENTER);

        double scale = 4;

        root.getChildren().add(createBar("Projects — 20%", 20, Color.RED, scale));
        root.getChildren().add(createBar("Quizzes — 10%", 10, Color.BLUE, scale));
        root.getChildren().add(createBar("Midterm Exams — 30%", 30, Color.GREEN, scale));
        root.getChildren().add(createBar("Final Exam — 40%", 40, Color.ORANGE, scale));

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String labelText, int percentage, Color color, double scale) {
        Rectangle bar = new Rectangle(50, percentage * scale);
        bar.setFill(color);

        Text label = new Text(labelText);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}