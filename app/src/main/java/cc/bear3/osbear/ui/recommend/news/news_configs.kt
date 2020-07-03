package cc.bear3.osbear.ui.recommend.news

/**
 *
 *
 * @author TT
 * @since 2020-7-3
 */
internal enum class NewsCategory(val category: Int) {
    All(1),         // 全部
    Service(2),     // 综合新闻
    SoftWare(3)     // 软件更新

}

internal enum class NewsType {
    Link,           // 连接新闻
    Software,       // 软件推荐
    Post,           // 讨论区帖子
    Blog,           // 博客
    News,           // 普通新闻
    Translation     // 翻译文章
}