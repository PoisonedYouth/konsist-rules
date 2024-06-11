package com.poisonedyouth.konsist.rules

import com.lemonappdev.konsist.api.container.KoScope
import com.lemonappdev.konsist.api.ext.list.modifierprovider.withDataModifier
import com.lemonappdev.konsist.api.ext.list.properties
import com.lemonappdev.konsist.api.verify.assertTrue

object ImmutabilityRules {

    fun KoScope.verifyDataclassesNotContainMutableVariable(includeNested: Boolean) {
        this.classes()
            .withDataModifier()
            .properties(includeNested = includeNested)
            .assertTrue {
                it.hasValModifier
            }
    }
}