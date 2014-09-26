package org.example.koandemo

import android.app.*
import android.view.*
import android.widget.*
import kotlinx.android.koan.*
import android.os.Bundle

class MainActivity: Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super<Activity>.onCreate(savedInstanceState)

    verticalLayout {
      padding = dip(32)

      imageView(android.R.drawable.ic_menu_manage).layoutParams {
        margin = dip(16)
        gravity = Gravity.CENTER
      }

      val name = editText {
        hint = "Name"
        textSize = 24f
      }
      val password = editText {
        hint = "Password"
        textSize = 24f
      }
      button("Login") {
        textSize = 26f
        onClick {
          tryLogin(name.text, password.text)
        }
      }
    }
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