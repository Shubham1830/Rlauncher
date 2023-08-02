package com.example.rlauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView imageView = findViewById(R.id.imageView4);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String packageName ="com.example.music";
//                if (isAppInstalled(packageName)) {
//                    // If the app is installed, create an explicit Intent to launch the app
//                    Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
//                    if (launchIntent != null) {
//                        startActivity(launchIntent);
//                    }
//                } else {
//                    // If the app is not installed, open the app's page on the Play Store
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName)));
//                }
//            }
//        });
//    }


//    private boolean isAppInstalled(String packageName) {
//        try {
//            getPackageManager().getPackageInfo(packageName, 0);
//            return true;
//        } catch (PackageManager.NameNotFoundException e) {
//            return false;
//        }
//    }
    }
}