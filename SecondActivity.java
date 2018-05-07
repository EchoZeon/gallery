package com.example.android.glidegalleryevilsecret;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ArrayList<Page> Page= new ArrayList<>();
        Page.add(new Page(R.drawable.prologo1,"Prologue 1"));
        Page.add(new Page(R.drawable.prologo2,"Prologue 2"));
        Page.add(new Page(R.drawable.prologo3,"Prologue 3"));
        Page.add(new Page(R.drawable.prologo4,"Prologue 4"));
        Page.add(new Page(R.drawable.prologo5,"Prologue 5"));
        Page.add(new Page(R.drawable.prologo6,"Prologue 6"));
        Page.add(new Page(R.drawable.pagina7,"Page 7"));
        Page.add(new Page(R.drawable.pagina8,"Page 8"));
        Page.add(new Page(R.drawable.pagina9,"Page 9"));
        Page.add(new Page(R.drawable.pagina10,"Page 10"));
        Page.add(new Page(R.drawable.pagina11,"Page 11"));
        Page.add(new Page(R.drawable.pagina12,"Page 12"));
        Page.add(new Page(R.drawable.pagina13,"Page 13"));
        Page.add(new Page(R.drawable.pagina14,"Page 14"));
        Page.add(new Page(R.drawable.pagina15,"Page 15"));
        Page.add(new Page(R.drawable.pagina16,"Page 16"));
        Page.add(new Page(R.drawable.pagina17,"Page 17"));
        Page.add(new Page(R.drawable.pagina18,"Page 18"));
        Page.add(new Page(R.drawable.pagina19,"Page 19"));
        Page.add(new Page(R.drawable.pagina20,"Page 20"));
        Page.add(new Page(R.drawable.pagina21,"Page 21"));
        Page.add(new Page(R.drawable.pagina22,"Page 22"));
        Page.add(new Page(R.drawable.pagina23,"Page 23"));
        Page.add(new Page(R.drawable.pagina24,"Page 24"));
        Page.add(new Page(R.drawable.pagina25,"Page 25"));
        Page.add(new Page(R.drawable.pagina26,"Page 26"));
        Page.add(new Page(R.drawable.pagina27,"Page 27"));
        Page.add(new Page(R.drawable.pagina28,"Page 28"));
        Page.add(new Page(R.drawable.pagina29,"Page 29"));
        Page.add(new Page(R.drawable.pagina30,"Page 30"));
        Page.add(new Page(R.drawable.pagina31,"Page 31"));
        Page.add(new Page(R.drawable.pagina32,"Page 32"));
        Page.add(new Page(R.drawable.pagina33,"Page 33"));
        Page.add(new Page(R.drawable.pagina34,"Page 34"));
        Page.add(new Page(R.drawable.pagina35,"Page 35"));
        Page.add(new Page(R.drawable.pagina36,"Page 36"));
        Page.add(new Page(R.drawable.pagina37,"Page 37"));
        Page.add(new Page(R.drawable.pagina38,"Page 38"));
        Page.add(new Page(R.drawable.pagina39,"Page 39"));
        Page.add(new Page(R.drawable.pagina40,"Page 40"));
        Page.add(new Page(R.drawable.pagina41,"Page 41"));
        Page.add(new Page(R.drawable.pagina42,"Page 42"));
        Page.add(new Page(R.drawable.pagina43,"Page 43"));
        Page.add(new Page(R.drawable.pagina44,"Page 44"));
        Page.add(new Page(R.drawable.pagina45,"Page 45"));
        Page.add(new Page(R.drawable.pagina46,"Page 46"));
        Page.add(new Page(R.drawable.pagina47,"Page 47"));
        Page.add(new Page(R.drawable.pagina48,"Page 48"));
        Page.add(new Page(R.drawable.pagina49,"Page 49"));
        Page.add(new Page(R.drawable.pagina50,"Page 50"));
        Page.add(new Page(R.drawable.pagina51,"Page 51"));
        Page.add(new Page(R.drawable.pagina52,"Page 52"));
        Page.add(new Page(R.drawable.pagina53,"Page 53"));
        Page.add(new Page(R.drawable.pagina54,"Page 54"));
        Page.add(new Page(R.drawable.pagina55,"Page 55"));
        Page.add(new Page(R.drawable.pagina56,"Page 56"));
        Page.add(new Page(R.drawable.pagina57,"Page 57"));
        Page.add(new Page(R.drawable.pagina58,"Page 58"));
        Page.add(new Page(R.drawable.pagina59,"Page 59"));
        Page.add(new Page(R.drawable.pagina60,"Page 60"));
        Page.add(new Page(R.drawable.pagina61,"Page 61"));
        Page.add(new Page(R.drawable.pagina62,"Page 62"));
        Page.add(new Page(R.drawable.pagina63,"Page 63"));
        Page.add(new Page(R.drawable.pagina64,"Page 64"));

        RecyclerView MyRV = findViewById(R.id.recyclerView_id);
        RecyclerAdapter MyAdapter = new RecyclerAdapter(this, Page);
        MyRV.setLayoutManager(new GridLayoutManager(this, 3));
        MyRV.setAdapter(MyAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
