package com.example.izzatullah.learns;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class SwitchB extends AppCompatActivity {
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_b);


        gv = (GridView) findViewById(R.id.gridview);
        gv.setAdapter(new ImageAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SwitchB.this, "" + i, Toast.LENGTH_SHORT).show();
                if (i == 1) {
                    showForm();
                }
                if (i == 4) {
                    openForm(Numbers.class);
                }
                if (i == 7) {
                    showRat();
                }
                if (i == 8) {
                    openForm(Gps.class);
                }
            }
        });
    }




    private void openForm(Class<?> wins){
        Intent intent=new Intent(SwitchB.this, wins);
        startActivity(intent);
    }
    private void showRat(){
        AlertDialog.Builder mBuilder=new AlertDialog.Builder(SwitchB.this);
        View mView=getLayoutInflater().inflate(R.layout.activity_ratings, null);
        final RatingBar rb=(RatingBar)mView.findViewById(R.id.ratingBar);
        Button cmdRat=(Button)mView.findViewById(R.id.cmdRat);
        cmdRat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String rat=String.valueOf(rb.getRating());
                Toast.makeText(getApplicationContext(), rat, Toast.LENGTH_SHORT).show();
            }
        });
        mBuilder.setView(mView);
        AlertDialog alert=mBuilder.create();
        alert.show();
    }
    private void showForm(){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);

        alert.setMessage("You will learn urdu with these application");
        alert.setIcon(R.drawable.pic1);
        AlertDialog am=alert.create();
        am.show();
    }
    public class ImageAdapter extends BaseAdapter{
        private Context myContext;
        public ImageAdapter(Context c){
            myContext=c;
        }
        public int getCount(){
            return mThuiable.length;
        }
        public Object getItem(int position){
            return null;
        }
        public long getItemId(int position){
            return 0;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView=new ImageView(myContext);
            imageView.setImageResource(mThuiable[position]);
            return imageView;
        }
        private Integer mThuiable[]={
                R.drawable.simple_7,
                R.drawable.simple1,
                R.drawable.simple4,
                R.drawable.simple_5,
                R.drawable.simple_0,
                R.drawable.simple_6,
                R.drawable.simple_7,
                R.drawable.simple_8,
                R.drawable.simple_9,
                R.drawable.abouts,
                R.drawable.add,
                R.drawable.browse,
                R.drawable.cart,
                R.drawable.exit,
                R.drawable.about,
                R.drawable.power,
                R.drawable.abouts,
                R.drawable.add,
                R.drawable.browse,
                R.drawable.cart,
                R.drawable.exit,
                R.drawable.about,

        };
    }
}
