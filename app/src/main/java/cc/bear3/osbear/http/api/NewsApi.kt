package cc.bear3.osbear.http.api

import cc.bear3.osbear.app.PAGE_SIZE_DEFAULT
import cc.bear3.osbear.data.NewsListResponse
import cc.bear3.osbear.ui.recommend.news.NewsCategory
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Description:
 * Author: TT
 * Since: 2020-03-21
 */
interface NewsApi {
    @GET("news_list")
    fun getNewsList(
        @Query("catalog") catalog: Int = NewsCategory.All.category,
        @Query("page") page : Int,
        @Query("pageSize") pageSize : Int = PAGE_SIZE_DEFAULT
    ) : Observable<NewsListResponse>
}