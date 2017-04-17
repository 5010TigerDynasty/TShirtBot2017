package org.usfirst.frc.team5010.robot.subsystems;

import org.usfirst.frc.team5010.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void liftUp(){
    	RobotMap.liftUp.set(true);
    }
    
    public void liftDown(){
    	RobotMap.liftDown.set(true);
    }
    
    public void stop(){
    	RobotMap.liftUp.set(false);
    	RobotMap.liftDown.set(false);
    }
}

