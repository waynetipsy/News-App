package app.ify.thenewsapp.repository


import app.ify.thenewsapp.retrofit.Retrofitinstance
import app.ify.thenewsapp.retrofit.Post

//4th step using Retrofit

class PostRepository {

    // Repository: Acts a mediator between
    // the data source(network API) & the viewmodel

    private val apiService = Retrofitinstance.api

    suspend fun getPosts(): List<Post>{
       return apiService.getPosts()
    }
}