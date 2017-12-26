package com.codegym.uichatkitdemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMesseage;
    private ImageView btnSendMsg;
    private EditText edtChatBox;
    private MesseageAdapter mMesseageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMesseage = findViewById(R.id.rvMesseage);
        edtChatBox = findViewById(R.id.edtChatBox);
        rvMesseage.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));
        mMesseageAdapter = new MesseageAdapter(this);
        rvMesseage.setAdapter(mMesseageAdapter);
        btnSendMsg = findViewById(R.id.btnSendMsg);
        btnSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(edtChatBox.getText())) {
                    final MesseageEntity messeageEntity = new MesseageEntity();
                    messeageEntity.setContent(edtChatBox.getText().toString());
                    mMesseageAdapter.addMesseage(messeageEntity);
                    edtChatBox.setText("");
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            MesseageEntity messeageEntityIn = new MesseageEntity();
                            messeageEntityIn.setId(1);
                            messeageEntityIn.setContent(messeageEntity.getContent());
                            mMesseageAdapter.addMesseage(messeageEntityIn);
                        }
                    },1000);
                }
            }
        });
    }
}
