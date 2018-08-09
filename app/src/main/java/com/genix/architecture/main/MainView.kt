package com.genix.architecture.main

import com.genix.architecture.vo.Post

interface MainView {

    fun loadView(posts: ArrayList<Post>)
}