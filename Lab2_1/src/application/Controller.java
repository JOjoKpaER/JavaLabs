package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private Button arrow;
    @FXML
    private TextField lText, rText;
    
    private ImageView rArrow, lArrow; 
    private boolean isLeft;

    public void initialize() {
	   	Image rA = new Image("UI/rArrow.png");
    	Image lA = new Image("UI/lArrow.png");
    	
    	rArrow = new ImageView(rA);
    	lArrow = new ImageView(lA);
    	
    	isLeft = true;
    	arrow.setGraphic(lArrow);
    	}
    
    @FXML
    private void buttonClicked() {
    	if(isLeft) {
    	arrow.setGraphic(rArrow);// here comes the arrow switch method
    	isLeft = false;
    	}else {
    	arrow.setGraphic(lArrow);// here comes the arrow switch method
    	isLeft = true;
    	}
    	String s = lText.getText();
    	lText.setText(rText.getText());
    	rText.setText(s);
    	
    }
    
}
