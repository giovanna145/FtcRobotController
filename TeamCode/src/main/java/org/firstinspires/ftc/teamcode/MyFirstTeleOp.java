package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "MyFirstTeleOp", group = "Linear Opmode")
public class MyFirstTeleOp extends LinearOpMode {
    private DcMotor leftMotor;

    @Override
    public void runOpMode() {
        leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
        waitForStart();

        while (opModeIsActive()) {
            leftMotor.setPower(gamepad1.left_stick_y);
        }
    }
}