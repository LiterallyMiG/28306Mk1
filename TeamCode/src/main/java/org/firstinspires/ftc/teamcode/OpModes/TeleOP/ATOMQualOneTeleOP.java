package org.firstinspires.ftc.teamcode.OpModes.TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.SubSystems.Robot;

public class ATOMQualOneTeleOP extends LinearOpMode {

    public Robot rb;

    @Override
    public void runOpMode() throws InterruptedException {

        rb = new Robot(hardwareMap);
        waitForStart();

        while(opModeIsActive()){

        }
    }
}
