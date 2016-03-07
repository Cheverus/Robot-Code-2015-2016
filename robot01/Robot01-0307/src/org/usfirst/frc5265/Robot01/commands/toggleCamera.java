package org.usfirst.frc5265.Robot01.commands;

import org.usfirst.frc5265.Robot01.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class toggleCamera extends Command {

	public toggleCamera () {
		
	}
	
	protected void initialize() {
		Robot.cameraFlip();
	}

	protected void execute() {
		// TODO Auto-generated method stub

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
