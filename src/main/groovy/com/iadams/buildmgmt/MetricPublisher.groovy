package com.iadams.BuildMgmt

import org.gradle.api.*;
/**
 * Created by Iain on 12/04/2014.
 */
class MetricPublisher implements Plugin<Project> {
    def void apply(Project project) {
        def buildHook = new PublishMetrics()
        project.gradle.addBuildListener(buildHook)
    }
}