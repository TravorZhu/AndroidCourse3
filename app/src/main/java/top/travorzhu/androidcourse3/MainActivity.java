package top.travorzhu.androidcourse3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AListenerTestActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CallbackHandler.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.button8);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ConfigurationTest.class);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.button9);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ProgressDialogTest.class);
                startActivity(intent);
            }
        });

    }

    public void anotherOnclick(View v) {
        ((EditText) findViewById(R.id.editText)).setText("绑定到标签");
    }
}
