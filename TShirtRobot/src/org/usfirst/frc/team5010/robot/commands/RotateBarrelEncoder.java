package org.usfirst.frc.team5010.robot.commands;

import org.usfirst.frc.team5010.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RotateBarrelEncoder extends Command {

	double distancePerPipe;
	
    public RotateBarrelEncoder() {
        // Use requires() here to declare subsystem dependencies
        requires(RobotMap.barrel);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	distancePerPipe = SmartDashboard.getNumber("distance per pipe", 100);
    	RobotMap.encoder.reset();    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.barrel.spinLeft();

    	
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       // SmartDashboard.putNumber("encoder", RobotMap.encoder.getRaw());
        //SmartDashboard.putBoolean("finished", RobotMap.encoder.getRaw() > distancePerPipe);
    	return false;//(RobotMap.encoder.getRaw() > distancePerPipe);
        
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
