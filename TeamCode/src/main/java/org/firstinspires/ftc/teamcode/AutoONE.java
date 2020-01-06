package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import io.github.ensozos.core.MatrixProfile;

@Autonomous(name="MatrixProfile")
public class AutoONE extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        MatrixProfile matrixProfile = new MatrixProfile();
        int window = 4;

        INDArray target = Nd4j.create(new double[]{0.0, 6.0, -1.0, 2.0, 3.0, 1.0, 4.0}, new int[]{1, 7});
        INDArray query = Nd4j.create(new double[]{1.0, 2.0, 0.0, 0.0, -1}, new int[]{1, 5});

        matrixProfile.stamp(target, window, 1.0);

        telemetry.addData("", matrixProfile);
        telemetry.update();


        while (!isStopRequested()){
            //telemetry.update();
        }
        requestOpModeStop();
    }
}