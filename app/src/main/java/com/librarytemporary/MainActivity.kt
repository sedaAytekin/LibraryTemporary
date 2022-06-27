package com.librarytemporary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.v2common.ui.dialog.WaitingDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WaitingDialog.show(this)

    }
}