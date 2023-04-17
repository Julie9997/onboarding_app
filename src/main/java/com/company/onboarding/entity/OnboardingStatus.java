package com.company.onboarding.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;

public enum OnboardingStatus implements EnumClass<Integer> {

    NOT_STARTED(10),
    IN_PROGRESS(20),
    COMPLETED(30);

    private Integer id;

    OnboardingStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OnboardingStatus fromId(Integer id) {
        for (OnboardingStatus at : OnboardingStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}