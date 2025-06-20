package com.rabbi.mytravelapp.AllTourAttractions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rabbi.mytravelapp.R;

import java.util.ArrayList;

public class TourAttractionsList extends AppCompatActivity {

    RecyclerView recycler;
    LinearLayoutManager manager;
    TourAttractionsList_Adapter adapter;
    ArrayList<TourAttractionsList_Model> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attractions_list);

        array = new ArrayList<>();
        array.add(new TourAttractionsList_Model("Jaflong", "Sylhet", R.drawable.jaflong));
        array.add(new TourAttractionsList_Model("Bichanakandi", "Sylhet", R.drawable.bichanakandi));
        array.add(new TourAttractionsList_Model("Chandronath Hill", "Chittagong", R.drawable.chandronath));
        array.add(new TourAttractionsList_Model("Nill-Giri", "Bandarban", R.drawable.hill));
        array.add(new TourAttractionsList_Model("Saint-Martin", "Cox's Bazar", R.drawable.saint));
        array.add(new TourAttractionsList_Model("Kuakata", "Patuakhali", R.drawable.kuakata));
        array.add(new TourAttractionsList_Model("Sundarban", "Khulna", R.drawable.sun));
        array.add(new TourAttractionsList_Model("Cox's Bazar", "Cox's Bazar", R.drawable.cox));
        array.add(new TourAttractionsList_Model("Sajek Valley", "Rangamati", R.drawable.sajek));
        array.add(new TourAttractionsList_Model("Nafa-Khum Waterfall", "Bandarban", R.drawable.nafa));

        adapter = new TourAttractionsList_Adapter(this, array);

        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler = findViewById(R.id.tourattr_recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(manager);

    }
}