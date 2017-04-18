package com.example.jc321013.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private TextView amountText;
    private EditText userInput;
    private TextView percentageText;
    private SeekBar percentageBar;
    private TextView tipText;
    private TextView totalText;

    private NumberFormat percentageFormatter = NumberFormat.getPercentInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountText = (TextView) findViewById(R.id.amountText);
        userInput = (EditText) findViewById(R.id.userInput);
        percentageText = (TextView) findViewById(R.id.percentageText);
        percentageBar = (SeekBar) findViewById(R.id.percentagebar);
        tipText = (TextView) findViewById(R.id.tipText);
        totalText = (TextView) findViewById(R.id.totalText);

        percentageBar.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        percentageText.setText(percentageFormatter.format(progress));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
