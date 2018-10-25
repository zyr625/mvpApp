package lenovo.example.com.mvpapp.mvp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * author：shashe
 * 日期：2018/10/9
 */
public interface AppCreate {

    void initData();//初始化方法，联网请求，数据库操作……

    View getRootView();//获取View

    void create(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle);//创建布局


}
