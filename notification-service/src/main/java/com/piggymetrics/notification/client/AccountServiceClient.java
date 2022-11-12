package com.piggymetrics.notification.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "account-service", fallback=AccountServiceClientFallback.class)
public interface AccountServiceClient {

	@RequestMapping(method = RequestMethod.GET, value = "/accounts/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	String getAccount(@PathVariable("id") Long id);

}
