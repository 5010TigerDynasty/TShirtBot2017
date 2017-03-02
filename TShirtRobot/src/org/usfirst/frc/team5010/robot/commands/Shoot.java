package org.usfirst.frc.team5010.robot.commands;

import org.usfirst.frc.team5010.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shoot extends Command {
	
	long currentTime;
	long startTime;
	double targetTime;

    public Shoot() {
        // Use requires() here to declare subsystem dependencies
    	requires(RobotMap.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startTime = System.currentTimeMillis();
//    	RobotMap.shooter.shoot();
    	targetTime = SmartDashboard.getNumber("shoot time", 100);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.shooter.shoot();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        currentTime = System.currentTimeMillis();
    	if(currentTime - startTime > targetTime){
    		return true;
    	}
    	
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.shooter.unShoot();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
