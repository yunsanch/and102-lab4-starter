package com.codepath.articlesearch

import android.app.Application

class ArticleApplication : Application() {
    val db by lazy { AppDB.getInstance(this)}
}