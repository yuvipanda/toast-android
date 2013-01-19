package in.yuvi.toaster;

import android.app.Activity;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.lib.SlidingMenu;
import com.slidingmenu.lib.app.SlidingActivity;

public class PlaceActivity extends SlidingActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listplaces);
<<<<<<< HEAD
        
=======
        setBehindContentView(R.layout.layout_slidemenu);

        getSlidingMenu().setBehindOffset(160);
        getSlidingMenu().setMode(SlidingMenu.LEFT);
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setSlidingActionBarEnabled(true);
>>>>>>> f654080be1ebb869350cad6b6108faa89a3eb709
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                toggle();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
