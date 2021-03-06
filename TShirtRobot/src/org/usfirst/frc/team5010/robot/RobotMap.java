package org.usfirst.frc.team5010.robot;

import org.usfirst.frc.team5010.robot.subsystems.Barrel;
import org.usfirst.frc.team5010.robot.subsystems.DriveTrainMain;
import org.usfirst.frc.team5010.robot.subsystems.Lifter;
import org.usfirst.frc.team5010.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static SpeedController driveMotorLeft;
	public static SpeedController driveMotorRight;
	public static SpeedController barrelMotor;
	public static Solenoid liftUp;
	public static Solenoid liftDown;
	public static Relay relayShoot;
	public static Encoder encoder;
	
	public static Barrel barrel;
	public static Shooter shooter;
	public static DriveTrainMain drivetrain;
	public static Lifter lifter;
	public static DigitalInput limitSwitch;
	public static Counter counter;
	public static DigitalInput encoder1;
	public static DigitalInput encoder2;

	
	

	
	public static void init() {
		driveMotorLeft = new Spark(1);
		driveMotorRight = new Spark(0);
		barrelMotor = new Spark(2);
		
		liftUp = new Solenoid(1);
		liftDown = new Solenoid(0);
		relayShoot = new Relay(0);
		
		//encoder = new Encoder(8,9,false,Encoder.EncodingType.k4X);
		encoder1 = new DigitalInput(7);
		encoder2 = new DigitalInput(8);
//		limitSwitch = new DigitalInput(0);
//		counter = new Counter(limitSwitch);
		
		drivetrain = new DriveTrainMain();
		barrel = new Barrel();
		shooter = new Shooter();
		lifter = new Lifter();
	
		
		
	}
}
