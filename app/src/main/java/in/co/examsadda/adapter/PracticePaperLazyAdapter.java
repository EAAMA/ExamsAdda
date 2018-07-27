package in.co.examsadda.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import in.co.examsadda.R;
import in.co.examsadda.util.ImageLoader;
import in.co.examsadda.vo.PracticePaper;

public class PracticePaperLazyAdapter extends BaseAdapter {

    private Activity practicePaperListActivity;
    private List<PracticePaper> practicePapers;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;

    public PracticePaperLazyAdapter(Activity practicePaperListActivity, List<PracticePaper> practicePapers) {
        this.practicePaperListActivity = practicePaperListActivity;
        this.practicePapers = practicePapers;
        inflater = (LayoutInflater)this.practicePaperListActivity.getSystemService( Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(this.practicePaperListActivity.getApplicationContext());
    }

    @Override
    public int getCount() {
        return practicePapers != null?practicePapers.size(): 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View practicePaperView=convertView;
        if(convertView==null)
            practicePaperView = inflater.inflate( R.layout.practice_paper_list_row, null);

        TextView practicePaperNameInEnglishTextView = (TextView)practicePaperView.findViewById(R.id.practicePaperNameInEnglishTextView ); // Course Name in English
        TextView courseNameInRegionalTextView = (TextView)practicePaperView.findViewById(R.id.practicePaperNameInRegionalTextView); // Course Name in Regional
        ImageView practicePaperNameInRegionalTextView=(ImageView)practicePaperView.findViewById(R.id.course_image); // thumb image

        PracticePaper practicePaper = practicePapers.get(position);

        // Setting all values in Course list View
        if(practicePaper != null) {
            practicePaperNameInEnglishTextView.setText( "Practice Paper " +  ++position);
            courseNameInRegionalTextView.setText( "అభ్యస పరీక్ష " + ++position );
        }
        return practicePaperView;
    }
}
