package org.firstinspires.ftc.teamcode.OpModes.Auto;
import org.firstinspires.ftc.teamcode.SubSystems.Robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

public class ATOMQualOneAuto extends LinearOpMode {
    // Setting up Robot using Robot Subsystem
    private Robot rb;

    // Constants for encoder counts and PID parameters
    private static final int COUNTS_PER_REV = 1120;
    private static final double WHEEL_DIAMETER_IN = 96/25.4;
    private static final double COUNTS_PER_IN = COUNTS_PER_REV / (WHEEL_DIAMETER_IN * Math.PI);

    private static final double P_COEFF = 0; // 1
    private static final double I_COEFF = 0; // .5
    private static final double D_COEFF = 0; // .01

    // Setting variable for runtime
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        rb = new Robot(hardwareMap);
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();


        // Using encoder PID
        encoderDrive(0,0,0);

        // Stopping motors
        rb.setDrivePower(0,0,0);

    }

    private void encoderDrive(double speed, double inches, double timeout){

    }


}
