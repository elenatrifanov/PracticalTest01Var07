package ro.pub.cs.systems.eim.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ro.pub.cs.systems.eim.practicaltest01var07.general.Constants;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    private EditText topLeft, topRight, bottomLeft, bottomRight;
    private Button set;
    final private static int ANOTHER_ACTIVITY_REQUEST_CODE = 2023;

    private GenericButtonClickListener genericButtonClickListener = new GenericButtonClickListener();
    private class GenericButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.set:
                    String top_left = topLeft.getText().toString();
                    String top_right = topRight.getText().toString();
                    String bottom_left = bottomLeft.getText().toString();
                    String bottom_right = bottomRight.getText().toString();
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var07SecondaryActivity.class);

                    if (top_left != null) {
                        intent.putExtra(Constants.top_left, top_left);
                    }
                    if (top_right != null) {
                        intent.putExtra(Constants.top_left, top_left);
                    }
                    if (bottom_left != null) {
                        intent.putExtra(Constants.top_left, top_left);
                    }
                    if (bottom_right != null) {
                        intent.putExtra(Constants.top_left, top_left);
                    }
                    startActivityForResult(intent, ANOTHER_ACTIVITY_REQUEST_CODE);
                    break;
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);
        topLeft = (EditText)findViewById(R.id.top_left);
        topRight = (EditText)findViewById(R.id.top_right);
        bottomLeft = (EditText) findViewById(R.id.bottom_left);
        bottomRight = (EditText) findViewById(R.id.bottom_right);
        set = (Button) findViewById(R.id.set);
        set.setOnClickListener(genericButtonClickListener);

        Intent intent = new Intent();

    //        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == ANOTHER_ACTIVITY_REQUEST_CODE) {
            Toast.makeText(this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();
        }
    }
}