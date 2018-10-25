package lenovo.example.com.mvpapp.mvp.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import lenovo.example.com.mvpapp.mvp.view.AppCreateIml;

/**
 * author：shashe
 * 日期：2018/10/9
 */
public abstract class BaseActivityPresenter<T extends AppCreateIml> extends AppCompatActivity {

    private T appCreate;

    public abstract Class<T> getAppCreateClass();

    public BaseActivityPresenter() {
        try {
            appCreate = getAppCreateClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appCreate.create(getLayoutInflater(), null, savedInstanceState);
        setContentView(appCreate.getRootView());

        appCreate.initData();
    }
}
