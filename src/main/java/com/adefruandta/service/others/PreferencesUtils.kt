package com.adefruandta.service.others

import android.content.SharedPreferences

/**
 * Created by adefruandta on 12/14/17.
 */

fun SharedPreferences.commit(listener: (SharedPreferences.Editor) -> Unit) {
    val editor = edit()
    listener(editor)
    editor.commit()
}

fun SharedPreferences.apply(listener: (SharedPreferences.Editor) -> Unit) {
    val editor = edit()
    listener(editor)
    editor.apply()
}