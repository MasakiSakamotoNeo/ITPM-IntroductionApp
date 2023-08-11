package com.example.itpmintroductionapp.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.itpmintroductionapp.R;

/**
 * Top画面
 */
public class IntroActivity extends AppCompatActivity {

    // 開始ボタン
    private Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        initView();
    }

    /**
     * Viewの初期化
     */
    private void initView() {
        startBtn = findViewById(R.id.startBtn);
        // 開始ボタンのタップ処理の設定
        startBtn.setOnClickListener(view -> {
            // メイン画面へ遷移
            startActivity(new Intent(IntroActivity.this, MainActivity.class));
        });
    }
}
