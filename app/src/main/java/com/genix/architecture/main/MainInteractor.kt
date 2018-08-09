package com.genix.architecture.main

import com.genix.architecture.vo.Post

interface MainInteractor {

    interface OnFinishedListener {
        fun onFinishLoadView(posts: ArrayList<Post>)
    }

    fun onLoadView(onFinishedListener: OnFinishedListener)

}