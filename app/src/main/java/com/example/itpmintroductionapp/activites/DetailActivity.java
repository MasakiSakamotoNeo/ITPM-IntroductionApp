package com.example.itpmintroductionapp.activites;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.itpmintroductionapp.R;
import com.example.itpmintroductionapp.domain.ItemsDomain;
import com.google.android.material.snackbar.Snackbar;

/**
 * 詳細画面
 */
public class DetailActivity extends AppCompatActivity {

    private TextView titleTxt, addressTxt, descriptionTxt;
    private ItemsDomain item;
    private ImageView pic;
    private AppCompatButton goodBtn;

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
        descriptionTxt = findViewById(R.id.descriptionTxt);
        pic = findViewById(R.id.pic);
        goodBtn = findViewById(R.id.goodBtn);
    }

    private void setVariable() {
        item = (ItemsDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(item.getTitle());
        addressTxt.setText(item.getAddress());
        descriptionTxt.setText(item.getDescription());

        int drawableResourceId = getResources().getIdentifier(item.getPic(), "drawable", getPackageName());

        Glide.with(this)
            .load(drawableResourceId)
            .into(pic);

        goodBtn.setOnClickListener(view -> {
            // TODO: Snackbarで「いいねをしました。」を表示する。
        });
    }

    private void showSnackBar(View view) {
        Snackbar.make(view, "いいねをしました。", Snackbar.LENGTH_SHORT).show();
    }
}
