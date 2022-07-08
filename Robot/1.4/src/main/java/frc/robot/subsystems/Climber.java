package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {
  private final TalonFX armL;
  private final TalonFX armR;
  double leftClimber;
  double rightClimber;

  public Climber() {
    armL = new TalonFX(Constants.CAN.CLIMBER_L);
    armL.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    armR = new TalonFX(Constants.CAN.CLIMBER_R);
    armR.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
  }

  @Override
  public void periodic() {}

  public void runClimber (double speed) {
    armL.set(ControlMode.PercentOutput, speed);
    armR.set(ControlMode.PercentOutput, speed);
    }

  public void stop () {
    armL.set(ControlMode.PercentOutput, 0);
    armR.set(ControlMode.PercentOutput, 0);
  }
}
