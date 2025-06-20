package com.rabbi.mytravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rabbi.mytravelapp.AllTourAttractions.TourAttractionsList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView touristdestinations, touristattractions;
    ArrayList<TouristDestinations_MODEL> touristDestinations_models;
    ArrayList<TouristAttractions_MODEL> touristAttractions_models;
    TouristDestinations_ADAPTER touristDestinations_adapter;
    TouristAttractions_ADAPTER touristAttractions_adapter;
    LinearLayoutManager manager;
    TextView seetouristdestinations;
    Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touristdestinations = findViewById(R.id.touristdestinations_recyclerview);

        touristDestinations_models = new ArrayList<>();
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.sylhet, "It is a metropolitan city", "Sylhet"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.bandorbon, "Queen of natural beauty", "Bandarban"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.chittagong, "It also called Chattogram", "Chittagong"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.dhaka, "The capital of Bangladesh", "Dhaka"));

        touristDestinations_adapter = new TouristDestinations_ADAPTER(this, touristDestinations_models);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        touristdestinations.setAdapter(touristDestinations_adapter);
        touristdestinations.setLayoutManager(manager);

        touristattractions = findViewById(R.id.touristattractions_recyclerview);

        touristAttractions_models = new ArrayList<>();
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.cox, "The largest sea beach in the world", "Cox's Bazar"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.sajek, "Popular tourist spot in Bangladesh", "Sajek Valley"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.sun, "world's largest mangrove forest", "Sundarban"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.saint, "It is the only coral island in Bangladesh", "Saint-Martin"));

        touristAttractions_adapter = new TouristAttractions_ADAPTER(this, touristAttractions_models);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        touristattractions.setAdapter(touristAttractions_adapter);
        touristattractions.setLayoutManager(manager);

        explore = findViewById(R.id.exploretouristdestinations_button);
        seetouristdestinations = findViewById(R.id.seetouristdestinations_link);


        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
            }
        });

        seetouristdestinations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
            }
        });

    }
}