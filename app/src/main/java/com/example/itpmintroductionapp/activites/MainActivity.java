package com.example.itpmintroductionapp.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.itpmintroductionapp.R;
import com.example.itpmintroductionapp.adapter.ItemsAdapter;
import com.example.itpmintroductionapp.domain.ItemsDomain;

import java.util.ArrayList;

/**
 * メイン画面
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPeople, adapterInfo;
    private RecyclerView recyclerViewPeople, recyclerviewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    /**
     * RecyclerViewの初期化
     */
    private void initRecyclerView() {
        // People表示用データ作成
        ArrayList<ItemsDomain> PeopleItemsArrayList = new ArrayList<>();
        PeopleItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", 2, 1, 841456, "pic1", true));
        PeopleItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", 3, 1, 654987, "pic2", false));
        PeopleItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", 3, 1, 841456, "pic1", true));

        // Info表示用データ作成
        ArrayList<ItemsDomain> InfoItemsArrayList = new ArrayList<>();
        InfoItemsArrayList.add(new ItemsDomain("入社前研修", "株式会社ITPM本社・会議室", "", 2, 1, 1, "pic_info2", true));
        InfoItemsArrayList.add(new ItemsDomain("神田カレーフェア", "", "", 2, 1, 1, "pic_info1", true));
        InfoItemsArrayList.add(new ItemsDomain("", "", "", 2, 1, 1, "pic_info1", true));

        recyclerViewPeople = findViewById(R.id.viewPopular);
        recyclerviewInfo = findViewById(R.id.viewNew);

        recyclerViewPeople.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerviewInfo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterPeople = new ItemsAdapter(PeopleItemsArrayList);
        adapterInfo = new ItemsAdapter(InfoItemsArrayList);

        recyclerViewPeople.setAdapter(adapterPeople);
        recyclerviewInfo.setAdapter(adapterInfo);
    }
}
