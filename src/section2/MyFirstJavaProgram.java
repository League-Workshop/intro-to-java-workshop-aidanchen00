package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ching = new Robot();
	ching.penDown();	
	ching.setSpeed(500);
	for(int i = 0; i<4; i++) {
	ching.turn(90);
	ching.move(250);
}
}
}