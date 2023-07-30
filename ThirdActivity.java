package com.example.carapp;// ReviewActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        Button btnWriteReview = findViewById(R.id.btnWriteReview);
        btnWriteReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 리뷰 작성 버튼 클릭 이벤트 처리
                writeReview();
            }
        });
    }

    private void writeReview() {
        // 여기서 리뷰 작성 로직을 구현
        // 리뷰 내용과 평가점수를 저장하고 처리하는 등의 작업을 수행할 수 있습니다.
        // 예시로 간단히 토스트 메시지를 띄워 보여줍니다.
        Toast.makeText(this, "리뷰가 작성되었습니다!", Toast.LENGTH_SHORT).show();
        finish(); // 리뷰 작성 후 이용후기 작성 페이지 종료 (메인 페이지로 돌아감)
    }
}
