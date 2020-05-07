package xyz.staffjoy.faraday.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import xyz.staffjoy.common.aop.SentryClientAspect

/**
 * Use this common config for Web App
 */
@Configuration
@Import(value = [StaffjoyConfig::class, SentryClientAspect::class])
open class StaffjoyWebConfig