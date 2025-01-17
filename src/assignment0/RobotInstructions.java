package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.turnLeft(5);
		robot.forward(150);
		robot.turnRight(30);
		robot.forward(90);
		robot.turnLeft(80);
		robot.forward(270);
		robot.turnRight(148);
		robot.forward(150);
		robot.turnRight(20);
		robot.forward(110);
		robot.turnLeft(80);
		robot.forward(95);
		robot.turnRight(50);
		robot.forward(60);
		robot.turnRight(45);
		robot.forward(60);
		robot.turnLeft(38);
		robot.forward(120);
		robot.turnRight(160);
		robot.forward(120);
		robot.turnLeft(30);
		robot.forward(60);
		robot.turnLeft(35);
		robot.forward(100);
		robot.turnRight(40);
		robot.forward(70);
		robot.turnLeft(10);
		robot.forward(210);
		
	}

}
