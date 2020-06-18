package com.example.asynctaskproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.InputStream;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private final String IMAGE_PATH="https://github.com/DannnniHuang/CS6392019/blob/master/AsyncTask/nanningimage.png?raw=true";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView()
    {


        button = findViewById(R.id.buttonOnClicksAsyncTask);
        imageView = findViewById(R.id.imageViewss);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                new MyAsyncTask().execute(IMAGE_PATH);
            }
        });
    }


    public class MyAsyncTask extends AsyncTask<String, Integer, Bitmap>
    {
        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();


        }
        @Override
        protected Bitmap doInBackground(String... params)
        {

            Bitmap bitmap=null;
            try {
                URL u=new URL(IMAGE_PATH);
                InputStream in=u.openStream();
                bitmap=BitmapFactory.decodeStream(in);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return bitmap;
        }
        @Override
        protected void onProgressUpdate(Integer... values)
        {
            super.onProgressUpdate(values);
        }
        @Override
        protected void onPostExecute(Bitmap result)
        {
            super.onPostExecute(result);

            imageView.setImageBitmap(result);

        }
    }


}