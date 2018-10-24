package org.sample;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {

    public abstract String name();
}
