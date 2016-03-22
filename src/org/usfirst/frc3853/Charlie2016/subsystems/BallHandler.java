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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallHandler extends Subsystem {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController ballMotor = RobotMap.ballHandlerballMotor;
    private final DigitalInput ballPresentSwitch = RobotMap.ballHandlerballPresentSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void initDefaultCommand() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public boolean ballPresent() {
    return ballPresentSwitch.get();
  }

  public void stop() {
    ballMotor.set(0);
  }

  public void in(double speed) {
    speed = Math.abs(speed);

    if (speed > 1) {
      speed = 1;
    }

    ballMotor.set(-speed);
  }

  public void out(double speed) {
    speed = Math.abs(speed);

    if (speed > 1) {
      speed = 1;
    }

    ballMotor.set(speed);
  }
}
