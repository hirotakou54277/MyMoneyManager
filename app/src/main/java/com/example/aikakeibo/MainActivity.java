package com.example.mymoneymanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンのクリックイベント設定
        findViewById(R.id.button_income).setOnClickListener(view -> startActivity(new Intent(this, IncomeActivity.class)));
        findViewById(R.id.button_expense).setOnClickListener(view -> startActivity(new Intent(this, ExpenseActivity.class)));
        findViewById(R.id.button_balance).setOnClickListener(view -> startActivity(new Intent(this, BalanceActivity.class)));
        findViewById(R.id.button_savings).setOnClickListener(view -> startActivity(new Intent(this, SavingsActivity.class)));
        findViewById(R.id.button_ledger).setOnClickListener(view -> startActivity(new Intent(this, LedgerActivity.class)));
        findViewById(R.id.button_prediction).setOnClickListener(view -> startActivity(new Intent(this, PredictionActivity.class)));
    }
}
