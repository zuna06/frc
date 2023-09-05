package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Motors {
  
    private final WPI_TalonSRX leftPrimary = new WPI_TalonSRX(2);
    private final WPI_TalonSRX leftFollower = new WPI_TalonSRX(1);

    private final WPI_TalonSRX rightPrimary = new WPI_TalonSRX(3);
    private final WPI_TalonSRX rightFollower = new WPI_TalonSRX(4);
    
    private final MotorControllerGroup leftGroup = new MotorControllerGroup(leftPrimary, leftFollower);
    private final MotorControllerGroup rightGroup = new MotorControllerGroup(rightPrimary, rightFollower);

    public Motors  () {
        leftGroup.setInverted(true);
    }

    //Lightridge/Tesla
    public void breakAll() {
        leftPrimary.setNeutralMode(NeutralMode.Brake);
        leftFollower.setNeutralMode(NeutralMode.Brake);
        rightPrimary.setNeutralMode(NeutralMode.Brake);
        rightFollower.setNeutralMode(NeutralMode.Brake);
    }

    //coast??

    public MotorControllerGroup leftMotors() {
        return leftGroup;
    }

    public MotorControllerGroup rightMotors() {
        return rightGroup;
    }

}
