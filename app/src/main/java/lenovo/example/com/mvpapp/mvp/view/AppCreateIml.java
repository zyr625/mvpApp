package lenovo.example.com.mvpapp.mvp.view;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * author：shashe
 * 日期：2018/10/9
 */
public abstract class AppCreateIml implements Icontract.IAppCreate{
    private View Rootview;
    @Override
    public void initData() {

    }

    @Override
    public View getRootView() {
        return Rootview;
    }

    @Override
    public void create(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Rootview = inflater.inflate(getLayoutId(), viewGroup, false);
    }

    public abstract int getLayoutId();

    private SparseArray<View> views=new SparseArray<>();

    public <T extends View> T get(int id){
        T view= (T) views.get(id);
        if (view==null){
            view=Rootview.findViewById(id);
            views.put(id,view);
        }
        return view;
    }

    public void setClick(View.OnClickListener listener,int... ids){
        if (ids==null){
            return;
        }
        for (int id:ids){
            get(id).setOnClickListener(listener);
        }
    }
}