package org.usfirst.frc.team2976.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2976.robot.RobotMap;
import org.usfirst.frc.team2976.robot.commands.RobotDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
	private WPI_TalonSRX leftFront, rightFront, leftBack, rightBack;
	private SpeedControllerGroup left, right;
	private DifferentialDrive m_drive;
	
	public DriveTrain() {
		leftFront = new WPI_TalonSRX(RobotMap.LEFT_FRONT.value);
		rightFront = new WPI_TalonSRX(RobotMap.RIGHT_FRONT.value);
		leftBack = new WPI_TalonSRX(RobotMap.LEFT_BACK.value);
		rightBack = new WPI_TalonSRX(RobotMap.RIGHT_BACK.value);
		
		left = new SpeedControllerGroup(leftFront, leftBack);
		right = new SpeedControllerGroup(rightFront, rightBack);
		
		m_drive = new DifferentialDrive(left, right);

	}	
	
	public void tankDrive(double leftSpeed, double rightSpeed) {
		m_drive.tankDrive(leftSpeed, rightSpeed);
	}
	
	public void arcadeDrive(double speed, double turn) {
		m_drive.arcadeDrive(speed, turn);
	}

	public void initDefaultCommand() {
		
		// Set the default command for a subsystem here.
		setDefaultCommand(new RobotDrive());
	}
}

