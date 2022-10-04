package application;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import structs.Item;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;


public class Controller {

    @FXML
    private TableView<Item> Table;
    @FXML
    private Button incButton;
    @FXML
    private Button decButton;
    @FXML
    private Label Sum;
    
    private float summ = 0.0f;
    
    public void initialize() {
    	Image oniB = new Image("UI/OnPlusButton.png");
    	Image ondB = new Image("UI/OnMinusButton.png");
    	Image offiB = new Image("UI/OffPlusButton.png");
    	Image offdB = new Image("UI/OffMinusButton.png");
    	
    	ImageView oniButton = new ImageView(oniB);
    	ImageView ondButton = new ImageView(ondB);
    	ImageView offiButton = new ImageView(offiB);
    	ImageView offdButton = new ImageView(offdB);
    	incButton.setGraphic(offiButton);
    	decButton.setGraphic(offdButton);
    	
    	incButton.setOnMouseEntered(e -> incButton.setGraphic(oniButton));
    	decButton.setOnMouseEntered(e -> decButton.setGraphic(ondButton));
    	incButton.setOnMouseExited(e -> incButton.setGraphic(offiButton));
    	decButton.setOnMouseExited(e -> decButton.setGraphic(offdButton));
    	
    	incButton.setStyle("-fx-background-color: transparent;");
    	decButton.setStyle("-fx-background-color: transparent;");
    	}
    
    @FXML
    private void incSelectedItem(ActionEvent e) {
    	ObservableList<Item> data = Table.getItems();
    	int index = Table.getSelectionModel().getSelectedIndex();
    	if (index < 0) return;
    	if (data.get(index).getAmount() > 1024) return;
    	Item t = data.get(index);
    	t.setAmount(t.getAmount() + 1);
    	t.setSum(t.getPrice() * t.getAmount());
    	data.set(index, t);
    	Sum.setText(String.format("%.2f",summ += t.getPrice()));
    }
    
    @FXML
    private void decSelectedItem(ActionEvent e) {
    	ObservableList<Item> data = Table.getItems();
    	int index = Table.getSelectionModel().getSelectedIndex();
    	if (index < 0) return;
    	if (data.get(index).getAmount() < 1) return;
    	Item t = data.get(index);
    	t.setAmount(t.getAmount() - 1);
    	t.setSum(t.getPrice() * t.getAmount());
    	data.set(index, t);
    	Sum.setText(String.format("%.2f",summ -= t.getPrice()));
    }
    
}
