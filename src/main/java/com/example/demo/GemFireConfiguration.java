package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableLogging;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.config.annotation.EnableSsl;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.geode.config.annotation.EnableDurableClient;
import org.springframework.geode.config.annotation.UseMemberName;

import com.belk.brd.model.BrdModel;

/**
 * This configuration is used when you start this app with !tls spring profile.
 *
 */
@Configuration
@EnableDurableClient(id = "akkTestRegionLoadDataClient")
@EnableEntityDefinedRegions(basePackageClasses = BrdModel.class)
@EnableGemfireRepositories(basePackageClasses = MyRepo.class)
@EnableLogging
@UseMemberName("akkTestRegionLoadDataMember")
@EnablePdx
public class GemFireConfiguration {

	@Profile("tls")
	@Configuration
	@EnableSsl
	static class TlsConfiguration {
	}

}
