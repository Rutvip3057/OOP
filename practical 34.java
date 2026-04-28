import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RegistrationFormFX extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label rollLabel = new Label("Roll No:");
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(e -> {
            String rollText = rollField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

            int rollNo, age;

            try {
                rollNo = Integer.parseInt(rollText);
            } catch (Exception ex) {
                showError("Roll No must be an integer");
                return;
            }

            try {
                age = Integer.parseInt(ageText);
            } catch (Exception ex) {
                showError("Age must be an integer");
                return;
            }

            if (!email.contains("@") || !email.contains(".")) {
                showError("Invalid email format");
                return;
            }

            String data = "Roll No: " + rollNo +
                          "\nName: " + name +
                          "\nAge: " + age +
                          "\nEmail: " + email;

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Data");
            File file = fileChooser.showSaveDialog(stage);

            if (file != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(data);
                } catch (Exception ex) {
                    showError("Error saving file");
                    return;
                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Registration Successful");
            alert.setContentText(data);
            alert.showAndWait();
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    private void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Validation Failed");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}