// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3853.Charlie2016.subsystems;

import org.usfirst.frc3853.Charlie2016.RobotMap;
import org.usfirst.frc3853.Charlie2016.commands.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftMotor = RobotMap.driveTrainleftMotor;
    private final SpeedController rightMotor = RobotMap.driveTrainRightMotor;
    private final RobotDrive robotDrive21 = RobotMap.driveTrainRobotDrive21;
    private final Encoder leftDriveEncoder = RobotMap.driveTrainLeftDriveEncoder;
    private final Encoder rightDriveEncoder = RobotMap.driveTrainrightDriveEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  private final double track = 14; // set to the track distance in inches

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void initDefaultCommand() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new driveTeleop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  }

  public double getDistancePerDegree() {
    return Math.PI * track / 360;
  }

  public void driveTank(double d, double e) {
    robotDrive21.tankDrive(d, e, true);

  }

  public void driveArccade(Joystick stick) {
    robotDrive21.arcadeDrive(stick, true);
  }

  public void zeroEncoders() {
    leftDriveEncoder.reset();
    rightDriveEncoder.reset();
  }

  public double getRightDistance() {
    return rightDriveEncoder.getDistance();
  }

  public double getLeftDistance() {
    return leftDriveEncoder.getDistance();
  }

  public double getAverageDistance() {
    return (rightDriveEncoder.getDistance() + leftDriveEncoder.getDistance()) / 2;
  }

  public void stop() {
    leftMotor.set(0);
    rightMotor.set(0);
  }

  public void turnRight(double speed) {
    speed = Math.abs(speed);

    if (speed > 1) {
      speed = 1;
    }
    robotDrive21.tankDrive(-speed, speed);
  }

  public void turnLeft(double speed) {
    speed = Math.abs(speed);

    if (speed > 1) {
      speed = 1;
    }
    robotDrive21.tankDrive(speed, -speed);

  }

  public void forward(double speed) {
    speed = Math.abs(speed);

    if (speed > 1) {
      speed = 1;
    }

    robotDrive21.tankDrive(-speed, -speed);
  }

  public void backward(double speed) {
    speed = Math.abs(speed);

    if (speed > 1) {
      speed = 1;
    }

    robotDrive21.tankDrive(speed, speed);
  }
}
