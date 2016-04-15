package com.example.shortcuttest;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShortcutManager sm = (ShortcutManager) getSystemService(Context.SHORTCUT_SERVICE);

        Intent intent = new Intent(this, MainActivity.class);
        sm.deleteAllDynamicShortcuts();



        intent = new Intent(this, ConversationActivity.class);
        intent.putExtra("user", "liam");
        ShortcutInfo si;
        si = new ShortcutInfo.Builder(this)
                .setId("liam")
                .setTitle("Laim")
                .setText("Spradlo")
                .setWeight(3)
                .setIcon(Icon.createWithResource(this, R.mipmap.ic_liam))
                .setIntent(intent)
                .build();
        sm.addDynamicShortcut(si);

        intent.putExtra("user", "kevin");
        si = new ShortcutInfo.Builder(this)
                .setId("kevin")
                .setTitle("Kaven")
                .setText("Brary")
                .setWeight(2)
                .setIcon(Icon.createWithResource(this, R.mipmap.ic_kevin))
                .setIntent(intent)
                .build();
        sm.addDynamicShortcut(si);

        intent.putExtra("user", "cliff");
        si = new ShortcutInfo.Builder(this)
                .setId("cliff")
                .setTitle("Claff")
                .setText("Werd")
                .setWeight(1)
                .setIcon(Icon.createWithResource(this, R.mipmap.ic_cliff))
                .setIntent(intent)
                .build();
        sm.addDynamicShortcut(si);



    }
}
