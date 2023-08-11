package com.example.itpmintroductionapp.activites;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.itpmintroductionapp.R;
import com.example.itpmintroductionapp.adapter.ItemsAdapter;
import com.example.itpmintroductionapp.domain.ItemsDomain;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private TextView titleTxt, addressTxt, bedTxt, bathTxt, wifiTxt, descriptionTxt, priceTxt;
    private ItemsDomain item;
    private ImageView pic;

    DecimalFormat formatter = new DecimalFormat("###,###,###.##");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        setVariable();
    }

    private void initView() {
        titleTxt = findViewById(R.id.titleTxt);
        addressTxt = findViewById(R.id.addressTxt);
        bedTxt = findViewById(R.id.bedTxt);
        bathTxt = findViewById(R.id.bathTxt);
        wifiTxt = findViewById(R.id.wifiTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        pic = findViewById(R.id.pic);
        priceTxt = findViewById(R.id.priceTxt);
    }

    private void setVariable() {
        item = (ItemsDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(item.getTitle());
        addressTxt.setText(item.getAddress());
        bedTxt.setText(item.getBed() + "Bed");
        bathTxt.setText(item.getBath() + "Bath");
        descriptionTxt.setText(item.getDescription());
        priceTxt.setText("$" + formatter.format(item.getPrice()));

        if (item.isWifi()) {
            wifiTxt.setText("Wifi");
        } else {
            wifiTxt.setText("No-Wifi");
        }

        int drawableResourceId = getResources().getIdentifier(item.getPic(), "drawable", getPackageName());

        Glide.with(this)
            .load(drawableResourceId)
            .into(pic);
    }
}
