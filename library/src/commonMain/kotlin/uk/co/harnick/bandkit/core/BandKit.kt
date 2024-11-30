package uk.co.harnick.bandkit.core

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.plugin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

public class BandKit(internal val client: HttpClient) {
    internal val scope = CoroutineScope(Dispatchers.Main)

    public companion object {
        public const val BASE_URL: String = "https://bandcamp.com"
    }

    public object Account {
        public const val FOLLOWERS: String = "$BASE_URL/api/fancollection/1/followers"
        public const val FOLLOWING_USERS: String = "$BASE_URL/api/fancollection/1/following_fans"
        public const val FOLLOWING_ARTISTS: String = "$BASE_URL/api/fancollection/1/following_bands"
    }

    public object Library {
        public const val SUMMARY: String = "$BASE_URL/api/fan/2/collection_summary"
        public const val ITEMS: String = "$BASE_URL/api/fancollection/1/collection_items"
    }

    init {
        client.plugin(BandKitPlugin)
        client.plugin(ContentNegotiation)
    }
}