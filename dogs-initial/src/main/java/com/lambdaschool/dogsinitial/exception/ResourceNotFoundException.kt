package com.lambdaschool.dogsinitial.exception

import java.lang.RuntimeException

class ResourceNotFoundException: RuntimeException {
    companion object {
        private val serialVersion = 1L
    }
    constructor(message: String): super(message)

    constructor(message: String, cause: Throwable): super(message, cause)
}