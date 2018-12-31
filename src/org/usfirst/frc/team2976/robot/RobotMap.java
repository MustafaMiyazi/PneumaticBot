/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2976.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public enum RobotMap {
	
	//Drive Train
	LEFT_FRONT(7), 
	RIGHT_FRONT(6), 
	RIGHT_BACK(5), 
	LEFT_BACK(8),
	
	//Controls
	JOYSTICK(0);
	
	public final int value;
	
	RobotMap(int value){
		this.value = value;
	}
}
