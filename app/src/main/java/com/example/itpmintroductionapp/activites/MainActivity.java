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
                " coffersd ceilings. ", "pic1"));
        PeopleItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", "pic2"));
        PeopleItemsArrayList.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", "This 2 bed /1 bath home boasts an enormouse,\n" +
                "open-living plan, accented by striking \n" +
                "architecTural features and high-end finishes.\n" +
                " Feel inspired by open sight lines that\n" +
                "embrace the outdoors, crowned by stunnin\n" +
                " coffersd ceilings. ", "pic1"));

        // Info表示用データ作成
        ArrayList<ItemsDomain> InfoItemsArrayList = new ArrayList<>();
        InfoItemsArrayList.add(new ItemsDomain("教育プログラム", "株式会社ITPM本社・会議室",
                "エンジニアとしてのスキルアップはもちろん、社会人として必要なビジネススキルアップも" +
                        "フォローしています。\nビジネスマナー研修では、ビジネスマナーの「基本」を学びます。挨拶、" +
                        "身だしなみ・正しい言葉づかい・職場でのマナーなど、社会人としての大切な研修です\n" +
                        "ITセミナーでは、「エンジニアの仕事って？」「PMOの仕事って？」などなど、" +
                        "IT業界のいろはをIT業界のスペシャリスト達から丁寧に教えてもらい、学ぶ大切な研修です\n" +
                        "それ以外にもスキルアップの場として勉強会の実施を行ったりしています。", "pic_info2"));
        InfoItemsArrayList.add(new ItemsDomain("神田カレーグランプリ 2023", "神田カレー街",
                "400店以上が集まる日本有数のカレーの聖地神田のカレーを食べ尽くし、栄光の神田カレーマイスターを目指すイベント" +
                        "「神田カレー街食べ歩きスタンプラリー2023」\n千代田区観光教会観光大使のリラックマも応援してくれています。\n" +
                        "株式会社ITPMは神田カレーグランプリのサポーターとして参加、応援しています。", "pic_info1"));
        InfoItemsArrayList.add(new ItemsDomain("", "", "", "pic_info3"));

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
