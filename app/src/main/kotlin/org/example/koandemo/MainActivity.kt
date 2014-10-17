package org.example.koandemo

import android.app.*
import android.view.*
import android.widget.*
import kotlinx.android.koan.*
import android.os.Bundle

class MainActivity: Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super<Activity>.onCreate(savedInstanceState)

    val customStyle = { (v: Any) -> when(v) {
      is Button -> v.textSize = 26f
      is EditText -> v.textSize = 24f
    }}

    verticalLayout {
      padding = dip(32)

      imageView(android.R.drawable.ic_menu_manage).layoutParams {
        margin = dip(16)
        gravity = Gravity.CENTER
      }

      val name = editText {
        hintResource = R.string.name
      }
      val password = editText {
        hintResource = R.string.password
      }
      button("Login") {
        onClick {
          tryLogin(name.text, password.text)
        }
      }
    }.style(customStyle)
  }

  private fun tryLogin(name: CharSequence?, password: CharSequence?) {
    val result =
      if (checkCredentials(name.toString(), password.toString()))
        "Logged in! :)"
      else
        "Wrong password :( Enter user:password"
    toast(result)
  }

  private fun checkCredentials(name: String, password: String) =
    name=="user" && password=="password"

}