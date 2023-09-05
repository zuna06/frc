package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Motors {
  
    private final WPI_TalonSRX leftPrimaryMotor = new WPI_TalonSRX(2);
    private final WPI_TalonSRX leftFollowerMotor = new WPI_TalonSRX(1);

    private final WPI_TalonSRX rightPrimaryMotor = new WPI_TalonSRX(3);
    private final WPI_TalonSRX rightFollowerMotor = new WPI_TalonSRX(4);
    
    private final MotorControllerGroup leftGroup = new MotorControllerGroup(leftPrimaryMotor, leftFollowerMotor);
    private final MotorControllerGroup rightGroup = new MotorControllerGroup(rightPrimaryMotor, rightFollowerMotor);

    public Motors  () {
        leftGroup.setInverted(true);
    }

    public MotorControllerGroup leftMotors() {
        return leftGroup;
    }

    public MotorControllerGroup rightMotors() {
        return rightGroup;
    }

}
