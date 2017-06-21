package lab.aikibo;

import lab.aikibo.etc.Greet;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

/**
 * Created by tamami on 15/06/17.
 */
public class TestOauth2 {

    @Test
    public void testOAuthService() {
        ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();
        resource.setUsername("tamami");
        resource.setPassword("rahasia");
        resource.setAccessTokenUri("http://localhost:8080/oauth/token");
        resource.setClientId("trustedclient");
        resource.setClientSecret("trustedclient123");
        resource.setGrantType("password");

        DefaultOAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();
        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resource,  clientContext);

        Greet greet = restTemplate.getForObject("http://localhost:8080/", Greet.class);

        Assert.assertEquals("Hi, selamat datang", greet.getMessage());
    }

}
