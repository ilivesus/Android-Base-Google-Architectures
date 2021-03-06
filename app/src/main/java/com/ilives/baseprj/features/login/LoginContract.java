package com.ilives.baseprj.features.login;

import com.ilives.baseprj.common.base.BaseActivityContract;
import com.ilives.baseprj.common.models.Error;
import com.ilives.baseprj.common.models.User;
import com.ilives.baseprj.common.models.api_response.ApiResponse;
import com.ilives.baseprj.features.login.models.LoginData;

import io.reactivex.Observable;
import retrofit2.Response;

/**
 * -------------^_^-------------
 * ❖ com.ilives.baseprj.features.login
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/30/18
 * ❖ Time: 18:24
 * -------------^_^-------------
 **/
public class LoginContract {
    public interface View extends BaseActivityContract.View {
        void authenticated();
        void unAuthenticated(String msg);
    }

    public interface Presenter extends BaseActivityContract.Presenter<View> {
        void doAuthenticate(String email, String password, int type);
    }

    public interface Interactor extends  BaseActivityContract.Interactor {
        Observable<Response<LoginData>> authenticateUser(String email, String password, int type);

        Observable<ApiResponse<User>> getUserProfile();
    }
}
