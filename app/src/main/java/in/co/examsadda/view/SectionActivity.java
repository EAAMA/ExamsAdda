package in.co.examsadda.view;

import in.co.examsadda.R;
import in.co.examsadda.adapter.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class SectionActivity extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	Resources res; 
	String[] name;
	Bundle bundle;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView( R.layout.activity_section_layout);
		bundle=getIntent().getExtras();
		// get the listview
				expListView = (ExpandableListView) findViewById(R.id.lvExp);

				// preparing list data
				prepareListData();

				listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

				// setting list adapter
				expListView.setAdapter(listAdapter);

				// Listview Group click listener
				expListView.setOnGroupClickListener(new OnGroupClickListener() {

					@Override
					public boolean onGroupClick(ExpandableListView parent, View v,
							int groupPosition, long id) {
						// Toast.makeText(getApplicationContext(),
						// "Group Clicked " + listDataHeader.get(groupPosition),
						// Toast.LENGTH_SHORT).show();
						return false;
					}
				});

				// Listview Group expanded listener
				expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

					@Override
					public void onGroupExpand(int groupPosition) {
						Toast.makeText(getApplicationContext(),
								listDataHeader.get(groupPosition) + " Expanded",Toast.LENGTH_SHORT).show();
					}
				});

				// Listview Group collasped listener
				expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

					@Override
					public void onGroupCollapse(int groupPosition) {
						Toast.makeText(getApplicationContext(),
								listDataHeader.get(groupPosition) + " Collapsed",
								Toast.LENGTH_SHORT).show();

					}
				});

				// Listview on child click listener
				expListView.setOnChildClickListener(new OnChildClickListener() {

					@Override
					public boolean onChildClick(ExpandableListView parent, View v,
							int groupPosition, int childPosition, long id) {
						// TODO Auto-generated method stub
						Toast.makeText(	getApplicationContext(),listDataHeader.get(groupPosition)
						+ " : "	+ listDataChild.get(listDataHeader.get(groupPosition)).
						get(childPosition), Toast.LENGTH_SHORT)	.show();
						return false;
					}
				});
		
	}
	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();
		res = getResources();
		if(bundle.getString("MODE").equalsIgnoreCase("EARTHQUAKE")){
			// Adding child data
			listDataHeader.add("BEFORE EARTHQUAKE");
			listDataHeader.add("DURING EARTHQUAKE");
			listDataHeader.add("AFTER EARTHQUAKE");
	
			// Adding child data
			List<String> before = new ArrayList<String>();
			name = res.getStringArray(R.array.before_earthquake);
			for(String caution:name)
				before.add(caution);
			List<String> during = new ArrayList<String>();
			name = res.getStringArray(R.array.during_earthquake);
			for(String caution:name)
				during.add(caution);
	
			List<String> after = new ArrayList<String>();
			name = res.getStringArray(R.array.after_earthquake);
			for(String caution:name)
				after.add(caution);
			
			listDataChild.put(listDataHeader.get(0), before); // Header, Child data
			listDataChild.put(listDataHeader.get(1), during);
			listDataChild.put(listDataHeader.get(2), after);
		}else{
			// Adding child data
						
						listDataHeader.add("DURING FLOOD");
						listDataHeader.add("AFTER FLOOD");
				
						// Adding child data
						
						List<String> during = new ArrayList<String>();
						name = res.getStringArray(R.array.during_flood);
						for(String caution:name)
							during.add(caution);
				
						List<String> after = new ArrayList<String>();
						name = res.getStringArray(R.array.after_flood);
						for(String caution:name)
							after.add(caution);
						
						// Header, Child data
						listDataChild.put(listDataHeader.get(0), during);
						listDataChild.put(listDataHeader.get(1), after);
		}
	}



}
