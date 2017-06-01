package a.getdata.Controller;

import android.util.Log;

import java.util.List;

import a.getdata.Api.ApiEndpoint;
import a.getdata.DTO.User;
import a.getdata.Services.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jonathan-S on 6/1/2017.
 */

public class HandleReq {
    private ApiEndpoint api;

    public void getAllUser(){
        api = RetrofitService.createService(ApiEndpoint.class);
        Call<List<User>> call = api.getAllUser();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()){
                    Log.v("asd",response.body().toString());
                }else{
                    Log.v("asd","failed");
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.v("asd",t.getMessage());
            }
        });
    }

}
