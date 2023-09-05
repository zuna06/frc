package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Commands;

public class DriveTrain extends SubsystemBase {

    private final Motors motors = new Motors();

    //left group || right group 
    private final DifferentialDrive driveSystem = new DifferentialDrive(motors.leftMotors(), motors.rightMotors());

    public DriveTrain() {
        driveSystem.setDeadband(0.1);
        setDefaultCommand(Commands.driveRun);
    }

    public void arcadeDrive(XboxController driverController) {
        double fbPower = driverController.getLeftY();
        double rlPower = driverController.getRightX();

        driveSystem.arcadeDrive(fbPower, rlPower);
    }

    /*
    public double getLeftY() {
        double fbpower = driverController.getLeftY();
        return fbpower; 
    }

    public double getRightX() {
        double rlPower = driverController.getRightX();
        return rlPower;
    }
    */
    
    public void stop() {
        driveSystem.stopMotor();
    }

    //add turbo??
    //volt, amp config
    //periodic mode?
    //kinematics, positionestimator, feedforward for autonomous

}
