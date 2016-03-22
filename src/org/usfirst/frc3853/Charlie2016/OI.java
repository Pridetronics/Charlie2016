// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3853.Charlie2016;

import org.usfirst.frc3853.Charlie2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS



        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("driveForward: TwoFeetSlow", new driveForward(.2, 24));
        SmartDashboard.putData("driveBackwards: TwoFeetSlow", new driveBackwards(.2, 24));
        SmartDashboard.putData("intakeBall: QuarterSpeed", new intakeBall(.25));
        SmartDashboard.putData("intakeBall: HalfSpeed", new intakeBall(.5));
        SmartDashboard.putData("intakeBall: FullSpeed", new intakeBall(1));
        SmartDashboard.putData("shootBall: QuarterSpeed", new shootBall(.25));
        SmartDashboard.putData("shootBall: HalfSpeed", new shootBall(.50));
        SmartDashboard.putData("shootBall: FullSpeed", new shootBall(1));
        SmartDashboard.putData("turnLeft: Slow90Degrees", new turnLeft(.25, 90));
        SmartDashboard.putData("turnRight: Slow90Degrees", new turnRight(.2, 90));
        SmartDashboard.putData("stowArm: Slow", new stowArm(.25));
        SmartDashboard.putData("creepArmOffStow", new creepArmOffStow());
        SmartDashboard.putData("setArmPosition: StraightUp", new setArmPosition(45));
        SmartDashboard.putData("setArmPosition: Level", new setArmPosition(135));
        SmartDashboard.putData("calibrateArmEncoder", new calibrateArmEncoder());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

