package com.example.movienerds.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.movienerds.R;
import com.example.movienerds.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView movieNameTV;
    Button getmovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         movieNameTV=findViewById(R.id.textView);
         getmovie= findViewById(R.id.button);
    }
    public MovieModel movieModulrefromDatabase(){
        return new MovieModel("advengurs","2019","heros save the world",1);

    }

    public void getMovie() {
        movieNameTV.getText(movieModulrefromDatabase().getName());

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button);
        getMovie();

    }
}
