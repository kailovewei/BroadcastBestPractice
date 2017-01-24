package ykk.broadcasttest.com.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Dell-home on 2017/1/24.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
