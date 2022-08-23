package io.tososomaru.intellij.integration.bitbucket.config

import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.dsl.builder.panel

class BitbucketSettingsConfigurable internal constructor(private val project: Project)
    : BoundConfigurable("Bitbucket Integration", "settings.bitbucket") {
    override fun createPanel(): DialogPanel {
        return panel {
            row {

            }.resizableRow()
        }
    }
}