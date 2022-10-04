package application;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller {
    
	@FXML
	private RadioButton FstOne;
	@FXML
	private RadioButton FstTwo;
	@FXML
	private RadioButton FstThr;
	@FXML
	private RadioButton FstFour;
	@FXML
	private RadioButton FstFive;
	@FXML
	private RadioButton FstSix;
	@FXML
	private RadioButton FstSev;
	@FXML
	private RadioButton FstEig;
	@FXML
	private RadioButton FstNine;
	@FXML
	private RadioButton FstTen;
	@FXML
	private RadioButton SecOne;
	@FXML
	private RadioButton SecTwo;
	@FXML
	private RadioButton SecThr;
	@FXML
	private RadioButton SecFour;
	@FXML
	private RadioButton SecFive;
	@FXML
	private RadioButton SecSix;
	@FXML
	private RadioButton SecSev;
	@FXML
	private RadioButton SecEig;
	@FXML
	private RadioButton SecNine;
	@FXML
	private RadioButton SecTen;
	@FXML
	private RadioButton ThirdOne;
	@FXML
	private RadioButton ThirdTwo;
	@FXML
	private RadioButton ThirdThr;
	@FXML
	private RadioButton ThirdFour;
	@FXML
	private RadioButton ThirdFive;
	@FXML
	private RadioButton ThirdSix;
	@FXML
	private RadioButton ThirdSev;
	@FXML
	private RadioButton ThirdEig;
	@FXML
	private RadioButton ThirdNine;
	@FXML
	private RadioButton ThirdTen;
	@FXML
	private Button ResetButton;
	@FXML
	private Canvas FirstCanvas;
	@FXML
	private Label FirstCanvasLabel;
	@FXML
	private Canvas SecondCanvas;
	@FXML
	private Label SecondCanvasLabel;
	@FXML
	private Canvas ThirdCanvas;
	@FXML
	private Label ThirdCanvasLabel;
	
	private ToggleGroup firstGroup;
	private ToggleGroup secondGroup;
	private ToggleGroup thirdGroup;
	
    public void initialize() {
    		firstGroup = new ToggleGroup();
    		secondGroup = new ToggleGroup();
    		thirdGroup = new ToggleGroup();
    	   	FstOne.setToggleGroup(firstGroup);
        	FstTwo.setToggleGroup(firstGroup);
        	FstThr.setToggleGroup(firstGroup);
        	FstFour.setToggleGroup(firstGroup);
        	FstFive.setToggleGroup(firstGroup);
        	FstSix.setToggleGroup(firstGroup);
        	FstSev.setToggleGroup(firstGroup);
        	FstEig.setToggleGroup(firstGroup);
        	FstNine.setToggleGroup(firstGroup);
        	FstTen.setToggleGroup(firstGroup);
        	SecOne.setToggleGroup(secondGroup);
        	SecTwo.setToggleGroup(secondGroup);
        	SecThr.setToggleGroup(secondGroup);
        	SecFour.setToggleGroup(secondGroup);
        	SecFive.setToggleGroup(secondGroup);
        	SecSix.setToggleGroup(secondGroup);
        	SecSev.setToggleGroup(secondGroup);
        	SecEig.setToggleGroup(secondGroup);
        	SecNine.setToggleGroup(secondGroup);
        	SecTen.setToggleGroup(secondGroup);
        	ThirdOne.setToggleGroup(thirdGroup);  
        	ThirdTwo.setToggleGroup(thirdGroup);  
        	ThirdThr.setToggleGroup(thirdGroup);  
        	ThirdFour.setToggleGroup(thirdGroup);  
        	ThirdFive.setToggleGroup(thirdGroup);  
        	ThirdSix.setToggleGroup(thirdGroup);  
        	ThirdSev.setToggleGroup(thirdGroup);  
        	ThirdEig.setToggleGroup(thirdGroup);  
        	ThirdNine.setToggleGroup(thirdGroup);  
        	ThirdTen.setToggleGroup(thirdGroup); 
        	
        	GraphicsContext FirstGC = FirstCanvas.getGraphicsContext2D();
        	GraphicsContext SecondGC = SecondCanvas.getGraphicsContext2D();
        	GraphicsContext ThirdGC = ThirdCanvas.getGraphicsContext2D();
        	
        	Paint basePaint = Color.LIGHTGRAY;
	    	FirstGC.setFill(basePaint);
	    	FirstGC.fillRect(0, 0, 100, 16);
 	    	SecondGC.setFill(basePaint);
 	    	SecondGC.fillRect(0, 0, 100, 16);
        	ThirdGC.setFill(basePaint);
 	    	ThirdGC.fillRect(0, 0, 100, 16);
    	
        	firstGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
                   
                   public void changed(ObservableValue<? extends Toggle> changed, Toggle oldValue, Toggle newValue){
                        
                    RadioButton selectedBtn = (RadioButton) newValue;
                    if (selectedBtn == null) {
            	    	FirstGC.setFill(basePaint);
            	    	FirstGC.fillRect(0, 0, 100, 16);
            	    	FirstCanvasLabel.setText("");
                    }else {
                    FirstGC.setFill(Paint.valueOf(selectedBtn.getStyle().substring(16, 22)));
                    FirstGC.fillRect(0, 0, 100, 16);
                    FirstCanvasLabel.setStyle(selectedBtn.getStyle());
                    FirstCanvasLabel.setText(selectedBtn.getText());
                    }
                    }
                });
        	
        	secondGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
                
                public void changed(ObservableValue<? extends Toggle> changed, Toggle oldValue, Toggle newValue){
                     
                 RadioButton selectedBtn = (RadioButton) newValue;
                 if (selectedBtn == null) {
         	    	SecondGC.setFill(basePaint);
         	    	SecondGC.fillRect(0, 0, 100, 16);
         	    	SecondCanvasLabel.setText("");
                 }else {
                 SecondGC.setFill(Paint.valueOf(selectedBtn.getStyle().substring(16, 22)));
                 SecondGC.fillRect(0, 0, 100, 16);
                 SecondCanvasLabel.setStyle(selectedBtn.getStyle());
                 SecondCanvasLabel.setText(selectedBtn.getText());
                 }
                 }
             });
        	
        	thirdGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
                
                public void changed(ObservableValue<? extends Toggle> changed, Toggle oldValue, Toggle newValue){
                     
                 RadioButton selectedBtn = (RadioButton) newValue;
                 if (selectedBtn == null) {
                	ThirdGC.setFill(basePaint);
         	    	ThirdGC.fillRect(0, 0, 100, 16);
         	    	ThirdCanvasLabel.setText("");
                 }else {
                 ThirdGC.setFill(Paint.valueOf(selectedBtn.getStyle().substring(16, 22)));
                 ThirdGC.fillRect(0, 0, 100, 16);
                 ThirdCanvasLabel.setStyle(selectedBtn.getStyle());
                 ThirdCanvasLabel.setText(selectedBtn.getText());
                 }
                 }
             });
        	
        	ResetButton.setOnAction(new EventHandler<ActionEvent>() {
        		@Override
        		public void handle(ActionEvent e) {
        			if (firstGroup.getSelectedToggle() != null) firstGroup.getSelectedToggle().setSelected(false);
        			if (secondGroup.getSelectedToggle() != null) secondGroup.getSelectedToggle().setSelected(false);
        			if (thirdGroup.getSelectedToggle() != null) thirdGroup.getSelectedToggle().setSelected(false);
        	    	}
        	});
    }
}
    	    
    
