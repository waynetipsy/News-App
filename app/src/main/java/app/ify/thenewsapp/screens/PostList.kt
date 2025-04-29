package app.ify.thenewsapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import app.ify.thenewsapp.retrofit.Post

@Composable
fun PostList(posts: List<Post>){
    LazyColumn {
        items (posts){
            post -> PostItem(post = post)
        }
    }

}