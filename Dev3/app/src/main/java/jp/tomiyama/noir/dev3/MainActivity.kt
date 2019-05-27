package jp.tomiyama.noir.dev3

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun goo(view: View?){
        player.text = "あなたの手はグーです"
        val number = Random().nextInt(3)

        when (number) {
            0 -> {
                cpu.text = "相手の手はグーです"
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor("#8a000000"))
            }
            1 -> {
                cpu.text = "相手の手はチョキです"
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor("#f44336"))
            }
            2 -> {
                cpu.text = "相手の手はパーです"
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor("#2196f3"))
            }
        }
    }

    fun choki(view: View?){
        player.text = "あなたの手はチョキです"
        val number = Random().nextInt(3)

        when (number) {
            0 -> {
                cpu.text = "相手の手はグーです"
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor("#2196f3"))
            }
            1 -> {
                cpu.text = "相手の手はチョキです"
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor("#8a000000"))
            }
            2 -> {
                cpu.text = "相手の手はパーです"
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor("#f44336"))
            }
        }
    }

    fun paa(view: View?){
        player.text = "あなたの手はパーです"
        val number = Random().nextInt(3)

        when (number) {
            0 -> {
                cpu.text = "相手の手はグーです"
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor("#f44336"))
            }
            1 -> {
                cpu.text = "相手の手はチョキです"
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor("#2196f3"))
            }
            2 -> {
                cpu.text = "相手の手はパーです"
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor("#8a000000"))
            }
        }
    }

}
