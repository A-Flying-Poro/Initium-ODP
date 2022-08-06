package com.universeprojects.gefcommon.shared.elements;

public interface Idea {
    Long getId();

    String getName();

    String getDescription();

    String getIcon();

    Long getBaseTimeToRunSecs();

    SkillType getSkillType();

    Long getParentCategoryId();

    Boolean getClassUnrelated();
}
