package com.example1.libtest1

import androidx.annotation.Keep

class Sumga {
    companion object {
        fun show(): String {
            val state = if (BuildConfig.DEBUG) "DEBUG" else "RELEASE"
            return "(${state})Sumga chao moi nguoi. jar"
        }
    }
}