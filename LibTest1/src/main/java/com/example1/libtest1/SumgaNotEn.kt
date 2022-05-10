package com.example1.libtest1

class SumgaNotEn: Father() {
    companion object {
        fun show(): String {
            return Sumga.show()
        }
    }

    private fun showV2(): String {
        return "showV2 private"
    }
}