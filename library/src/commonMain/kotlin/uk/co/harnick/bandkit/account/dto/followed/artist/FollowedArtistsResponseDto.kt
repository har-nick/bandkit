package uk.co.harnick.bandkit.account.dto.followed.artist

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public class FollowedArtistsResponseDto private constructor(
    // NOTE:    sic.
    @SerialName("followeers")
    public val followers: List<FollowedArtistDto>,

    @SerialName("more_available")
    public val moreFollowersAvailable: Boolean,

    @SerialName("last_token")
    public val paginationToken: String
)