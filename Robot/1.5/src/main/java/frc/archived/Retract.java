// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.commands.archived;

// import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.subsystems.IntakeArms;

// public class Retract extends CommandBase {
//   private final IntakeArms m_intakeArms;
//   /** Creates a new Retract. */
//   public Retract(IntakeArms iArms) {
//     m_intakeArms = iArms;
//     addRequirements(iArms);
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     m_intakeArms.intakeArmsRetract();
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {}

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
