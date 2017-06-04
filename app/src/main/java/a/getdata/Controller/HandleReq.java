package a.getdata.Controller;

import android.util.Log;

import java.util.List;

import a.getdata.Adapter.ListAdapter;
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

    public void getAllUser(final ListAdapter adapter){
        api = RetrofitService.createService(ApiEndpoint.class);
        Call<List<User>> call = api.getAllUser();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()){
                    adapter.setUsers(response.body());
                    adapter.notifyDataSetChanged();
                    Log.v("asd",response.body().get(1).getPhotoUrl().toString());
                }else{
                    Log.v("asd",response.message());
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.v("asd",t.getMessage());
            }
        });
    }

}
