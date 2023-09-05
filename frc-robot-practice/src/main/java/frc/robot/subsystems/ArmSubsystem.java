package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase{
    
    //Lightridge/Tesla
    private double intakeWheelSpeed = 0.0;
    private double winchSpeed = 0.0;

    private final ArmMotor armMotors = new ArmMotor();

    public ArmSubsystem() {
        //smartdashboard??? ask abi
    }



    public void raiseArm() {
        //neg  .set()
    }

    public void lowerArm() {
        //pos  .set()
    }

}
