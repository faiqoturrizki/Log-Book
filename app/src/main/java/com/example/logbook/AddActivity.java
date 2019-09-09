package com.example.logbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AddActivity extends AppCompatActivity {
    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private EditText ettanggalmulai, ettanggalselesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        ettanggalmulai = (EditText) findViewById(R.id.tanggalmulai);
        ettanggalselesai = (EditText) findViewById(R.id.tanggalselesai);

        ettanggalmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog(ettanggalmulai);
            }
        });

        ettanggalselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog(ettanggalselesai);
            }
        });
    }
    private void showDateDialog(final EditText editText){
        Calendar newCalendar = Calendar.getInstance();

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfmonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfmonth);

                editText.setText(dateFormatter.format(newDate.getTime()));
            }
        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH),newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
        }
    }

