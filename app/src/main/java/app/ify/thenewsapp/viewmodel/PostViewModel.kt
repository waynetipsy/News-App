package app.ify.thenewsapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.ify.thenewsapp.repository.PostRepository
import app.ify.thenewsapp.retrofit.Post
import kotlinx.coroutines.launch

class PostViewModel: ViewModel(){

    private val repository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())
       private set

    init {
        viewModelScope.launch {
            // Fetching Data
            val fetchedPosts = repository.getPosts()

            // Updating the State
            // any update to posts will trigger
            // a recomposition of the Composable that read this state
            posts = fetchedPosts
        }
    }
}