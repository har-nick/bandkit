package uk.co.harnick.bandkit.account.dto.followed.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public class FollowedUserDto private constructor(
    @SerialName("fan_id")
    public val fanId: Long,

    @SerialName("band_id")
    public val artistId: Long?,

    // MORE INFO NEEDED:    Unsure how this differs to `trackpipe_url`.
    //                      Seems to be null across all accounts?
    @SerialName("fan_url")
    public val fanUrl: String?,

    @SerialName("image_id")
    public val avatarId: Long,

    @SerialName("trackpipe_url")
    public val userUrl: String,

    @SerialName("name")
    public val displayName: String,

    // MORE INFO NEEDED:    Seems redundant?
    @SerialName("is_following")
    public val userIsFollowing: Boolean,

    @SerialName("location")
    public val location: String?,

    @SerialName("date_followed")
    public val dateFollowed: String,

    @SerialName("token")
    public val paginationToken: String
)