package app.ify.thenewsapp.screens

import androidx.compose.runtime.Composable
import app.ify.thenewsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel){
   // no need for observeAsState, we're not using Livedata
    // we're using MutableStateOf

    // Any change in 'post' state var, it'll trigger an
    // automatic recomposition to this 'postscreen' composable
    val posts = viewModel.posts
    PostList(posts = posts)
}