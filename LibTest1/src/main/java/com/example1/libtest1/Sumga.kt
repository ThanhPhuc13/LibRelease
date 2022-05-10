package com.example1.libtest1

class Sumga {
    companion object {
        fun show(): String {
            return if(BuildConfig.DEBUG) "(Debug)Sumga chao moi nguoi. jar" else "(Release)Sumga chao moi nguoi. jar"
        }
    }
}