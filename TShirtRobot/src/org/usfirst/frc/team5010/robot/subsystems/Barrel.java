package org.usfirst.frc.team5010.robot.subsystems;

import org.usfirst.frc.team5010.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Barrel extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {

	} 

	public void spinLeft() {
		RobotMap.barrelMotor.set(.1);
	}

	public void spinRight() {
		RobotMap.barrelMotor.set(-.1);

	}

	public double getEncoderValue() {
		return RobotMap.encoder.getRaw();
	}

	public static boolean switchClosed() {
		return RobotMap.counter.get() > 0;
	}

	public void switchOpen() {
//		return RobotMap.counter.get() == 0;
	}

	public void stop() {
		RobotMap.barrelMotor.set(0);
	}
}
