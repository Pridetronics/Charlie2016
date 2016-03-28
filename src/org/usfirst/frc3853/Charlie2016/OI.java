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
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


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
    public JoystickButton buttonY;
    public JoystickButton buttonA;
    public JoystickButton buttonX;
    public JoystickButton buttonB;
    public Joystick gamePad0;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        gamePad0 = new Joystick(0);
        
        buttonB = new JoystickButton(gamePad0, 2);
        buttonB.whenPressed(new shootBall(1));
        buttonX = new JoystickButton(gamePad0, 3);
        buttonX.whenPressed(new intakeBall(.5));
        buttonA = new JoystickButton(gamePad0, 1);
        buttonA.whileHeld(new moveArmUp(.25));
        buttonY = new JoystickButton(gamePad0, 4);
        buttonY.whileHeld(new moveArmDown(.25));


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("driveForwardDistance: TwoFeetSlow", new driveForwardDistance(.7, 24));
        SmartDashboard.putData("DriveForwardTime: SlowTwoSeconds", new driveForwardTime(.5, 2));
        SmartDashboard.putData("driveBackwardsDistance: TwoFeetSlow", new driveBackwardsDistance(.7, 24));
        SmartDashboard.putData("driveBackwardTime: SlowTwoSeconds", new driveBackwardTime(.5, 2));
        SmartDashboard.putData("turnLeftDegrees: Slow90Degrees", new turnLeftDegrees(.7, 90));
        SmartDashboard.putData("turnLeftTime: SlowTwoSeconds", new turnLeftTime(0.7, 2));
        SmartDashboard.putData("turnRightDegrees: Slow90Degrees", new turnRightDegrees(.7, 90));
        SmartDashboard.putData("turnRightTime: SlowTwoSeconds", new turnRightTime(.7, 2));
        SmartDashboard.putData("stowArm: Slow", new stowArm(.25));
        SmartDashboard.putData("creepArmOffStow", new creepArmOffStow());
        SmartDashboard.putData("setArmPosition: StraightUp", new setArmPosition(45));
        SmartDashboard.putData("setArmPosition: Level", new setArmPosition(135));
        SmartDashboard.putData("calibrateArmEncoder", new calibrateArmEncoder());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getgamePad0() {
        return gamePad0;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

