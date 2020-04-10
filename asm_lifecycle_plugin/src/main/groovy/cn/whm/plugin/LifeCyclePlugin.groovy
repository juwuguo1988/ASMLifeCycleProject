package cn.whm.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class LifeCyclePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        System.out.println("执行了onCreate")
        def android  = project.extensions.getByType(AppExtension)
        println("-----------registering LifeCycleTransform--------------------")
        LifeCycleTransform lifeCycleTransform = new LifeCycleTransform();
        android.registerTransform(lifeCycleTransform)
    }
}

