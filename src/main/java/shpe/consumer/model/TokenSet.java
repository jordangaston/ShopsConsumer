package shpe.consumer.model;

import lombok.EqualsAndHashCode;
import shpe.consumer.model.StubHubApiToken;

import java.io.Serializable;

/**
 * Created by jordan on 8/19/17.
 */
@EqualsAndHashCode
public final class TokenSet implements Serializable {

    private final StubHubApiToken accessToken;
    private final StubHubApiToken refreshToken;

    public TokenSet(StubHubApiToken accessToken, StubHubApiToken refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public StubHubApiToken getAccessToken() {
        return accessToken;
    }

    public StubHubApiToken getRefreshToken() {
        return refreshToken;
    }
}
