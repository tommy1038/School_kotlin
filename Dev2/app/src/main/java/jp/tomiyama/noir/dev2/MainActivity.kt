package jp.tomiyama.noir.dev2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onClick(v: View?) {
        number = -number
        textView.text = number.toString()
    }

    var number : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "0"

        button3.setOnClickListener{
            number = 0
            textView.text = number.toString()
        }

        button4.setOnClickListener(this)

    }

    fun add(view : View?){
        number++
        textView.text = number.toString()
    }

    fun minus(view: View?){
        number--
        textView.text = number.toString()
    }

}
