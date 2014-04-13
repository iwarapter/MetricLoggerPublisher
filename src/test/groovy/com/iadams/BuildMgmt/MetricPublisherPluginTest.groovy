package com.iadams.BuildMgmt

import spock.lang.Specification
import org.gradle.api.*
import org.gradle.testfixtures.ProjectBuilder

/**
 * Created by Iain Adams on 13/04/2014.
 */
class MetricPublisherPluginTest extends Specification{
    Project project

    def setup(){
        project = ProjectBuilder.builder().build()
    }

    def "Apply plugin to project"() {
        when: "I apply the plugin to the project"
            project.apply plugin: 'MetricPublisher'

        then: "I have the plugin added"
            project.plugins.hasPlugin(MetricPublisher)
    }
}
