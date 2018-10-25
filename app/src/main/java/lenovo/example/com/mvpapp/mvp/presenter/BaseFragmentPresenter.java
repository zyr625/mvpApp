package lenovo.example.com.mvpapp.mvp.presenter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lenovo.example.com.mvpapp.mvp.view.AppCreateIml;

/**
 * author：shashe
 * 日期：2018/10/9
 */
public abstract class BaseFragmentPresenter<T extends AppCreateIml> extends Fragment{
    private T appCreate;

    public abstract Class<T> getAppCreateClass();

    public BaseFragmentPresenter() {
        try {
            appCreate = getAppCreateClass().newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        appCreate.create(inflater,container,savedInstanceState);
        return appCreate.getRootView();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        appCreate.initData();
    }
}
