package com.lambdaschool.dogsinitial.model

import com.lambdaschool.dogsinitial.exception.ValidationError
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

data class ErrorDetail(var title: String, var status: Int, var detail: String,
                       var developerMessage: String, var errors: HashMap<String, List<ValidationError>> = HashMap()) {
    var timestamp: String = "default value"
    set(value) {
        field = SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z").format(Date(value))
    }
}