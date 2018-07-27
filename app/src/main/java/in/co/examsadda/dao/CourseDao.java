package in.co.examsadda.dao;

import android.os.AsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

import in.co.examsadda.parser.XMLParser;
import in.co.examsadda.util.DataKeyNames;

public class CourseDao extends AsyncTask<String,ArrayList<HashMap<String, String>>,ArrayList<HashMap<String, String>>> {
    @Override
    protected ArrayList<HashMap<String, String>> doInBackground(String... strings) {
        ArrayList<HashMap<String, String>> coursesList = new ArrayList<HashMap<String, String>>();

        XMLParser parser = new XMLParser();
        String xml = parser.getXmlFromUrl( DataKeyNames.URL); // getting XML from URL
        Document doc = parser.getDomElement(xml); // getting DOM element

        NodeList nl = doc.getElementsByTagName(DataKeyNames.KEY_SONG);
        // looping through all song nodes <song>
        for (int i = 0; i < nl.getLength(); i++) {
            // creating new HashMap
            HashMap<String, String> map = new HashMap<String, String>();
            Element e = (Element) nl.item(i);
            // adding each child node to HashMap key => value
            map.put(DataKeyNames.KEY_ID, parser.getValue(e, DataKeyNames.KEY_ID));
            map.put(DataKeyNames.KEY_TITLE, parser.getValue(e, DataKeyNames.KEY_TITLE));
            map.put(DataKeyNames.KEY_ARTIST, parser.getValue(e, DataKeyNames.KEY_ARTIST));
            map.put(DataKeyNames.KEY_DURATION, parser.getValue(e, DataKeyNames.KEY_DURATION));
            map.put(DataKeyNames.KEY_THUMB_URL, parser.getValue(e, DataKeyNames.KEY_THUMB_URL));

            // adding HashList to ArrayList
            coursesList.add(map);
        }
        return coursesList;
    }
}
