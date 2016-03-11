package org.usfirst.frc5265.Robot01.commands;

import org.usfirst.frc5265.Robot01.Robot;
import org.usfirst.frc5265.Robot01.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc5265.Robot01.commands.*;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5265.Robot01.subsystems.*;
/**
 *
 */
public class ReverseBot extends Command {
	boolean reverse;
    public ReverseBot() { 
    	/* xPos = Robot.oi.driveStick.getX();
		double yPos = Robot.oi.driveStick.getY();
    	reverse = Robot.ReverseStateToggle();
    		if (reverse){
    			xPos = -xPos;
    			yPos = -yPos; 
    			}else{*/	
    			
    			
    			//DriveBase.tankDrive(speed, speed);
    			//Robot.driveBase.GoForward(speed);
    			//robotDrive.tankDrive(left, right);
    	}
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    

    // Called just before this Command runs the first time
    protected void initialize() {
    		reverse = Robot.ReverseStateToggle();
        	double xPos = Robot.oi.driveStick.getX();
    		double yPos = Robot.oi.driveStick.getY();
        	
        		if (reverse){
        			xPos = -xPos;
        			yPos = -yPos; 
        			Robot.driveBase.leftFrontMotor.getSpeed();
        			Robot.driveBase.rightFrontMotor.getSpeed();
        			Robot.driveBase.rightRearMotor.getSpeed();
        			Robot.driveBase.leftRearMotor.getSpeed();
        			
        			}
    }
    

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
