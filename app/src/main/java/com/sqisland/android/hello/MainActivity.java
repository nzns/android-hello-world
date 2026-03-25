package com.sqisland.android.hello;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            Intent intent = new Intent();
            // 对应截图里的：包名 和 类名(活动)
            intent.setComponent(new ComponentName("com.larus.nova", "com.larus.home.impl.alias.AliasActivity1"));
            
            // 对应截图里的：Uri Data
            intent.setData(Uri.parse("sslocal://flow/realtime_chat?is_from_outer=true&conversation_id=38418527367140866"));
            
            // 确保每次点击都重新拉起，不留后台
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // 瞬间关闭自身，实现真正的0延迟
        finish();
    }
}
