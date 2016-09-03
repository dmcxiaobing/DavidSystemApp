package davidsystemapp.qq986945193.com.davidsystemapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ：程序员小冰
 * @GitHub: https://github.com/QQ986945193
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @交流Qq ：986945193
 */

public class MainActivity extends AppCompatActivity {
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT);
    }


    /**
     * 双击两次退出程序提示  第一种方式
     */
   /* boolean isState = true;//设置双击退出的变量

    public void onBackPressed() {
        if (isState) { //isState初始值为true
            isState = false;
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    isState = true;
                }
            }, 2000);
        } else {
            finish();
        }
    }*/

    /**
     * 双击两次退出程序提示  第二种方式
     */

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            quitToast();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void quitToast() {
        if (null == toast.getView().getParent()) {
            toast.show();
        } else {
            finish();
//            System.exit(0);
        }
    }

    /**
     * 双击两次退出程序提示  第三种方式
     * <p/>
     * https://github.com/QQ986945193
     */
    // 1.on..2.开发者实现 3.系统调用
    // 条件 :点击物理键盘或者软件盘
    // int keyCode按键编号
  /*  long[] times = new long[2];

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // ①　找出回调函数
            // ②　点击时间 time1 time2
            // ③　时间 间隔 <2000 退出
            // ④　提示再点一次
            times[0] = times[1];
            times[1] = System.currentTimeMillis();
            if (times[1] - times[0] < 2000) {
                finish();
            } else {
                Toast.makeText(getBaseContext(), "再点一次退出", Toast.LENGTH_SHORT).show();
            }
            return true;// 消费事件
        }

        return super.onKeyDown(keyCode, event);
    }*/

}
