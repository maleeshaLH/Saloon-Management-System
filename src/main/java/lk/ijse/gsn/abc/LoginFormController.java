package lk.ijse.gsn.abc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class
LoginFormController {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    private final String adminUserName = "admin";
    private final String adminPassword = "1234";
    private final String staffUserName = "staff";
    private final String stafPassword = "5678";

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        String enteredUserName = txtUserName.getText();
        String enteredPassword = txtPassword.getText();
        if (enteredUserName.equals(adminUserName) && enteredPassword.equals(adminPassword)){
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/admin_form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) rootNode.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Admin Form");
            stage.centerOnScreen();

            stage.show();
        } else if (enteredUserName.equals(staffUserName) && enteredPassword.equals(stafPassword)) {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/staff_form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) rootNode.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Staff Form");
            stage.centerOnScreen();

            stage.show();
        }


    }
}
