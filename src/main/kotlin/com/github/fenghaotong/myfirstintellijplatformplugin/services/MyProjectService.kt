package com.github.fenghaotong.myfirstintellijplatformplugin.services

import com.github.fenghaotong.myfirstintellijplatformplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
