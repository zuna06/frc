package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Robot;

public class Commands {
    
    public XboxController driverController = new XboxController(0);


    public static final Command stop = new InstantCommand(() -> Robot.driveTrain.stop(), Robot.driveTrain);
    
    public static final Command driveRun = new RunCommand(() -> Robot.driveTrain.arcadeDrive(driverController), Robot.driveTrain);


}
