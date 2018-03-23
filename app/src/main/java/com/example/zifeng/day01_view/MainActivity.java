package com.example.zifeng.day01_view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ZiFeng on 2018/3/23.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 创建一个线性布局控件,指定布局得走向为垂直
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        // 创建一个本地得文本控件，设置它的显示内容，颜色，大小
        final TextView textView = new TextView(this);
        textView.setText(R.string.text);
        textView.setTextColor(Color.RED);
        textView.setTextSize(30);
        // 创建一个按钮控件，设置它显示得内容
        Button button = new Button(this);
        button.setText(R.string.button);
        // 设置botton的宽度和高度为刚好包含住内容大小
        button.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        // 向ll布局中添加textView，button控件
        ll.addView(textView);
        ll.addView(button);
        // 为Activity绑定布局ll
        setContentView(ll);
        // 为button绑定一个监听器并且设置点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 改变textView内容
                textView.setText( "" + new java.util.Date());
            }
        });
    }
}
