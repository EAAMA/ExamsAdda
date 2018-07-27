package in.co.examsadda.dao;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.vo.InstituteUserCourse;
import in.co.examsadda.vo.PracticePaper;

public class PracticePaperDao extends AsyncTask<InstituteUserCourse, Integer, List<PracticePaper>> {

    /**
     * Runs on the UI thread before {@link #doInBackground}.
     *
     * @see #onPostExecute
     * @see #doInBackground
     */
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    /**
     * Override this method to perform a computation on a background thread. The
     * specified parameters are the parameters passed to {@link #execute}
     * by the caller of this task.
     * <p>
     * This method can call {@link #publishProgress} to publish updates
     * on the UI thread.
     *
     * @param instituteUserCourses The parameters of the task.
     * @return A result, defined by the subclass of this task.
     * @see #onPreExecute()
     * @see #onPostExecute
     * @see #publishProgress
     */
    @Override
    protected List<PracticePaper> doInBackground(InstituteUserCourse... instituteUserCourses) {
        List<PracticePaper> practicePaperList = new ArrayList<PracticePaper>( );
        for(int index = 1 ; index <=20 ; index++){
            PracticePaper practicePaper = new PracticePaper();
            practicePaper.setNumberOfSectionsInThisPracticePaper( 5 );
            practicePaper.setPracticePaperNameInEnglish( "Practice Paper " + index );
            practicePaper.setPracticePaperNameInRegional( "అభ్యస పరీక్ష " + index );
            practicePaperList.add( practicePaper );
        }
        return practicePaperList;
    }

    /**
     * <p>Runs on the UI thread after {@link #doInBackground}. The
     * specified result is the value returned by {@link #doInBackground}.</p>
     * <p>
     * <p>This method won't be invoked if the task was cancelled.</p>
     *
     * @param practicePapers The result of the operation computed by {@link #doInBackground}.
     * @see #onPreExecute
     * @see #doInBackground
     * @see #onCancelled(Object)
     */
    @Override
    protected void onPostExecute(List<PracticePaper> practicePapers) {
        super.onPostExecute( practicePapers );
    }
}
