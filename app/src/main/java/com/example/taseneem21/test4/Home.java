package com.example.taseneem21.test4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by taseneem 21 on 11/27/2016.
 */
public class Home extends ActionBarActivity {

    ListView listView;
    //ArrayList<Hospital> arrayList = new ArrayList<Hospital>();
   // CustomListAdapter customListAdapter;
    //Hospital hospital = new Hospital();
    ArrayList<String> arrayList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        listView = (ListView) findViewById(R.id.list1);



       // customListAdapter = new CustomListAdapter(arrayList,this);
       // DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.listview_item_row, drawerItem);

        //listView.setAdapter(customListAdapter);

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i=new Intent(Home.this,login.class);

            startActivity(i);
            finish();

        }
        else if (id == R.id.log_out){
            Intent i=new Intent(Home.this,login.class);

            startActivity(i);
            finish();
        }

        else if (id == R.id.request_blood){
            Intent i=new Intent(Home.this,request_blood.class);

            startActivity(i);
            finish();
        }

        else if (id == R.id.About_us){
            Intent i=new Intent(Home.this,login.class);

            startActivity(i);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }
}
