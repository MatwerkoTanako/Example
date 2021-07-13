/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  Talon r1 = new Talon(0);
  //Talon r2 = new Talon(1);
 // Talon l1 = new Talon(8);
  Talon l2 = new Talon(3);
  //SpeedControllerGroup left = new SpeedControllerGroup(l1, l2);
  //SpeedControllerGroup right = new SpeedControllerGroup(r1, r2);
  DifferentialDrive dT = new DifferentialDrive(l2, r1);
  Joystick driver = new Joystick(0);
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    dT.arcadeDrive(-driver.getRawAxis(1), driver.getRawAxis(2));
    
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
