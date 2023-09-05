package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Robot;

public class Commands {
    
    public static XboxController driverController = new XboxController(0);

    //emergency stop
    //video 7
    public static final Command stop = new InstantCommand(() -> Robot.driveTrain.stop(), Robot.driveTrain);
    
    //need to set default drive command in class origin
    //so that robot can be controlled at all times using 
    //left and right sticks
    //Video 7 -> 10:32
    public static final Command driveRun = new RunCommand(() -> Robot.driveTrain.arcadeDrive(driverController), Robot.driveTrain);


}
