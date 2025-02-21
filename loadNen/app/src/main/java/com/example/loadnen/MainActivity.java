package com.example.loadnen;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy ImageView từ layout
        ImageView backgroundImage = findViewById(R.id.backgroundImage);

        // Danh sách hình nền
        int[] backgrounds = {
                R.drawable.bg1,
                R.drawable.bg2,
                R.drawable.bg3
        };

        // Chọn ngẫu nhiên một hình nền
        Random random = new Random();
        int randomIndex = random.nextInt(backgrounds.length);
        int randomBackground = backgrounds[randomIndex];

        // Gán hình nền
        backgroundImage.setImageResource(randomBackground);
    }
}