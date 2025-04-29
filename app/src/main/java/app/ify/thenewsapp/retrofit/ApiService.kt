package app.ify.thenewsapp.retrofit

import retrofit2.http.GET


//2nd Step using Retrofit

interface ApiService {

    //Define the end-Points
    @GET("posts")
    suspend fun getPosts(): List<Post>
}