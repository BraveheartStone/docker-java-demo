package com.docker.java.demo.health;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

/**
 * health check
 *
 * @author Evan
 * @version V1.0
 * @since 2025-12-08
 */
@Slf4j
@RestController
public class HealthController {

    @Resource
    private MessageSource messageSource;

    @GetMapping("/health")
    public String health() {
        log.info("health check");
        return "success";
    }

    @GetMapping("/hello")
    public String hello() {
        Locale locale = LocaleContextHolder.getLocale();
        log.info("hello");
        return messageSource.getMessage("hello", null, locale);
    }

}
