package seb43_pre_030.DevHelp.domain.utils;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class UriUtil {
    public static URI createUri(String defaultUrl, long resourceId) {
        return UriComponentsBuilder.newInstance()
                   .path(defaultUrl + "/{resource-id}")
                   .buildAndExpand(resourceId)
                   .toUri();
    }
}
