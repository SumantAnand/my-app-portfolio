package com.sumant.udacity.nanodegree.appportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortFolioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_port_folio);
    }

    public void spotifyStreamer(View v){
        showToast("spotify streamer app");
    }

    public void scoreApp(View v){
        showToast("score app");
    }

    public void libraryApp(View v){
        showToast("library app");
    }

    public void buildItBigger(View v){
        showToast("build it bigger app");
    }

    public void xyzReader(View v){
        showToast("xyz reader app");
    }

    public void myApp(View v){
        showToast("my capstone app");
    }


    private void showToast(String message){
        Toast.makeText(this,"This button will launch "+message,Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_port_folio, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
