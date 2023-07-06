package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    Spinner spUnit;
    Spinner spCT;
    Spinner spApplyFrom;
    Spinner spResult;
    Spinner spTTraThuong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList = findViewById(R.id.rvList);
        spUnit = findViewById(R.id.spUnit);
        spCT = findViewById(R.id.spCT);
        spApplyFrom = findViewById(R.id.spApplyFrom);
        spResult = findViewById(R.id.spResult);
        spTTraThuong = findViewById(R.id.spTTTraThuong);

        ListAdapter adapter = new ListAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(linearLayoutManager);
        rvList.setAdapter(adapter);


        String[] unit = {"040002 - Phú Vĩnh Anh - Hà Nội", "040002 - Phú Vĩnh Anh - Hà Nội",
                "040002 - Phú Vĩnh Anh - Hà Nội"};

        ArrayAdapter adUnit
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                unit);

        adUnit.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        String[] ct = {"040002 - KM CLDH T02/2023 NHÓM 4", "040002 - KM CLDH T02/2023 NHÓM 4",
                "040002 - KM CLDH T02/2023 NHÓM 4"};

        ArrayAdapter adCt
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                ct);

        adCt.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        String[] result = {"Đạt", "Không đạt"};

        ArrayAdapter adResult
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                result);

        adResult.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        String[] ttTraThuong = {"Đạt", "Không đạt"};

        ArrayAdapter adTTTraThuong
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                ttTraThuong);

        adTTTraThuong.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        String[] applyFrom = {"01/01/2022 - 30/03/2023", "01/01/2022 - 30/03/2023"};

        ArrayAdapter adApplyFrom
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                applyFrom);

        adApplyFrom.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);


        spCT.setAdapter(adCt);

        spTTraThuong.setAdapter(adTTTraThuong);
        spUnit.setAdapter(adUnit);
        spResult.setAdapter(adResult);
        spApplyFrom.setAdapter(adApplyFrom);

    }
}