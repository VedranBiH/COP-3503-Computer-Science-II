//Author Vedran Pehlivanovic
//COP 3503 Ken Martin
//Program creates three images. A clock with a random time, a hangman, and four fans. Using JavaFx

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class n00888869 extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {    
	    // Create a pane to hold the circles 
	    Pane pane = new Pane();
	    Pane pane2 = new Pane();
	    Pane pane3 = new Pane();
	    Pane pane4 = new Pane();
	    
	    //Create a pane to align the four circles
	   GridPane FanDisplay = new GridPane();
	   
	   GridPane mainPane = new GridPane();
	    
	    // Create a circle and set its 
	    
	    Circle circle = new Circle();
	    Circle circle2 = new Circle();
	    Circle circle3 = new Circle();
	    Circle circle4 = new Circle();
	    
	    //circle
	    circle.setCenterX(100);
	    circle.setCenterY(100);
	    circle.setRadius(80);
	    circle.setStroke(Color.BLACK); 
	    circle.setFill(Color.WHITE);
	    pane.getChildren().add(circle); // Add circle to the pane
	    
	    Arc arc1 = new Arc(100, 100, 65, 65, 30, 35); // Create an arc
	    arc1.setFill(Color.GREY); // Set fill color
	    arc1.setType(ArcType.ROUND); // Set arc type
	    pane.getChildren().add(arc1); // Add arc to pane
	    
	    Arc arc2 = new Arc(100, 100, 65, 65, 30 + 90, 35);
	    arc2.setFill(Color.GREY); // Set fill color
	    arc2.setType(ArcType.ROUND); // Set arc type 
	    pane.getChildren().add(arc2); // Add arc to pane

	    Arc arc3 = new Arc(100, 100, 65, 65, 30 + 180, 35);
	    arc3.setFill(Color.GREY); // Set fill color
	    arc3.setType(ArcType.ROUND); // Set arc type 
	    pane.getChildren().add(arc3); // Add arc to pane
	    
	    Arc arc4 = new Arc(100, 100, 65, 65, 30 + 270, 35);
	    arc4.setFill(Color.GREY); // Set fill color
	    arc4.setType(ArcType.ROUND); // Set arc type 
	    pane.getChildren().add(arc4); // Add arc to pane 

		//End Circle
		
		//Circle 2
		circle2.setCenterX(100);
	    circle2.setCenterY(100);
	    circle2.setRadius(80);
	    circle2.setStroke(Color.BLACK); 
	    circle2.setFill(Color.WHITE);
	    pane2.getChildren().add(circle2); // Add circle to the pane
	    
	    Arc arc5 = new Arc(100, 100, 65, 65, 30, 35); // Create an arc
	    arc5.setFill(Color.GREY); // Set fill color
	    arc5.setType(ArcType.ROUND); // Set arc type
	    pane2.getChildren().add(arc5); // Add arc to pane
	    
	    Arc arc6 = new Arc(100, 100, 65, 65, 30 + 90, 35);
	    arc6.setFill(Color.GREY); // Set fill color
	    arc6.setType(ArcType.ROUND); // Set arc type 
	    pane2.getChildren().add(arc6); // Add arc to pane

	    Arc arc7 = new Arc(100, 100, 65, 65, 30 + 180, 35);
	    arc7.setFill(Color.GREY); // Set fill color
	    arc7.setType(ArcType.ROUND); // Set arc type 
	    pane2.getChildren().add(arc7); // Add arc to pane
	    
	    Arc arc8 = new Arc(100, 100, 65, 65, 30 + 270, 35);
	    arc8.setFill(Color.GREY); // Set fill color
	    arc8.setType(ArcType.ROUND); // Set arc type 
	    pane2.getChildren().add(arc8); // Add arc to pane 
	    //end circle2
		
		//Start Circle3
	    circle3.setCenterX(100);
	    circle3.setCenterY(100);
	    circle3.setRadius(80);
	    circle3.setStroke(Color.BLACK); 
	    circle3.setFill(Color.WHITE);
	    pane3.getChildren().add(circle3); // Add circle to the pane
	    
	    Arc arc9 = new Arc(100, 100, 65, 65, 30, 35); // Create an arc
	    arc9.setFill(Color.GREY); // Set fill color
	    arc9.setType(ArcType.ROUND); // Set arc type
	    pane3.getChildren().add(arc9); // Add arc to pane
	    
	    Arc arc10 = new Arc(100, 100, 65, 65, 30 + 90, 35);
	    arc10.setFill(Color.GREY); // Set fill color
	    arc10.setType(ArcType.ROUND); // Set arc type 
	    pane3.getChildren().add(arc10); // Add arc to pane

	    Arc arc11 = new Arc(100, 100, 65, 65, 30 + 180, 35);
	    arc11.setFill(Color.GREY); // Set fill color
	    arc11.setType(ArcType.ROUND); // Set arc type 
	    pane3.getChildren().add(arc11); // Add arc to pane
	    
	    Arc arc12 = new Arc(100, 100, 65, 65, 30 + 270, 35);
	    arc12.setFill(Color.GREY); // Set fill color
	    arc12.setType(ArcType.ROUND); // Set arc type 
	    pane3.getChildren().add(arc12); // Add arc to pane 
		//end Circle3
	    
	    //Start Circle 4
	    circle4.setCenterX(100);
	    circle4.setCenterY(100);
	    circle4.setRadius(80);
	    circle4.setStroke(Color.BLACK); 
	    circle4.setFill(Color.WHITE);
	    pane4.getChildren().add(circle4); // Add circle to the pane
	    
	    Arc arc13 = new Arc(100, 100, 65, 65, 30, 35); // Create an arc
	    arc13.setFill(Color.GREY); // Set fill color
	    arc13.setType(ArcType.ROUND); // Set arc type
	    pane4.getChildren().add(arc13); // Add arc to pane
	    
	    Arc arc14 = new Arc(100, 100, 65, 65, 30 + 90, 35);
	    arc14.setFill(Color.GREY); // Set fill color
	    arc14.setType(ArcType.ROUND); // Set arc type 
	    pane4.getChildren().add(arc14); // Add arc to pane

	    Arc arc15 = new Arc(100, 100, 65, 65, 30 + 180, 35);
	    arc15.setFill(Color.GREY); // Set fill color
	    arc15.setType(ArcType.ROUND); // Set arc type 
	    pane4.getChildren().add(arc15); // Add arc to pane
	    
	    Arc arc16 = new Arc(100, 100, 65, 65, 30 + 270, 35);
	    arc16.setFill(Color.GREY); // Set fill color
	    arc16.setType(ArcType.ROUND); // Set arc type 
	    pane4.getChildren().add(arc16); // Add arc to pane 
		//End Circle4
		
	 
	    
	    FanDisplay.add(pane, 0, 0);
		FanDisplay.add(pane2, 0, 1);
		FanDisplay.add(pane3, 1, 0);
		FanDisplay.add(pane4, 1, 1);
		
		
		//Clock
		
		 // Create a clock and a label
	    ClockPane clock = 
	      new ClockPane((int)(Math.random() * 12), (int)(Math.random() * 30), 0);
	    clock.setSecondHandVisible(false);
	    String timeString = clock.getHour() + ":" + clock.getMinute() 
	      + ":" + clock.getSecond();
	    Label lblCurrentTime = new Label(timeString);

	    // Place clock and label in border pane
	    BorderPane clockPane1 = new BorderPane();
	    clockPane1.setCenter(clock);
	    clockPane1.setBottom(lblCurrentTime);
	    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
	    //end clock
	    
	    //hangman
	    LinePane hangMan = new LinePane();
	    
	mainPane.add(FanDisplay, 0, 0);
	mainPane.add(clockPane1, 1, 0);
	mainPane.add(hangMan, 2, 0);

	 
	 
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(mainPane, 875, 360);
	   primaryStage.setTitle("N00888869"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  

	  public static void main(String[] args) {
	    launch(args);
	  }

}


class ClockPane extends Pane {
	  private int hour;
	  private int minute;
	  private int second;

	  private boolean hourHandVisible = true;
	  private boolean minuteHandVisible = true;
	  private boolean secondHandVisible = true;
	  
	  public boolean isHourHandVisible() {
	    return hourHandVisible;
	  }
	  
	  public void setHourHandVisible(boolean hourHandVisible) {
	    this.hourHandVisible = hourHandVisible;
	    paintClock();
	  }
	  
	  public boolean isMinuteHandVisible() {
	    return minuteHandVisible;
	  }
	  
	  public void setMinuteHandVisible(boolean minuteHandVisible) {
	    this.minuteHandVisible = minuteHandVisible;
	    paintClock();
	  }
	  
	  public boolean isSecondHandVisible() {
	    return secondHandVisible;
	  }
	  
	  public void setSecondHandVisible(boolean secondHandVisible) {
	    this.secondHandVisible = secondHandVisible;
	    paintClock();
	  }
	   
	  // Clock pane's width and height
	  private double w = 250, h = 250;
	  
	  /** Construct a default clock with the current time*/
	  public ClockPane() {
	    setCurrentTime();
	  }

	  /** Construct a clock with specified hour, minute, and second */
	  public ClockPane(int hour, int minute, int second) {
	    this.hour = hour;
	    this.minute = minute;
	    this.second = second;
	    paintClock();
	  }

	  /** Return hour */
	  public int getHour() {
	    return hour;
	  }

	  /** Set a new hour */
	  public void setHour(int hour) {
	    this.hour = hour;
	    paintClock();
	  }

	  /** Return minute */
	  public int getMinute() {
	    return minute;
	  }

	  /** Set a new minute */
	  public void setMinute(int minute) {
	    this.minute = minute;
	    paintClock();
	  }

	  /** Return second */
	  public int getSecond() {
	    return second;
	  }

	  /** Set a new second */
	  public void setSecond(int second) {
	    this.second = second;
	    paintClock();
	  }

	  /** Return clock pane's width */ 
	  public double getW() {
	    return w;
	  }
	  
	  /** Set clock pane's width */ 
	  public void setW(double w) {
	    this.w = w;
	    paintClock();
	  }
	  
	  /** Return clock pane's height */ 
	  public double getH() {
	    return h;
	  }
	  
	  /** Set clock pane's height */ 
	  public void setH(double h) {
	    this.h = h;
	    paintClock();
	  }
	  
	  /* Set the current time for the clock */
	  public void setCurrentTime() {
	    // Construct a calendar for the current date and time
	    Calendar calendar = new GregorianCalendar();

	    // Set current hour, minute and second
	    this.hour = calendar.get(Calendar.HOUR_OF_DAY);
	    this.minute = calendar.get(Calendar.MINUTE);
	    this.second = calendar.get(Calendar.SECOND);
	    
	    paintClock(); // Repaint the clock
	  }
	  
	  /** Paint the clock */
	  private void paintClock() {
	    // Initialize clock parameters
	    double clockRadius = Math.min(w, h) * 0.8 * 0.5;
	    double centerX = w / 2;
	    double centerY = h / 2;

	    // Draw circle
	    Circle circle = new Circle(centerX, centerY, clockRadius);
	    circle.setFill(Color.WHITE);
	    circle.setStroke(Color.BLACK);
	    Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
	    Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
	    Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
	    Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
	    Text name = new Text(centerX - clockRadius + 50, centerY + 3, "Vedran Pehlivanovic");
	    // Draw second hand
	    double sLength = clockRadius * 0.8;
	    double secondX = centerX + sLength * 
	      Math.sin(second * (2 * Math.PI / 60));
	    double secondY = centerY - sLength * 
	      Math.cos(second * (2 * Math.PI / 60));
	    Line sLine = new Line(centerX, centerY, secondX, secondY);
	    sLine.setStroke(Color.BLACK);

	    // Draw minute hand
	    double mLength = clockRadius * 0.65;
	    double xMinute = centerX + mLength * 
	      Math.sin(minute * (2 * Math.PI / 60));
	    double minuteY = centerY - mLength * 
	      Math.cos(minute * (2 * Math.PI / 60));
	    Line mLine = new Line(centerX, centerY, xMinute, minuteY);
	    mLine.setStroke(Color.BLACK);
	    
	    // Draw hour hand
	    double hLength = clockRadius * 0.5;
	    double hourX = centerX + hLength * 
	      Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
	    double hourY = centerY - hLength *
	      Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
	    Line hLine = new Line(centerX, centerY, hourX, hourY);
	    hLine.setStroke(Color.BLACK);
	    
	    getChildren().clear();
	    getChildren().addAll(circle, t1, t2, t3, t4,name);
	    
	    if (secondHandVisible) {
	      getChildren().add(sLine);
	    }
	    
	    if (minuteHandVisible) {
	      getChildren().add(mLine);
	    }
	    
	    if (hourHandVisible) {
	      getChildren().add(hLine);
	    }
	  }
	}

class LinePane extends Pane {
	  public LinePane() {
	   
		  Line line1 = new Line(180, 10, 180, 230 );		//connects to head of hangman and his body
			line1.setStroke(Color.BLACK);
			getChildren().add(line1);
			  
		    Line line2 = new Line(75, 10, 180, 10);				// line that goes right
		    line2.setStroke(Color.BLACK);
		    getChildren().add(line2);
		    
		    Line line3 = new Line(75, 319, 75, 10);					// pole of hangman
		    line3.setStroke(Color.BLACK);
		    getChildren().add(line3);
		    
		    Line line5 = new Line(180, 80, 110, 120);				// Left arm of hangman
		    line5.setStroke(Color.BLACK);
		    getChildren().add(line5);
		    
		    Line line6 = new Line(180, 80, 250, 120);				// Right arm of hangman
		    line6.setStroke(Color.BLACK);
		    getChildren().add(line6);
		    
		    Line line7 = new Line(180, 230, 120, 280);					// Left leg of hangman
		    line7.setStroke(Color.BLACK);
		    getChildren().add(line7);
		    
		    Line line8 = new Line(180, 230, 240, 280);					// Right leg of hangman
		    line8.setStroke(Color.BLACK);
		    getChildren().add(line8);
		    
		    Arc arc = new Arc(75, 380, 20, 20, 50, 20);
	    arc.setStroke(Color.BLACK);
	    arc.setFill(null);
	    arc.setType(ArcType.OPEN);             //Stand
		    arc.setType(ArcType.CHORD);
	    arc.setStartAngle(15);
	    arc.setLength(150);
	    arc.setRadiusX(60);
	    arc.setRadiusY(60);
		    getChildren().add(arc);
		    
		    Circle circle2 = new Circle();
		    circle2.setCenterX(180);
		    circle2.setCenterY(65);
		    circle2.setRadius(30);						// hangmans head
		    circle2.setStroke(Color.BLACK);
		    circle2.setFill(Color.WHITE);
		    getChildren().add(circle2);
	  }
	}

