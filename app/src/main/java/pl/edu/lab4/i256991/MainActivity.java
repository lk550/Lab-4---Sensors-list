package pl.edu.lab4.i256991;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager mSensorMan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        assert mSensorMan != null;
        List<Sensor> sensorList  = mSensorMan.getSensorList(Sensor.TYPE_ALL);

        StringBuilder sensorText = new StringBuilder();

        for (Sensor currentSensor : sensorList ) {
            sensorText.append(currentSensor.getName()).append(
                    System.getProperty("line.separator"));

        }
        TextView sensorTextView = findViewById(R.id.sensor_txt);
        sensorTextView.setText(sensorText);


    }
}
