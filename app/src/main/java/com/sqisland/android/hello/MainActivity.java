package com.shortcut.doubao;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            // 设置跳转链接
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("doubao://voice"));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            // 如果没安装豆包，防止应用崩溃
            e.printStackTrace();
        }
        
        // 启动目标后立即关闭当前空白 Activity
        finish();
    }
}
