package in.co.examsadda.view;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import in.co.examsadda.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see
 */
public class ExamActivity extends TabActivity {
	
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView( R.layout.exam_activity_layout);
		  TabHost tabHost = getTabHost();
          TabSpec flood = tabHost.newTabSpec("Section 1");
          flood.setIndicator("section 1");
	      
	      intent = new Intent(this, SectionActivity.class).putExtra("MODE","FLOOD");
	      flood.setContent(intent);
	    
	      TabSpec earthquake = tabHost.newTabSpec("Section 2");
	      earthquake.setIndicator("Section 2");
	      
	      intent = new Intent(this, SectionActivity.class).putExtra("MODE","EARTHQUAKE");
	      earthquake.setContent(intent);
	       
	       
	       tabHost.addTab(flood); 
	       tabHost.addTab(earthquake);
	}
}
