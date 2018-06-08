package threads;

import java.awt.Color;
import java.awt.Graphics;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	int width = 40;
	int height = 40;

	public static void main(String[] args) {
		Robot firstCircle = new Robot(100, 100);
		Robot secondCircle = new Robot(200, 100);
		Robot thirdCircle = new Robot(300, 100);
		Robot fourthCircle = new Robot(150, 150);
		Robot fifthCircle = new Robot(250, 150);

		Thread r1 = new Thread(() -> drawBlue(firstCircle));
		Thread r2 = new Thread(() -> drawBlack(secondCircle));
		Thread r3 = new Thread(() -> drawRed(thirdCircle));
		Thread r4 = new Thread(() -> drawYellow(fourthCircle));
		Thread r5 = new Thread(() -> drawGreen(fifthCircle));

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();

	}

	static void drawCircle(Robot r) {

		r.setSpeed(1000);
		r.penDown();

		for (int i = 1; i < 360; i++) {
			r.move(1);
			r.turn(1);
		}

	}

	static void drawBlue(Robot firstCircle) {

		firstCircle.setPenColor(Color.blue);

		drawCircle(firstCircle);
	}

	static void drawBlack(Robot secondCircle) {
		secondCircle.setPenColor(Color.black);
		drawCircle(secondCircle);

	}

	static void drawRed(Robot thirdCircle) {
		thirdCircle.setPenColor(Color.red);
		drawCircle(thirdCircle);

	}

	static void drawYellow(Robot fourthCircle) {
		fourthCircle.setPenColor(Color.yellow);
		drawCircle(fourthCircle);

	}

	static void drawGreen(Robot fifthCircle) {
		fifthCircle.setPenColor(Color.green);
		drawCircle(fifthCircle);

	}

}
