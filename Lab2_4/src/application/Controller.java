package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import compute.Computing;

public class Controller {

	@FXML
	private TextField TxtField;
	@FXML
	private Button ClearButton;
	@FXML	
	private Button SlashButton;
	private boolean SlashButtonEnable = false;
	@FXML
	private Button StarButton;
	private boolean StarButtonEnable;
	@FXML
	private Button MinusButton;
	private boolean MinusButtonEnable = false;
	@FXML
	private Button SevenButton;
	@FXML
	private Button EightButton;
	@FXML
	private Button NineButton;
	@FXML
	private Button PlusButton;
	private boolean PlusButtonEnable = false;
	@FXML
	private Button FourButton;
	@FXML
	private Button FiveButton;
	@FXML
	private Button SixButton;
	@FXML
	private Button OneButton;
	@FXML
	private Button TwoButton;
	@FXML
	private Button ThreeButton;
	@FXML
	private Button EnterButton;
	private boolean EnterButtonEnable = true;
	@FXML
	private Button ZeroButton;
	@FXML
	private Button DotButton;
	private boolean DotButtonEnble = false;
	@FXML
	private Alert errorAlert = new Alert(AlertType.ERROR);
       
    public void initialize() {
    	
    	ClearButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText("");
    	    	SlashButtonEnable = false;
    	    	StarButtonEnable = false;
    	    	MinusButtonEnable = false;
    	    	PlusButtonEnable = false;
    	    	DotButtonEnble = false;
    		}
    	});
    	
    	SlashButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    			if (!SlashButtonEnable) return;
    	    	TxtField.setText(TxtField.getText() + "/");
    	    	SlashButtonEnable = false;
    	    	StarButtonEnable = false;
    	    	MinusButtonEnable = false;
    	    	PlusButtonEnable = false;
    	    	DotButtonEnble = false;
    		}
    	});
    	
    	StarButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    			if (!StarButtonEnable) return;
    	    	TxtField.setText(TxtField.getText() + "*");
    	    	SlashButtonEnable = false;
    	    	StarButtonEnable = false;
    	    	MinusButtonEnable = false;
    	    	PlusButtonEnable = false;
    	    	DotButtonEnble = false;
    		}
    	});
    	
    	MinusButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    			if(!MinusButtonEnable) return;
    	    	TxtField.setText(TxtField.getText() + "-");
    	    	SlashButtonEnable = false;
    	    	StarButtonEnable = false;
    	    	MinusButtonEnable = false;
    	    	PlusButtonEnable = false;
    	    	DotButtonEnble = false;
    		}
    	});
    	
    	SevenButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "7");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	EightButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "8");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	NineButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "9");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	PlusButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    			if (!PlusButtonEnable) return;
    	    	TxtField.setText(TxtField.getText() + "+");
    	    	SlashButtonEnable = false;
    	    	StarButtonEnable = false;
    	    	MinusButtonEnable = false;
    	    	PlusButtonEnable = false;
    	    	DotButtonEnble = false;
    		}
    	});
    	
    	FourButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "4");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	FiveButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "5");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
  	
    	SixButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "6");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	OneButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "1");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	TwoButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "2");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	ThreeButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "3");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	EnterButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    if (!EnterButtonEnable) return;
    	    String expression = TxtField.getText();
    	    try{
    	    TxtField.setText(Computing.StrCompute(expression));
    		}
    		catch(Exception exc){
    			errorAlert.setHeaderText("Cannot compute the expresson");
    			errorAlert.setContentText("The error was:\n" + exc.getMessage());
    			errorAlert.showAndWait();
    		}}
    	});
    	
    	ZeroButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    	    	TxtField.setText(TxtField.getText() + "0");
    	    	SlashButtonEnable = true;
    	    	StarButtonEnable = true;
    	    	MinusButtonEnable = true;
    	    	PlusButtonEnable = true;
    	    	DotButtonEnble = true;
    		}
    	});
    	
    	DotButton.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent e) {
    			if (!DotButtonEnble) return;
    	    	TxtField.setText(TxtField.getText() + ".");
    	    	SlashButtonEnable = false;
    	    	StarButtonEnable = false;
    	    	MinusButtonEnable = false;
    	    	PlusButtonEnable = false;
    	    	DotButtonEnble = false;
    		}
    	});
    	
    	}
    
    
    
    
}
    
