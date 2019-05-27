package jp.tomiyama.noir.dev4

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
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
//                cpu.text = "相手の手はグーです"
                cpu.setImageResource(R.drawable.goo)
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor("#8a000000"))
            }
            1 -> {
//                cpu.text = "相手の手はチョキです"
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor("#f44336"))
            }
            2 -> {
//                cpu.text = "相手の手はパーです"
                cpu.setImageResource(R.drawable.paa)
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
//                cpu.text = "相手の手はグーです"
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor("#2196f3"))
            }
            1 -> {
//                cpu.text = "相手の手はチョキです"
                cpu.setImageResource(R.drawable.choki)
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor("#8a000000"))
            }
            2 -> {
//                cpu.text = "相手の手はパーです"
                cpu.setImageResource(R.drawable.paa)
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
//                cpu.text = "相手の手はグーです"
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.parseColor("#f44336"))
            }
            1 -> {
//                cpu.text = "相手の手はチョキです"
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの負けです"
                result.setTextColor(Color.parseColor("#2196f3"))
            }
            2 -> {
//                cpu.text = "相手の手はパーです"
                cpu.setImageResource(R.drawable.paa)
                result.text = "引き分けです"
                result.setTextColor(Color.parseColor("#8a000000"))
            }
        }
    }
}
