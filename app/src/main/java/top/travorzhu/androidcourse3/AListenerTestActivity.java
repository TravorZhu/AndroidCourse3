package top.travorzhu.androidcourse3;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AListenerTestActivity extends AppCompatActivity implements View.OnClickListener, LIsten.OnFragmentInteractionListener {

    public static EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alistener_test);


        text = findViewById(R.id.editText);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new clickListenerInside());

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new clickListenerOutside());

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("匿名内部类");
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new AListenerTestActivity());

        Button button5 = findViewById(R.id.button5);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void anotherOnclick(View v) {
        text.setText("绑定到标签");
    }

    @Override
    public void onClick(View v) {
        text.setText("Activity");
    }

    private class clickListenerInside implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            text.setText("内部类");
        }
    }
}
