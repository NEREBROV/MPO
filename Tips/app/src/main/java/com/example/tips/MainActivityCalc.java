package com.example.tips;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.*;
import android.widget.*;
import java.text.NumberFormat;

public class MainActivityCalc extends AppCompatActivity {

    private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormat = NumberFormat.getPercentInstance();

    private double amount = 0.0; // Сумма счёта
    private double percent = 0.15; // Процент чаевых по умолчанию.
    private EditText et_amount; // Поле для ввода суммы счёта
    private SeekBar sb_percent; // Ползунок для процентов
    private TextView tv_percent; // Поле для значения процента
    private TextView tv_tip; // Поле для суммы чаевых
    private TextView tv_total; // Поле для итоговой суммы
    private TextView tv_nds; // Поле для итоговой суммы
    private TextView Test;
    private TextView textView6;

    private  Calc tipCalc = new Calc();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_activity);
        et_amount = findViewById(R.id.et_amount);
        sb_percent = findViewById(R.id.sb_percent);
        tv_percent = findViewById(R.id.tv_percent);
        tv_tip = findViewById(R.id.tv_tip);
        tv_total = findViewById(R.id.tv_total);
        tv_nds = findViewById(R.id.tv_nds);
        Test = findViewById(R.id.Test);
        textView6 = findViewById(R.id.textView6);
        tv_tip.setText(currencyFormat.format(tipCalc.calculateTip(amount,percent)));
        tv_total.setText(currencyFormat.format(tipCalc.calculateTotal(amount, percent)));
        et_amount.addTextChangedListener(amountTextWatcher);
        sb_percent.setOnSeekBarChangeListener(sbListener);
    }

    private final TextWatcher amountTextWatcher = new TextWatcher() {
        // Вызывается при изменении пользователем величины счета
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            amount = Double.parseDouble(s.toString());
            // Обновление полей с чаевыми и общей суммой
            tv_tip.setText(currencyFormat.format(tipCalc.calculateTip(amount,percent)));
            tv_total.setText(currencyFormat.format(tipCalc.calculateTotal(amount, percent)));
            tv_nds.setText(currencyFormat.format(tipCalc.calculateNDS(amount)));
            Test.setText(currencyFormat.format(tipCalc.calculateTest(amount,percent)));
            textView6.setText(currencyFormat.format(tipCalc.calculateFine(amount, percent)));
        }

        public void afterTextChanged(Editable s) { }
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) { }
    };


    private final SeekBar.OnSeekBarChangeListener sbListener = new SeekBar.OnSeekBarChangeListener() {
        // Обновление процента чаевых и итоговой суммы
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            percent = progress / 100.0; // Назначение процента чаевых
            // Вычисление чаевых и общей суммы. Вывод их на экран.
            tv_percent.setText(percentFormat.format(percent));
            tv_tip.setText(currencyFormat.format(tipCalc.calculateTip(amount,percent)));
            tv_total.setText(currencyFormat.format(tipCalc.calculateTotal(amount, percent)));
            Test.setText(currencyFormat.format(tipCalc.calculateTest(amount,percent)));
            textView6.setText(currencyFormat.format(tipCalc.calculateFine(amount, percent)));
        }
        public void onStartTrackingTouch(SeekBar seekBar) { }
        public void onStopTrackingTouch(SeekBar seekBar) { }
    };

}

