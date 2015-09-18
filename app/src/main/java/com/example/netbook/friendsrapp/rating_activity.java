package com.example.netbook.friendsrapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


public class rating_activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_activity);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String info = intent.getStringExtra("info");
        int pic = intent.getIntExtra("pic", 0);

        TextView info_textView = (TextView) findViewById(R.id.profile_info);
        info_textView.setText(info);

        TextView name_textView = (TextView) findViewById(R.id.profile_name);
        name_textView.setText(name);

        ImageView pic_imageView = (ImageView) findViewById(R.id.profile_pic);
        pic_imageView.setImageResource(pic);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rating_activity, menu);
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

    public float getRating (){
        return 1;
    }

    public void rating_button_clicked(View view) {

        float rating = getRating();
        Intent i = new Intent();
        i.putExtra("rating", rating);
        setResult(RESULT_OK, i);
        finish();

    }
}
