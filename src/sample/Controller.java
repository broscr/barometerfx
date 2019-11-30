package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField barometer_hpa_text;
    public DatabaseDao dao = new DatabaseDao();

    @FXML
    private Label isConnected;

    public void pressButton() {

        String hpa = barometer_hpa_text.getText();
        System.out.println("Hpa: " + hpa);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (dao.idDbConnected()) {
            isConnected.setText("Connected");
            List<Meydanlar> meydanlarList = dao.selectAll();
            System.out.println(meydanlarList.size());
        } else {
            isConnected.setText("Not Connected");
        }
    }


}
