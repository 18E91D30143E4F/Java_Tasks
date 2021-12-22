package sample;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button btnAdd1;

    @FXML
    private Button btnAdd2;

    @FXML
    private Button btnAdd3;

    @FXML
    private Button btnDelete1;

    @FXML
    private Button btnDelete2;

    @FXML
    private Button btnDelete3;

    @FXML
    private Button btnEdit1;

    @FXML
    private Button btnEdit2;

    @FXML
    private Button btnEdit3;

    @FXML
    private Button btnMove;

    @FXML
    private CheckBox gp1cb1;

    @FXML
    private CheckBox gp1cb2;

    @FXML
    private CheckBox gp1cb3;

    @FXML
    private CheckBox gp2cb1;

    @FXML
    private CheckBox gp2cb2;

    @FXML
    private CheckBox gp2cb3;

    @FXML
    private ListView<String> lv1;

    @FXML
    private ListView<String> lv2;

    @FXML
    private ListView<String> lv3;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf3;

    @FXML
    void btnAdd1Click(ActionEvent event) {
        lv1.getItems().add(tf1.getText());
    }

    @FXML
    void btnAdd2Click(ActionEvent event) {
        lv2.getItems().add(tf2.getText());
    }

    @FXML
    void btnAdd3Click(ActionEvent event) {
        lv3.getItems().add(tf3.getText());
    }

    void deleteSelectedItem(ListView<String> lv) {
        final int selectedIdx = lv.getSelectionModel().getSelectedIndex();
        lv.getItems().remove(selectedIdx);
    }

    void editSelectedItem(ListView<String> lv, TextField tf) {
        String item = tf.getText();
        int index = lv.getSelectionModel().getSelectedIndex();
        if (item != "" && index != -1) {
            ObservableList<String> items = lv.getItems();
            items.set(index, item);
            lv.setItems(items);
        }
    }

    void moveItem(ListView<String> lvSource, ListView<String> lvDest) {
        String item = lvSource.getSelectionModel().getSelectedItem();

        deleteSelectedItem(lvSource);
        lvDest.getItems().add(item);
    }

    @FXML
    void btnDelete1Click(ActionEvent event) {
        deleteSelectedItem(lv1);
    }

    @FXML
    void btnDelete2Click(ActionEvent event) {
        deleteSelectedItem(lv2);
    }

    @FXML
    void btnDelete3Click(ActionEvent event) {
        deleteSelectedItem(lv3);
    }

    @FXML
    void btnEdit1Click(ActionEvent event) {
        editSelectedItem(lv1, tf1);
    }

    @FXML
    void btnEdit2Click(ActionEvent event) {
        editSelectedItem(lv2, tf2);
    }

    @FXML
    void btnEdit3Click(ActionEvent event) {
        editSelectedItem(lv2, tf2);
    }

    @FXML
    void btnMoveClick(ActionEvent event) {
        ListView<String> source = null, dest = null;

        if (gp1cb1.isSelected()) source = lv1;
        else if (gp1cb2.isSelected()) source = lv2;
        else if (gp1cb3.isSelected()) source = lv3;

        if (gp2cb1.isSelected()) dest = lv1;
        else if (gp2cb2.isSelected()) dest = lv2;
        else if (gp2cb3.isSelected()) dest = lv3;

        moveItem(source, dest);
    }

    @FXML
    void initialize() {

    }
}
