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

    def "Configure the plugin extensions"() {
        when: "I apply the plugin and configure the properties"
            project.apply plugin: 'MetricPublisher'

            project.MetricPublisher {
                url = "http://myserver:8080/MetricLogger"
            }

        then:
            project.extensions.findByName('MetricPublisher') != null
            project.extensions.MetricPublisher.url == "http://myserver:8080/MetricLogger"
    }
}
