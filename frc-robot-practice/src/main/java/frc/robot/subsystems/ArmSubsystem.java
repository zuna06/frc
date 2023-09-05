package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase{
    
    //Lightridge/Tesla
    private double intakeWheelSpeed = 0.0;
    private double winchSpeed = 0.0;

    private final ArmMotor armMotors = new ArmMotor();

    public ArmSubsystem() {
        //smartdashboard??? ask abi
    }

    //understood everything
    //code would be same as abi's 

    public void setIntakeSpeed(double speed) {
        //copy pasted from Lightridge/Tesla
        //m_motorsManager.dontHold();
        SmartDashboard.putBoolean("Holding", hold); //what does this do
        intakeWheelSpeed = speed;
    }

    public void getIntake() {

    }

    public void setOutake() {

    }

    public void getOutake() {
        setOutake();
    }

    public void raiseArm() {
        //neg  .set()
    }

    public void lowerArm() {
        //pos  .set()
    }

}
