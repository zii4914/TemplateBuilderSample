//package ${packageName};
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.TextView;
//import com.zii.templatebuilder.R;
//
//public class ${activity_name}Activity extends BaseActivity {
//
//  private TextView mTvLog;
//
//  public static void start(Context context) {
//    Intent starter = new Intent(context, ${activity_name}Activity.class);
//    context.startActivity(starter);
//  }
//
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_${layout_name});
//    mTvLog = findViewById(R.id.tv_log);
//  }
//
//  public void on${first}(View view) {
//
//  }
//
//  private void log(String log) {
//    StringBuilder sb = new StringBuilder();
//    String s = mTvLog.getText().toString();
//    sb.append(s).append("\n").append(log);
//    mTvLog.setText(sb.toString());
//  }
//}
