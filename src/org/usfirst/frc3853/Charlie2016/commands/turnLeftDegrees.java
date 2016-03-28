// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3853.Charlie2016.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3853.Charlie2016.Robot;

/**
 *
 */
public class turnLeftDegrees extends Command {

  private double m_distance;
  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
  private double m_speed;
  private int m_degrees;

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
  public turnLeftDegrees(double speed, int degrees) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
    m_speed = speed;
    m_degrees = degrees;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
  }

  // Called just before this Command runs the first time
  protected void initialize() {
    setTimeout(5);
    Robot.driveTrain.stop();
    Robot.driveTrain.zeroEncoders();
    m_distance = m_degrees * Robot.driveTrain.getDistancePerDegree();
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    if (Math.abs(Robot.driveTrain.getRightDistance()) < m_distance
        & Math.abs(Robot.driveTrain.getLeftDistance()) < m_distance) {
      Robot.driveTrain.turnLeft(m_speed);
    } else {
      Robot.driveTrain.stop();
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
    return (Math.abs(Robot.driveTrain.getRightDistance()) >= m_distance)
        || Math.abs(Robot.driveTrain.getLeftDistance()) < m_distance || isTimedOut();
  }

  // Called once after isFinished returns true
  protected void end() {
    Robot.driveTrain.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    end();
  }
}
