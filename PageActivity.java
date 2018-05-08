package com.example.android.glidegalleryevilsecret;


import android.graphics.Matrix;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;


import java.util.List;


public class PageActivity extends AppCompatActivity {

    public List<Page> mData;
    public ImageView img;
    ViewPager viewPager;
    SwipeAdapter swipeAdapter;
    Toolbar toolbar;
    Matrix matrix = new Matrix();
    Float scale = 1f;
    ScaleGestureDetector SGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        
        //receive data
        Intent intent = getIntent();
        int image = intent.getExtras().getInt("Thumbnail");
        //set value
        img.setImageResource(image);
        
        viewPager = findViewById(R.id.viewPager);
        swipeAdapter = new SwipeAdapter(PageActivity.this, mData);
        viewPager.setAdapter(swipeAdapter);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        SGD = new ScaleGestureDetector(this, new ScaleListener());


    }

    @Override
    public boolean onTouchEvent (MotionEvent event) {
        SGD.onTouchEvent(event);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector){
            scale = scale * detector.getScaleFactor();
             scale = Math.max(0.1f, Math.min(scale, 5f));
             matrix.setScale(scale, scale);
             img.setImageMatrix(matrix);
             return true;
        }
    }


}
