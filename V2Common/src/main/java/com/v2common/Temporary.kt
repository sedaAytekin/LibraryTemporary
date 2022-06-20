package com.v2common

import android.content.Context
import android.widget.Toast


class Temporary {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}