package com.example.createpdfprintwithwifiprinter

import android.content.Context
import java.io.File

object Comman {
    fun getAppPath(context: Context): String? {

        val dir = File(
            context.filesDir
                .toString() + File.separator
                    + context.resources.getString(R.string.app_name)
                    + File.separator
        )
        if (!dir.exists()) dir.mkdir()
        return dir.path + File.separator
    }

}
