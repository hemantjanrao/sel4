package com.sel.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.FIRST)
@Config.Sources({"classpath:general.properties"})
public interface Configuration extends Config {

    @Key("url.base")
    String url();
}
