package com.example.laking.mynanoappportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(View view) {
        CharSequence text;

        Context context = getApplicationContext();
        Resources res = getResources();

        switch (view.getId()) {
            case R.id.spotify:
                text = res.getText(R.string.spotify_toast);
                break;
            case R.id.scores:
                text = res.getText(R.string.scores_toast);
                break;
            case R.id.library:
                text = res.getText(R.string.library_toast);
                break;
            case R.id.buildit:
                text = res.getText(R.string.buildit_toast);
                break;
            case R.id.xyz:
                text = res.getText(R.string.xyz_toast);
                break;
            case R.id.capstone:
                text = res.getText(R.string.capstone_toast);
                break;
            default:
                text="";
        }

        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
