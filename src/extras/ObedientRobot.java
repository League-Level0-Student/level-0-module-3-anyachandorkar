package extras;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot max = new Robot();
	for(int i=0;i<4;i++) {
		max.setSpeed(10);
		max.penDown();
	max.move(80);
	max.turn(90);
}}
}
