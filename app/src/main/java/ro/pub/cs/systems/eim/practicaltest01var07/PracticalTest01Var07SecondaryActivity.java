package ro.pub.cs.systems.eim.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {

    private TextView topLeft, topRight, bottomLeft, bottomRight;
    private Button sum, product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_secondary);

        topLeft = (TextView) findViewById(R.id.top_left_text);
        topRight = (TextView)findViewById(R.id.top_right_text);
        bottomLeft = (TextView) findViewById(R.id.bottom_left_text);
        bottomRight = (TextView) findViewById(R.id.bottom_right_text);
        sum = (Button) findViewById(R.id.sum);
        product = (Button) findViewById(R.id.product);

        Intent intentFromParent = getIntent();
        if (intentFromParent!=null) {
            Bundle data= intentFromParent.getExtras();
            topLeft.setText(String.valueOf("1"));
            topRight.setText(String.valueOf("1"));
            bottomLeft.setText(String.valueOf("1"));
            bottomRight.setText(String.valueOf("1"));
        }

    }
}