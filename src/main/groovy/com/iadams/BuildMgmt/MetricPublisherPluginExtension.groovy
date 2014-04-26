package com.iadams.BuildMgmt

/**
 * Created by Iain Adams on 13/04/2014.
 */
class MetricPublisherPluginExtension {
    String url = 'http://localhost:8080/MetricLogger/'

    MetricPublisherPluginContextExtension nested = new MetricPublisherPluginContextExtension()

    File logFile
}

class MetricPublisherPluginContextExtension {
    String user = 'api/Users'
    String machine = 'api/Machines'
    String build = 'api/Builds'
    String project = 'api/Projects'
    String log = 'api/Logfiles'
    String java = 'api/JavaInstalls'
}