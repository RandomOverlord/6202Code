// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6202.TheCenturions.subsystems;


import org.usfirst.frc6202.TheCenturions.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

public class Drivetrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private VictorSP speedController1;
    private VictorSP speedController2;
    private VictorSP speedController3;
    private VictorSP speedController4;
    private DifferentialDrive differentialDrive1;
    private DifferentialDrive differentialDrive2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Drivetrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        speedController1 = new VictorSP(0);
        addChild("Speed Controller 1",speedController1);
        speedController1.setInverted(false);
        
        speedController2 = new VictorSP(1);
        addChild("Speed Controller 2",speedController2);
        speedController2.setInverted(false);

        speedController3 = new VictorSP(2);
        addChild("Speed Controller 3",speedController3);
        speedController3.setInverted(false);

        speedController4 = new VictorSP(3);
        addChild("Speed Controller 4",speedController4);
        speedController4.setInverted(true);

        speedController5 = new VictorSP(4);
        addChild("Speed Controller 5",speedController5);
        speedController4.setInverted(true);        
        
        speedController6 = new VictorSP(5);
        addChild("Speed Controller 6",speedController6);
        speedController4.setInverted(true);

        differentialDrive1 = new DifferentialDrive(speedController1, speedController2);
        addChild("Differential Drive 1",differentialDrive1);
        differentialDrive1.setSafetyEnabled(true);
        differentialDrive1.setExpiration(0.1);
        differentialDrive1.setMaxOutput(1.0);

        differentialDrive2 = new DifferentialDrive(speedController3, speedController4);
        addChild("Differential Drive 2",differentialDrive2);
        differentialDrive2.setSafetyEnabled(true);
        differentialDrive2.setExpiration(0.1);
        differentialDrive2.setMaxOutput(1.0);

        differentialDrive3 = new DifferentialDrive(speedController5, speedController6);
        addChild("Differential Drive 3", differentialDrive3);
        differentialDrive3.setSafetyEnabled(true);
        differentialDrive3.setExpiration(0.1);
        differentialDrive3.setMaxOutput(1.0);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void arcadeDrive(Joystick stick) {
        double xSpeed = stick.getX();
        double ySpeed = stick.getY();
        double zSpeed = stick.getZ();
        differentialDrive1.arcadeDrive(xSpeed, ySpeed);
        differentialDrive2.arcadeDrive(xSpeed, ySpeed);
        stick.setChannelX(4);
        stick.setChannelY(5);
        double xSpeed = stick.getX();
        double ySpeed = (stick.getY() * (-1));
        differentialDrive3.arcadeDrive(xSpeed, ySpeed);
        }

    public void driveStraight(double speed){
        differentialDrive1.tankDrive(speed, speed);
    }

}

