package com.codepath.articlesearch

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "article_table")
data class ArticleEntity(

    @ColumnInfo(name = "headline") val headline: String?,
    @ColumnInfo(name = "articleAbstract") val articleAbstract: String?,
    @ColumnInfo(name = "byline") val byline: String?,
    @ColumnInfo(name = "mediaImageUrl") val mediaImageUrl: String?,
//    @ColumnInfo(name = "main") val main: String?,
//    @ColumnInfo(name = "original") val original: String?,
    @PrimaryKey(autoGenerate = true) val id: Long= 0
)
