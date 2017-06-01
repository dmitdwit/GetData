package a.getdata.Api;

import java.util.List;

import a.getdata.DTO.User;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jonathan-S on 6/1/2017.
 */

public interface ApiEndpoint {

    @GET("users/")
    Call<List<User>> getAllUser();
}
