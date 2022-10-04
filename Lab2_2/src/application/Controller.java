package application;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ProgressBar;

public class Controller {

    @FXML
    private CheckBox cBox1, cBox2, cBox3;
    @FXML
    private DatePicker dPicker;
    @FXML
    private ColorPicker cPicker;
    @FXML
    private ProgressBar pBar;
    
    public void initialize() {
    	cBox1.setSelected(true);
    	cBox2.setSelected(true);
    	cBox3.setSelected(true);    	
    	}
    
    @FXML
    private void cBox1Clicked() {
    	if(!cBox1.isSelected()) {
    		dPicker.setVisible(false);
    	}else {
    		dPicker.setVisible(true);
    	}
    }
    
    @FXML
    private void cBox2Clicked() {
    	if(!cBox2.isSelected()) {
    		cPicker.setVisible(false);
    	}else{
    		cPicker.setVisible(true);
    	}
    }
    
    @FXML
    private void cBox3Clicked() {
    	if(!cBox3.isSelected()) {
    		pBar.setVisible(false);
    	}else {
    		pBar.setVisible(true);
    	}
    }
}
