package com.example.controlswitch;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView backgroundImage;
    private Switch switchBackground;
    private int[] backgrounds = { R.drawable.bg1, R.drawable.bg2, R.drawable.bg3 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ view
        backgroundImage = findViewById(R.id.backgroundImage);
        switchBackground = findViewById(R.id.switchBackground);

        // Xử lý sự kiện khi bật/tắt switch
        switchBackground.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                changeBackground(); // Gọi hàm đổi hình nền
            }
        });
    }

    // Hàm đổi hình nền ngẫu nhiên
    private void changeBackground() {
        Random random = new Random();
        int randomIndex = random.nextInt(backgrounds.length);
        backgroundImage.setImageResource(backgrounds[randomIndex]);
    }
}