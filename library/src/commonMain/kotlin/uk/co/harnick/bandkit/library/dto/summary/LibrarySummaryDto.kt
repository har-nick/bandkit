package uk.co.harnick.bandkit.library.dto.summary

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public class LibrarySummaryDto internal constructor(
    @SerialName("fan_id")
    public val ownerId: Long,

    @SerialName("username")
    public val ownerUsername: String,

    @SerialName("url")
    public val ownerUrl: String,

    @SerialName("tralbum_lookup")
    public val trLookupAlbums: Map<String, LookupAlbumDto>,

    @SerialName("follows")
    public val follows: FollowsDto?
)
