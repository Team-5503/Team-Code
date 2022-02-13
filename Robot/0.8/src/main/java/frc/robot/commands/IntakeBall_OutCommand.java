package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeBall_OutCommand extends CommandBase {
  private final Intake intake;
  public IntakeBall_OutCommand(Intake i) {
    intake = i;
    addRequirements(intake);
  }


  @Override
  public void initialize() {}

  @Override
  public void execute() {
    intake.ballEject();
  }


  @Override
  public void end(boolean interrupted) {
    intake.stopIntake();
  }


  @Override
  public boolean isFinished() {
    return false;
  }
}
