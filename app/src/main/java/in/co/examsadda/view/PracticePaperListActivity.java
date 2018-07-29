package in.co.examsadda.view;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.ExecutionException;

import in.co.examsadda.R;
import in.co.examsadda.adapter.PracticePaperLazyAdapter;
import in.co.examsadda.dao.PracticePaperDao;
import in.co.examsadda.vo.InstituteUserCourse;
import in.co.examsadda.vo.PracticePaper;

public class PracticePaperListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView practicePapersListView;
    private PracticePaperLazyAdapter practicePaperLazyAdapter;
    private List<PracticePaper> practicePapersList ;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_course_practice_paper_list );
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        try {
            practicePapersList = new PracticePaperDao().execute(new InstituteUserCourse() ).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        practicePapersListView =(ListView)findViewById(R.id.course_practice_papers_list_view);
        practicePaperLazyAdapter = new PracticePaperLazyAdapter( this,practicePapersList );
        practicePapersListView.setAdapter( practicePaperLazyAdapter );
        practicePapersListView.setOnItemClickListener( this  );

    }

    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param parent   The AdapterView where the click happened.
     * @param view     The view within the AdapterView that was clicked (this
     *                 will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id       The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        startActivity( new Intent( this, ExamActivity.class ) );
    /*    String url = "https://developers.google.com/search/web?v=1.0&q={query}";

// Create a new RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

// Add the String message converter
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

// Make the HTTP GET request, marshaling the response to a String
        String result = restTemplate.getForObject(url, String.class, "Android");
        Toast.makeText( this,result,Toast.LENGTH_LONG ).show();*/
    }
}
