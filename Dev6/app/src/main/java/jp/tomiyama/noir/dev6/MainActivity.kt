package jp.tomiyama.noir.dev6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun change(view: View?){
        val number: Int = Random().nextInt(1000)
        textView.text = number.toString()
    }

    fun maru(view: View?){

    }
}
