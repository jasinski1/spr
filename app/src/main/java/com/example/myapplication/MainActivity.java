package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class MainActivity extends AppCompatActivity {
    EditText editText;
    SeekBar seekBar;
    CheckBox checkBox;
    RadioButton radioButton;
    RadioButton radioButton1;
    Spinner spinner;
    EditText editText1;
    Button button;
    TextView textView1;
    TextView textView2;




                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        EdgeToEdge.enable(this);
                        setContentView(R.layout.activity_main);
                        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                            return insets;
                        });
                        editText  = findViewById(R.id.editTextText);
                        seekBar = findViewById(R.id.seekBar);
                        checkBox = findViewById(R.id.checkBox);
                        spinner = findViewById(R.id.spinner);
                        editText1 = findViewById(R.id.editTextNumber);
                        button = findViewById(R.id.button);
                        radioButton =findViewById(R.id.radioButton);
                        radioButton1 = findViewById(R.id.radioButton2);
                        textView1 = findViewById(R.id.textView7);
                        textView2 = findViewById(R.id.textView8);
                        TextView textViewseekbar = findViewById(R.id.textView4);
                        seekBar.setOnSeekBarChangeListener(
                                new SeekBar.OnSeekBarChangeListener() {
                                    @Override
                                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                                        textViewseekbar.setText(i + "");
                                    }
                                    @Override
                                    public void onStartTrackingTouch(SeekBar seekBar) {
                                    }
                                    @Override
                                    public void onStopTrackingTouch(SeekBar seekBar) {
                                    }
                                }
                        );
                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String druzyna1 = editText.getText().toString();

                                        String druzyna2 = spinner.getSelectedItem().toString();
                                        textView1.setText( druzyna1 + ":" + druzyna2);
                                        if(checkBox.isChecked()){
                                            textView1.setText("0:3");
                                        }else {
                                        textView2.setText("3:0");

                                        }else{
                                            int liczbapunktowdr1 = seekBar.getProgress();
                                            int liczbapunktowdr2 =Integer.parseInt( editText.getText().toString());
                                            textView1.setText((liczbapunktowdr1 + ":" + liczbapunktowdr2));
                                        }
                                    }
                                }
                        );

                    }
                }
