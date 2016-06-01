package com.tcm.tanhuang.tcm3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ContentActivity extends AppCompatActivity {

    TextView m_textview;

    private static final String ACTIVITY_TAG="TCM ContentActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_content);
        // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.titlebtn);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        m_textview = (TextView) findViewById(R.id.textView_Content);
        Intent i = getIntent();
        String strTitle = i.getStringExtra("Title");
        Log.i(ACTIVITY_TAG,strTitle);
        String strContent;
        switch (strTitle)
        {
            case "YaoXinGe":
                strContent = getString(R.string.YaoXinGe);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setTextSize(20);
                m_textview.setGravity(Gravity.LEFT);
                break;
            case "ShiBaFan":
                strContent = getString(R.string.ShiBaFan);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.CENTER);
                m_textview.setTextSize(20);
                break;
            case "Pinhumaixue":
                strContent = getString(R.string.Pinhumaixue);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(18);
                break;
            case "RenChenJinJi":
                strContent = getString(R.string.RenChenJinJi);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.CENTER);
                m_textview.setTextSize(20);
                break;

            case "Shimian":
                strContent = getString(R.string.Shimian);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;
            case "Kesou":
                strContent = getString(R.string.Kesou);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;
            case "Bianmi":
                strContent = getString(R.string.Bianmi);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;
            case "Xiexie":
                strContent = getString(R.string.Xiexie);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;
            case "Toutong":
                strContent = getString(R.string.Toutong);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;
            case "Xuanyun":
                strContent = getString(R.string.Xuanyun);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;
            case "Weiwantong":
                strContent = getString(R.string.Weiwantong);
                strContent = ToDBC(strContent);
                strContent = StringFilter(strContent);
                m_textview.setText(strContent);
                m_textview.setGravity(Gravity.LEFT);
                m_textview.setTextSize(16);
                break;

            default:break;
        }
    }

    public static String ToDBC(String input) {
        char[] c = input.toCharArray();
        for (int i = 0; i< c.length; i++) {
            if (c[i] == 12288) {
                c[i] = (char) 32;
                continue;
            }if (c[i]> 65280&& c[i]< 65375)
                c[i] = (char) (c[i] - 65248);
        }
        return new String(c);
    }

    // 替换、过滤特殊字符
    public static String StringFilter(String str) throws PatternSyntaxException {
        str=str.replaceAll("【","[").replaceAll("】","]").replaceAll("！","!");//替换中文标号
        String regEx="[『』]"; // 清除掉特殊字符
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
