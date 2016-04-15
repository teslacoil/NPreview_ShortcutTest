package com.example.shortcuttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ConversationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        String user = getIntent().getStringExtra("user");

        String userName;
        int iconRes;
        switch (user) {
            case "cliff":
                userName = "Claff";
                iconRes = R.mipmap.ic_cliff;
            break;
            case "liam":
                userName = "Laim";
                iconRes = R.mipmap.ic_liam;
            break;
            case "kevin":
            default:
                userName = "Kaven";
                iconRes = R.mipmap.ic_kevin;
            break;
        }

        getSupportActionBar().setTitle("Conversation with " + userName);

        ((TextView) findViewById(R.id.message)).setCompoundDrawablesWithIntrinsicBounds(iconRes, 0, 0, 0);

    }
}
