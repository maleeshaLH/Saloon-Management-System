package lk.ijse.gsn.abc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminFormController {
    @FXML
    private AnchorPane pane;

    @FXML
    void btnEmployeeOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/employee_form.fxml")));
    }

    @FXML
    void btnMemberOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/member_form.fxml")));
    }

    @FXML
    void btnInventoryOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/inventory_form.fxml")));
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/report_form.fxml")));
    }

}
