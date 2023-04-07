package ro.pub.cs.systems.eim.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    private EditText topLeft, topRight, bottomLeft, bottomRight;
    private Button set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);
        topLeft = (EditText)findViewById(R.id.top_left);
        topRight = (EditText)findViewById(R.id.top_right);
        bottomLeft = (EditText) findViewById(R.id.bottom_left);
        bottomRight = (EditText) findViewById(R.id.bottom_right);
        set = (Button) findViewById(R.id.set);
    }
}