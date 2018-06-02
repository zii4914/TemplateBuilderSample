package com.zii.templatebuilder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView mTvLog;

  public static void start(Context context) {
    Intent starter = new Intent(context, MainActivity.class);
    context.startActivity(starter);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mTvLog = findViewById(R.id.tv_log);
  }

  public void onTestAbc(View view) {

  }

  private void log(String log) {
    StringBuilder sb = new StringBuilder();
    String s = mTvLog.getText().toString();
    sb.append(s).append("\n").append(log);
    mTvLog.setText(sb.toString());
  }
}
