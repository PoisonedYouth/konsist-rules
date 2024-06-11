package com.poisonedyouth.konsist.rules

import com.lemonappdev.konsist.api.container.KoScope
import com.lemonappdev.konsist.api.ext.list.withAnnotationOf
import com.lemonappdev.konsist.api.verify.assertTrue
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RestController

object SpringNamingRules {

    fun KoScope.verifyRepositoryNamingConvention() {
        this.interfaces()
            .withAnnotationOf(Repository::class)
            .assertTrue {
                it.name.endsWith("Repository")
            }
    }

    fun KoScope.verifyControllerNamingConvention() {
        this.interfaces()
            .withAnnotationOf(RestController::class)
            .assertTrue {
                it.name.endsWith("Controller")
            }
    }
}
