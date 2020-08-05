package org.irmantas.tabTwo.config;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;

@Configuration
public class SqlConfig  extends AbstractR2dbcConfiguration {

    @Override
    @Bean
    public ConnectionFactory connectionFactory() {
        return ConnectionFactories.get(
                "r2dbcs:mysql://root:root@127.0.0.1:3306/r2dbc?" +
                        "zeroDate=use_round&" +
                        "useSSl=false");
    }
}
