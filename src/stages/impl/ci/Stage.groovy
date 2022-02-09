#!/usr/bin/env groovy

package stages.impl.ci

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Stage {
    String name()

    String[] buildTool()

    ProjectType[] type()
}