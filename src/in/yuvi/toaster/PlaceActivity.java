package in.yuvi.toaster;

import android.app.Activity;
import android.os.Bundle;

public class PlaceActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listplaces);
    }
}
