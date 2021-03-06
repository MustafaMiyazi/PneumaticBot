package org.usfirst.frc.team2976.robot.commands;

import org.usfirst.frc.team2976.robot.OI;
import org.usfirst.frc.team2976.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RobotDrive extends Command {
	
	public RobotDrive() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.driveTrain.tankDrive(0, 0);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		double turn = Robot.oi.getAxisValue(OI.Axis.LX.getAxisNumber());
		double speed = Robot.oi.getAxisValue(OI.Axis.RY.getAxisNumber());
		Robot.driveTrain.arcadeDrive(speed, turn);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.driveTrain.tankDrive(0, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}