package io.quarkiverse.operatorsdk.runtime;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class BuildTimeControllerConfiguration {

    /**
     * Whether the controller should only process events if the associated resource generation has
     * increased since last reconciliation, otherwise will process all events.
     */
    @ConfigItem(defaultValue = "true")
    public Optional<Boolean> generationAware;
}
