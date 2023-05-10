package Config;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Collections;

@Component
public class UserAuthenticationManager implements AuthenticationManager {

    @Value("$spring-user-token")
    public String tokenvalue;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if(null == authentication){
            throw new PreAuthenticatedCredentialsNotFoundException("Authentication is not present");
        }

        System.out.println(tokenvalue);
        String Principle= authentication.getPrincipal().toString();
        System.out.println(Principle);
        System.out.println(base64Decode(Principle));
        if (tokenvalue.equals(Principle) || tokenvalue.equals(base64Decode(Principle))){
            return new PreAuthenticatedAuthenticationToken(Principle, Principle, Collections.emptyList());
        }
        throw new PreAuthenticatedCredentialsNotFoundException(" Invalid Authentication Token");
    }

    public String base64Decode(String Principle){
        try {
            return new String(Base64.getDecoder().decode(Principle));
        }catch (IllegalArgumentException e){
            return Principle;
        }
    }
}
