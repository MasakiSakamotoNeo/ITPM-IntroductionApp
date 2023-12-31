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
        PeopleItemsArrayList.add(new ItemsDomain(
                getString(R.string.hr_department_people_title),
                getString(R.string.hr_department_people_address),
                getString(R.string.hr_department_people_description),
                "pic_people1"
        ));
        PeopleItemsArrayList.add(new ItemsDomain(
                getString(R.string.its_people_title),
                getString(R.string.its_people_address),
                getString(R.string.its_people_description),
                "pic_people2"
        ));
        PeopleItemsArrayList.add(new ItemsDomain(
                getString(R.string.sales_department_people_title),
                getString(R.string.sales_department_people_address),
                getString(R.string.sales_department_people_description),
                "pic_people5"
        ));
        PeopleItemsArrayList.add(new ItemsDomain(
                getString(R.string.management_people_title),
                getString(R.string.management_people_address),
                getString(R.string.management_people_description),
                "pic_people6"
        ));

        // Info表示用データ作成
        ArrayList<ItemsDomain> InfoItemsArrayList = new ArrayList<>();
        InfoItemsArrayList.add(new ItemsDomain(
                getString(R.string.educational_program),
                getString(R.string.educational_program_address),
                getString(R.string.educational_program_description),
                "pic_info2"
        ));
        InfoItemsArrayList.add(new ItemsDomain(
                getString(R.string.curry_grand_prix_2023),
                getString(R.string.curry_grand_prix_2023_address),
                getString(R.string.curry_grand_prix_2023_description),
                "pic_info1"
        ));
        InfoItemsArrayList.add(new ItemsDomain(
                getString(R.string.itpm_conference_and_exhibition),
                getString(R.string.itpm_conference_and_exhibition_address),
                getString(R.string.itpm_conference_and_exhibition_description),
                "pic_info3"
        ));

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
