package org.usfirst.frc.team5010.robot.subsystems;

import org.usfirst.frc.team5010.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shoot(){
    	
    	RobotMap.relayShoot.set(Relay.Value.kForward);
    }
    
    public void unShoot(){
    	
    	RobotMap.relayShoot.set(Relay.Value.kReverse);
    }
}

