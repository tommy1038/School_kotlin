package jp.tomiyama.noir.dev14

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_memo.*

class MemoActivity : AppCompatActivity() {

    lateinit var pref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)

        pref = getSharedPreferences("pref_memo", Context.MODE_PRIVATE)

        titleEditText.setText(pref.getString("key_title",""))
        contentEditText.setText(pref.getString("key_content",""))
    }

    fun save(view: View?){

        val titleText = titleEditText.text.toString()
        val contentText = contentEditText.text.toString()

        val editor = pref.edit()
        editor.putString("key_title", titleText)
        editor.putString("key_content", contentText)
        editor.apply()

        finish()
    }
}
