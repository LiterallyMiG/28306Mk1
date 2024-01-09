package org.firstinspires.ftc.teamcode.SubSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {

    public DcMotorEx leftFront, rightFront, leftBack, rightBack;

    public Robot(HardwareMap hw){

        // Initializing DcMotors
        leftFront = hw.get(DcMotorEx.class, "LF");
        rightFront = hw.get(DcMotorEx.class, "RF");
        leftBack = hw.get(DcMotorEx.class, "LB");
        rightBack = hw.get(DcMotorEx.class, "RB");

        // Reversing DcMotors
        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBack.setDirection(DcMotorSimple.Direction.REVERSE);

        // Setting Parking Brake DcMotors
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void setDrivePower(double ly, double lx, double rx){
        leftFront.setPower(ly + lx + rx);
        rightFront.setPower(ly - lx + rx);
        leftBack.setPower(ly - lx - rx);
        rightBack.setPower(ly + lx - rx);
    }

    public int[] getEncVals(){
        return new int[] {leftFront.getCurrentPosition(), rightFront.getCurrentPosition(), leftBack.getCurrentPosition(), rightBack.getCurrentPosition()};
    }

    public void commandCenter(Gamepad gamepad1, Gamepad gamepad2){
        
    }

}
