package fr.lemet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.onebusaway.gtfs.model.Stop;
import org.onebusaway.gtfs.serialization.GtfsReader;
import org.onebusaway.gtfs.services.GtfsMutableRelationalDao;
import org.onebusaway.gtfs.services.HibernateGtfsFactory;

import fr.lemet.gtfs.GtfsBase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Horaires extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_horaires);
        final ListView listview = (ListView) findViewById(R.id.listView);
        setTitle("Horaires");
        //String resource = "classpath:org/onebusaway/gtfs/examples/hibernate-configuration-examples.xml";
        //HibernateGtfsFactory factory = GtfsBase.createHibernateGtfsFactory(resource);
        //GtfsReader reader = new GtfsReader();
/*        try {
            reader.setInputLocation(new File("file:assets/gtfs/"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        GtfsMutableRelationalDao dao = factory.getDao();
        reader.setEntityStore(dao);
        try {
            reader.run();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collection<Stop> stops = dao.getAllStops();



        for (Stop stop : stops)
            values.add(stop.getName());*/
        List<String> values = new ArrayList<String>();
        values.add("Android");
        values.add("iPhone");
        //String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
         //       "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
         //       "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
         //       "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
         //       "Android", "iPhone", "WindowsMobile" };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.size(); ++i) {
            list.add(values.get(i));
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                view.animate().setDuration(2000).alpha(0)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                list.remove(item);
                                adapter.notifyDataSetChanged();
                                view.setAlpha(1);
                            }
                        });
            }

        });
    }

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }

}