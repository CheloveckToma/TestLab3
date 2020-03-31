package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView linearImg;

    @FXML
    private TextField linerX;

    @FXML
    private TextField linerY;

    @FXML
    private TextField linerZ;

    @FXML
    private Button linearBtn;

    @FXML
    private Label linearAnswer;

    @FXML
    private ImageView branchingImg;

    @FXML
    private TextField branchingX;

    @FXML
    private TextField branchingY;

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private Button branchingBtn;

    @FXML
    private Label branchingAnswer;

    @FXML
    private void initialize() {
        linearImg.setImage(new Image("/sample/linearAlgorithm.jpg"));
        branchingImg.setImage(new Image("/sample/branchingAlgorithm.jpg"));

        linearBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LinearAlgorithm linearAlgorithm = new LinearAlgorithm(parseDouble(linerX.getText()), parseDouble(linerY.getText()), parseDouble(linerZ.getText()));

                double answer = linearAlgorithm.solve();

                linearAnswer.setText("Ответ: " + answer);
            }
        });

        branchingBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                RadioButton radioButton = (RadioButton) radioGroup.getSelectedToggle();
                BranchingAlgorithm branchingAlg = new BranchingAlgorithm(parseDouble(branchingX.getText()), parseDouble(branchingY.getText()), parseInt(radioButton.getId()));
                branchingAnswer.setText("Ответ: " + branchingAlg.solve());
            }
        });
    }

    private double parseDouble(String str) {
        return Double.parseDouble(str);
    }

    private int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
