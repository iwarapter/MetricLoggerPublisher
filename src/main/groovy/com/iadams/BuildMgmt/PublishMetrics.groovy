package com.iadams.BuildMgmt

import org.gradle.BuildAdapter
import org.gradle.BuildResult

/**
 * Created by Iain on 13/04/2014.
 */
class PublishMetrics extends BuildAdapter {
    void buildFinished(BuildResult result){
        println "FINISHED!"
    }
}
