package com.example.netbook.friendsrapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class menu_activity extends ActionBarActivity {

    String name[];
    String info[];
    float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activity);

        name = getResources().getStringArray(R.array.friend_full_names);
        info = getResources().getStringArray(R.array.friend_details);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_activity, menu);
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

    public void chandler_button_clicked(View view) {
        Intent i = new Intent(getApplicationContext(), rating_activity.class);
        String character_name = name[0];
        String character_info = info[0];
        int character_pic = getResources().getIdentifier("chandler", "drawable", this.getPackageName());
        i.putExtra("name", character_name);
        i.putExtra("info", character_info);
        i.putExtra("pic", character_pic);
        startActivityForResult(i, 1992);

    }

    public void joey_button_clicked(View view) {
        Intent i = new Intent(getApplicationContext(), rating_activity.class);
        String character_name = name[1];
        String character_info = info[1];
        int character_pic = getResources().getIdentifier("joey", "drawable", this.getPackageName());
        i.putExtra("name", character_name);
        i.putExtra("info", character_info);
        i.putExtra("pic", character_pic);
        startActivityForResult(i, 1992);
    }

    public void monica_button_clicked(View view) {
        Intent i = new Intent(getApplicationContext(), rating_activity.class);
        String character_name = name[2];
        String character_info = info[2];
        int character_pic = getResources().getIdentifier("monica", "drawable", this.getPackageName());
        i.putExtra("name", character_name);
        i.putExtra("info", character_info);
        i.putExtra("pic", character_pic);
        startActivityForResult(i, 1992);
    }

    public void phoebe_button_clicked(View view) {
        Intent i = new Intent(getApplicationContext(), rating_activity.class);
        String character_name = name[3];
        String character_info = info[3];
        int character_pic = getResources().getIdentifier("phoebe", "drawable", this.getPackageName());
        i.putExtra("name", character_name);
        i.putExtra("info", character_info);
        i.putExtra("pic", character_pic);
        startActivityForResult(i, 1992);
    }

    public void rachel_button_clicked(View view) {
        Intent i = new Intent(getApplicationContext(), rating_activity.class);
        String character_name = name[4];
        String character_info = info[4];
        int character_pic = getResources().getIdentifier("rachel", "drawable", this.getPackageName());
        i.putExtra("name", character_name);
        i.putExtra("info", character_info);
        i.putExtra("pic", character_pic);
        startActivityForResult(i, 1992);
    }

    public void ross_button_clicked(View view) {
        Intent i = new Intent(getApplicationContext(), rating_activity.class);
        String character_name = name[5];
        String character_info = info[5];
        int character_pic = getResources().getIdentifier("ross", "drawable", this.getPackageName());
        i.putExtra("name", character_name);
        i.putExtra("info", character_info);
        i.putExtra("pic", character_pic);
        startActivityForResult(i, 1992);
    }

    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 1992) {
            // came back from SecondActivity
            float rating = intent.getFloatExtra("rating", 0);
        }


    }
}
