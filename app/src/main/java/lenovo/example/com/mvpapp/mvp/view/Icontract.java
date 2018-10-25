package lenovo.example.com.mvpapp.mvp.view;

import android.content.Context;

/**
 * author：shashe
 * 日期：2018/10/9
 * 契约类
 */
public interface Icontract {
    interface IAppCreate extends AppCreate{

        Context getContext();
    }
}
