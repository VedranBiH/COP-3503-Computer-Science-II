

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.Region;
import javafx.util.Duration;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

/*
Author:Vedran Pehlivanovic
COP3503:Assignment 7
Description: This program uses Javafx to create multiple events and animations and to build off each class

*/
class ButtonDemo extends Application {
protected Text text = new Text(50, 50, "Vedran Pehlivanovic");
GridPane centerPane = new GridPane();

protected BorderPane getPane() {
	
  HBox paneForButtons = new HBox(20);
  Button btLeft = new Button("Up");
  Button btRight = new Button("Down");   
  paneForButtons.getChildren().addAll(btLeft, btRight);
  paneForButtons.setAlignment(Pos.CENTER);
  paneForButtons.setStyle("-fx-border-color: green");

  BorderPane pane = new BorderPane();
  
  pane.setBottom(paneForButtons);
  
  Pane paneForText = new Pane();
  paneForText.getChildren().add(text);
  
  centerPane.add(paneForText,2,1);
  pane.setCenter(centerPane);
  
  btLeft.setOnAction(e -> text.setY(text.getY() - 10));
  btRight.setOnAction(e -> text.setY(text.getY() + 10));
  
  return pane;
}

@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
  // Create a scene and place it in the stage
  Scene scene = new Scene(getPane(), 980, 600);
  primaryStage.setTitle("n00888869"); // Set the stage title
  primaryStage.setScene(scene); // Place the scene in the stage
  primaryStage.show(); // Display the stage
}

}


class CheckBoxDemo extends ButtonDemo {
@Override // Override the getPane() method in the super class
protected BorderPane getPane() {
  BorderPane pane = super.getPane();

  Font fontBoldItalic = Font.font("Arial", 
    FontWeight.BOLD, FontPosture.ITALIC, 20);
  Font fontBold = Font.font("Arial", 
    FontWeight.BOLD, FontPosture.REGULAR, 20);
  Font fontItalic = Font.font("Arial", 
    FontWeight.NORMAL, FontPosture.ITALIC, 20);
  Font fontNormal = Font.font("Arial", 
    FontWeight.NORMAL, FontPosture.REGULAR, 20);
  
  text.setFont(fontNormal);
  
  VBox paneForCheckBoxes = new VBox(20);
  paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5)); 
  paneForCheckBoxes.setStyle("-fx-border-color: green");
  CheckBox chkBold = new CheckBox("Bold");
  CheckBox chkItalic = new CheckBox("Italic");
  paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
  pane.setLeft(paneForCheckBoxes);

  EventHandler<ActionEvent> handler = e -> { 
    if (chkBold.isSelected() && chkItalic.isSelected()) {
      text.setFont(fontBoldItalic); // Both check boxes checked
    }
    else if (chkBold.isSelected()) {
      text.setFont(fontBold); // The Bold check box checked
    }
    else if (chkItalic.isSelected()) {
      text.setFont(fontItalic); // The Italic check box checked
    }      
    else {
      text.setFont(fontNormal); // Both check boxes unchecked
    }
  };
  
  chkBold.setOnAction(handler);
  chkItalic.setOnAction(handler);
  
  return pane; // Return a new pane
}

}

class AddVideo extends CheckBoxDemo {
	  private static final String MEDIA_URL = 
	    "http://www.unf.edu/~n00888869/file.mp4";
	  
	  protected BorderPane getPane(){
		    BorderPane pane = super.getPane();
		    


	    Media media = new Media(MEDIA_URL);
	    MediaPlayer mediaPlayer = new MediaPlayer(media);
	    MediaView mediaView = new MediaView(mediaPlayer);

	    Button playButton = new Button(">");
	    playButton.setOnAction(e -> {
	      if (playButton.getText().equals(">")) {
	        mediaPlayer.play();
	        playButton.setText("||");
	      } else {
	        mediaPlayer.pause();
	        playButton.setText(">");
	      }
	    });

	    Button rewindButton = new Button("<<");
	    rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));
	    
	    Slider slVolume = new Slider();
	    slVolume.setPrefWidth(150);
	    slVolume.setMaxWidth(Region.USE_PREF_SIZE);
	    slVolume.setMinWidth(30);
	    slVolume.setValue(50);
	    mediaPlayer.volumeProperty().bind(
	      slVolume.valueProperty().divide(100));

	    HBox hBox = new HBox(10);
	    hBox.setAlignment(Pos.CENTER);
	    hBox.getChildren().addAll(playButton, rewindButton,
	      new Label("Volume"), slVolume);

  BorderPane pane1 = new BorderPane();
	    pane1.setCenter(mediaView);
	    pane1.setBottom(hBox);
	    
	    
	    
	    centerPane.add(pane1,10,1);
	    
	   pane.setCenter(centerPane);
	    
return pane;
	  }

	}

class RadioButtonDemo extends AddVideo {
	  @Override // Override the getPane() method in the super class
	  protected BorderPane getPane() {
	    BorderPane pane = super.getPane();
	    
	    VBox paneForRadioButtons = new VBox(20);
	    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
	    paneForRadioButtons.setStyle("-fx-border-color: green");
	    paneForRadioButtons.setStyle
	      ("-fx-border-width: 2px; -fx-border-color: green");
	    RadioButton rbRed = new RadioButton("Yellow");
	    RadioButton rbGreen = new RadioButton("Orange");
	    RadioButton rbBlue = new RadioButton("Purple");
	    paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
	    pane.setRight(paneForRadioButtons);

	    ToggleGroup group = new ToggleGroup();
	    rbRed.setToggleGroup(group);
	    rbGreen.setToggleGroup(group);
	    rbBlue.setToggleGroup(group);
	    
	    rbRed.setOnAction(e -> {
	      if (rbRed.isSelected()) {
	        text.setFill(Color.YELLOW);
	      }
	    });
	    
	    rbGreen.setOnAction(e -> {
	      if (rbGreen.isSelected()) {
	        text.setFill(Color.ORANGE);
	      }
	    });

	    rbBlue.setOnAction(e -> {
	      if (rbBlue.isSelected()) {
	        text.setFill(Color.PURPLE);
	      }
	    });
	    
	    return pane;
	  }
	}

public class n00888869 extends RadioButtonDemo {
	 
	  protected BorderPane getPane(){
		    BorderPane pane = super.getPane();
		   
	  
	    BallPane ballPane = new BallPane();
	    Slider slSpeed = new Slider();
	    slSpeed.setMax(20);
	   
	    ballPane.rateProperty().bind(slSpeed.valueProperty());
	    
	    BorderPane topPane = new BorderPane();
	    topPane.setCenter(ballPane);
	    topPane.setBottom(slSpeed);
	    
	    pane.setTop(topPane);
     
	    return pane;
	  }

	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }


	  class BallPane extends Pane {
	  public final double radius = 20;
	  private double x = radius, y = radius;
	  private double dx = 1, dy = 1;
	  private Rectangle rec = new Rectangle(x, y, radius, radius);
	  private Timeline animation;

	  public BallPane() {
		 
	    rec.setFill(Color.RED); // Set ball color
	    getChildren().add(rec); // Place a ball into this pane

	    // Create an animation for moving the ball
	    animation = new Timeline(
	      new KeyFrame(Duration.millis(50), e -> moveBall()));
	    animation.setCycleCount(Timeline.INDEFINITE);
	    animation.play(); // Start animation
	  }

	  public void play() {
	    animation.play();
	  }

	  public void pause() {
	    animation.pause();
	  }

	  public void increaseSpeed() {
	    animation.setRate(animation.getRate() + 0.1);
	  }

	  public void decreaseSpeed() {
	    animation.setRate(
	      animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
	  }

	  public DoubleProperty rateProperty() {
	    return animation.rateProperty();
	  }
	  
	  protected void moveBall() {
	    // Check boundaries
		  setMinHeight(70);
		 setMaxHeight(70);
		
	    if (x < radius || x > getWidth() - radius) {
	      dx *= -1; // Change ball move direction
	    }
	    if (y < radius || y > this.getHeight() - radius) {
	      dy *= -1; // Change ball move direction
	    }

	    // Adjust ball position
	    x += dx;
	    y += dy;
	   rec.setX(x);
	   rec.setY(y);
	  }
	}
}