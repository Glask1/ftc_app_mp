package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import io.github.ensozos.core.MatrixProfile;

@Autonomous(name="LeftMid")
public class AutoONE extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        MatrixProfile matrixProfile = new MatrixProfile();
        int window = 4;

        while (!isStopRequested()){
            telemetry.update();
        }
        requestOpModeStop();
    }
}