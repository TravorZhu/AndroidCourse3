package top.travorzhu.androidcourse3;

import android.view.View;

public class clickListenerOutside implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        AListenerTestActivity.text.setText("外部类");
    }
}
