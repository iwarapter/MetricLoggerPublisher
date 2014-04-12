package com.iadams.buildmgmt

import org.gradle.api.*;
/**
 * Created by Iain on 12/04/2014.
 */
class MetricLoggerPublisher implements Plugin<Project> {
    def void apply(Project project) {
        project.task('example') << {
            println "Example project task"
        }
    }
}
