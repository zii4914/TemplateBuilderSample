//package ${packageName};
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.TextView;
//
//public class ${testName}Activity extends AppCompatActivity {
//
//  private TextView mTvLog;
//
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//  super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_${layoutName});
//    mTvLog = findViewById(R.id.tv_log);
//  }
//
//  public void on${testName}(View view) {
//
//  }
//
//  private void log(String log) {
//    StringBuilder sb = new StringBuilder();
//    String s = mTvLog.getText().toString();
//    sb.append(s).append("\n").append(log);
//    mTvLog.setText(sb.toString());
//  }
//
//  public static void start(Context context) {
//    Intent starter = new Intent(context,  ${testName}Activity.class);
//    context.startActivity(starter);
//  }
//}