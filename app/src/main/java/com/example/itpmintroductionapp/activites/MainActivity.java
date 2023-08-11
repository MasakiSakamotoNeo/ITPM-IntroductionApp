package com.example.itpmintroductionapp.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.itpmintroductionapp.R;
import com.example.itpmintroductionapp.adapter.ItemsAdapter;
import com.example.itpmintroductionapp.domain.ItemsDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular, adapterNew;
    private RecyclerView recyclerViewPopular, recyclerviewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<ItemsDomain> ItemsArrayList = new ArrayList<>();
        ItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", 2, 1, 841456, "pic1", true));
        ItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", 3, 1, 654987, "pic2", false));
        ItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", 3, 1, 841456, "pic1", true));

        recyclerViewPopular = findViewById(R.id.viewPopular);
        recyclerviewNew = findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerviewNew.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterPopular = new ItemsAdapter(ItemsArrayList);
        adapterNew = new ItemsAdapter(ItemsArrayList);

        recyclerViewPopular.setAdapter(adapterPopular);
        recyclerviewNew.setAdapter(adapterNew);
    }
}