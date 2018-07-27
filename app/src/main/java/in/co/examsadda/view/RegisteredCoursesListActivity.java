package in.co.examsadda.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import in.co.examsadda.R;
import in.co.examsadda.adapter.CourseLazyAdapter;
import in.co.examsadda.dao.CourseDao;

public class RegisteredCoursesListActivity extends AppCompatActivity {


    private ListView registeredCoursesListView;
    private CourseLazyAdapter courseLazyAdapter;
    private ArrayList<HashMap<String, String>> coursesList = new ArrayList<HashMap<String, String>>();
    private   Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_registered_courses_list );

/*        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);*/

        try {
            coursesList = new CourseDao().execute( "" ).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        registeredCoursesListView=(ListView)findViewById(R.id.registered_courses_list_view);

        // Getting adapter by passing xml data ArrayList
        courseLazyAdapter=new CourseLazyAdapter(this, coursesList);
        registeredCoursesListView.setAdapter(courseLazyAdapter);


        // Click event for single list row
        registeredCoursesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(intent == null) {
                    intent = new Intent( RegisteredCoursesListActivity.this, PracticePaperListActivity.class );
                }
                startActivity( intent );

            }
        });
    }
}