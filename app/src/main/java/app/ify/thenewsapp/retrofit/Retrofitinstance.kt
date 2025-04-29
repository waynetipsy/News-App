package app.ify.thenewsapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//3rd Step for Retrofit

object Retrofitinstance {

    //Base Url
    private val BASE_URL =
        "https://jsonplaceholder.typicode.com/"

    val api: ApiService by lazy {
        // by lazy: delays the initialization
        // of the property until it is first accessed

        val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
             retrofit.create(ApiService::class.java)

    }
}