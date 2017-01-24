package ykk.broadcasttest.com.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell-home on 2017/1/24.
 */
//用于管理所有的活动
public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<Activity>();
    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }

    public static  void removeActivity(Activity activity)
    {
        activities.remove(activity);
    }
    public static  void finishAll()
    {
        for(Activity activity:activities)
        {
            //判断当y前的activity是否被干掉
            if(!activity.isFinishing())
            {
                activity.finish();
            }
        }
    }
}
