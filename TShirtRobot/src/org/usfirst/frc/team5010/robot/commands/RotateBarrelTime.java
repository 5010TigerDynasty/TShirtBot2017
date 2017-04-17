package org.usfirst.frc.team5010.robot.commands;

import org.usfirst.frc.team5010.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RotateBarrelTime extends Command {

	long startTime;
	double targetTime;
	
    public RotateBarrelTime() {
        // Use requires() here to declare subsystem dependencies
        requires(RobotMap.barrel);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	targetTime = SmartDashboard.getNumber("time" , 500);
    	startTime = System.currentTimeMillis();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.barrel.spinLeft();

    	
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (System.currentTimeMillis() - startTime > targetTime);
        
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.barrel.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
