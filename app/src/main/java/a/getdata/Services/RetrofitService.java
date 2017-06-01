package a.getdata.Services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jonathan-S on 6/1/2017.
 */

public class RetrofitService {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private Retrofit retrofit;

    public Retrofit start(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
