package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class ArmMotor {
    
    private final WPI_TalonSRX intake = new WPI_TalonSRX(0);
    private final MotorControllerGroup intakeControl = new MotorControllerGroup(intake);
    
    private final WPI_TalonSRX pully = new WPI_TalonSRX(0);
    private final MotorControllerGroup pullyControl = new MotorControllerGroup(pully);

    public ArmMotor() {
        //Lightridge/Tesla
        intake.setNeutralMode(NeutralMode.Brake);
        pully.setNeutralMode(NeutralMode.Brake);
    }

    public void hold() {
        //Lightridge/Tesla
        intake.setNeutralMode(NeutralMode.Brake);
    }

    //shootlimit
    //coast?

    public MotorControllerGroup getPully() {
        return pullyControl;
    }

    public MotorControllerGroup getIntake() {
        return intakeControl;
    }



}