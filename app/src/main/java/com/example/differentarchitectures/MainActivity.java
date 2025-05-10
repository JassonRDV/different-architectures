package com.example.differentarchitectures;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.differentarchitectures.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootLayout = activityMainBinding.getRoot();

        setContentView(rootLayout);

        ViewCompat.setOnApplyWindowInsetsListener(
                rootLayout, (v, windowInsets) ->
                {
                    Insets systemBarsInsets = windowInsets.getInsets(
                            WindowInsetsCompat.Type.systemBars());
                    View toolBarLayout = activityMainBinding.appBarLayout;
                    toolBarLayout.setPadding(
                            systemBarsInsets.left,
                            systemBarsInsets.top,
                            systemBarsInsets.right,
                            0
                    );
                    rootLayout.setPadding(
                            systemBarsInsets.left,
                            0,
                            systemBarsInsets.right,
                            systemBarsInsets.bottom
                    );
                    return WindowInsetsCompat.CONSUMED;
                }
        );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        activityMainBinding = null;
    }
}
