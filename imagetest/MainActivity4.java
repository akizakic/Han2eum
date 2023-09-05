package com.example.imagetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private EditText etLicensePlate;
    private Button btnLookup;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        etLicensePlate = findViewById(R.id.etLicensePlate);
        btnLookup = findViewById(R.id.btnLookup);
        tvResult = findViewById(R.id.tvResult);

        btnLookup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 조회 버튼 클릭 시 이용시간 및 요금 계산하여 텍스트뷰에 표시
                lookupVehicleInfo();
            }
        });
    }

    private void lookupVehicleInfo() {
        // 이용시간 및 요금 조회 로직을 구현
        // 차량번호 입력란에서 입력된 번호를 가져와서 이용시간과 요금을 계산하는 등의 작업을 수행합니다.
        // 예시로 간단히 텍스트뷰에 결과를 표시하는 방법을 보여줍니다.
        String licensePlate = etLicensePlate.getText().toString();

        // 이용시간과 요금 계산 예시
        String usageTime = "3시간 30분"; // 조회된 이용시간 결과
        String fare = "10,000원"; // 조회된 요금 결과

        // 조회 결과를 텍스트뷰에 표시
        String resultText = "이용시간: " + usageTime + "\n요금: " + fare;
        tvResult.setText(resultText);
    }
}
