package org.usfirst.frc5265.Robot01.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5265.Robot01.Robot;
import org.usfirst.frc5265.Robot01.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc5265.Robot01.commands.*;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5265.Robot01.subsystems.*;
/**
 *
 */
public class TankDriveSwtich extends Command {

    public TankDriveSwtich() {
    	
    
    	while(true){                            // Infinite loop:
    	
    	    getJoystickSettings(Robot.oi.driveStick);

			Object deadZone;
			double drivePower = DEADBAND(Robot.oi.driveStick.getX(), deadZone)*100.0/128.0;
    	    double turnPower = DEADBAND(Robot.oi.driveStick.getY(), deadZone)*100.0/128.0;

    	    Robot.driveBase.leftFrontMotor = BOUND(drivePower + turnPower, -100, 100);
    	    Robot.driveBase.leftRearMotor = BOUND(drivePower + turnPower, -100, 100);
    	    Robot.driveBase.rightFrontMotor = BOUND(drivePower - turnPower, -100, 100);
    	    Robot.driveBase.rightRearMotor = BOUND(drivePower - turnPower, -100, 100);
    	    
    	    wait(1);
    	}
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    private CANTalon BOUND(double d, int i, int j) {
		// TODO Auto-generated method stub
		return null;
    }

    
    
    
	// Called just before this Command runs the first time
    protected void initialize() {
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
