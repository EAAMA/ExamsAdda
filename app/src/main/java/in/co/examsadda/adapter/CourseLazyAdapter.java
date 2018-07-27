package in.co.examsadda.adapter;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import in.co.examsadda.R;
import in.co.examsadda.util.ImageLoader;

public class CourseLazyAdapter extends BaseAdapter {
    
    private Activity courseListActivity;
    private ArrayList<HashMap<String, String>> coursesData;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;
    
    public CourseLazyAdapter(Activity courseListActivity, ArrayList<HashMap<String, String>> coursesData) {
        this.courseListActivity = courseListActivity;
        this.coursesData=coursesData;
        inflater = (LayoutInflater)courseListActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(courseListActivity.getApplicationContext());
    }

    public int getCount() {
        return this.coursesData.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate( R.layout.course_list_row, null);

        TextView courseNameInEnglishTextView = (TextView)vi.findViewById(R.id.courseNameInEnglishTextView ); // Course Name in English
        TextView courseNameInRegionalTextView = (TextView)vi.findViewById(R.id.courseNameInRegionalTextView); // Course Name in Regional
        ImageView courseImage=(ImageView)vi.findViewById(R.id.course_image); // thumb image
        courseImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.course_icon));
        
        HashMap<String, String> course = new HashMap<String, String>();
        course = coursesData.get(position);
        
        // Setting all values in Course list View
        courseNameInEnglishTextView.setText("Course " + ++position);
        courseNameInRegionalTextView.setText("కోర్స్" + ++position);
        return vi;
    }
}