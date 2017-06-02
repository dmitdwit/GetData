package a.getdata.Services;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jonathan-S on 6/1/2017.
 */

public class RetrofitService {

    public static final String BASE_URL = "https://globaldata-a1d39.firebaseio.com/";
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private static OkHttpClient.Builder okHttp = new OkHttpClient.Builder();

    public static <S> S createService(Class<S> serviceClass){
        return retrofit.create(serviceClass);
    }
}
