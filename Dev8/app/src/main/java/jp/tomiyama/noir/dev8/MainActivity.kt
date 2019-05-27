package jp.tomiyama.noir.dev8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple_icon,"りんご")
        val banana = Word(R.drawable.banana_icon,"バナナ")
        val orange = Word(R.drawable.orange_icon,"オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon,"いちご")

        val fruits = arrayOf(apple,banana,orange,strawberry)

        for (fruit in fruits){
            addWord(fruit)
        }

//        addWord(apple)
//        addWord(banana)
//        addWord(orange)
//        addWord(strawberry)

//        val nameTextView = TextView(this)
//
//        nameTextView.text = apple.name
//        nameTextView.textSize = 30.0f

//        container.addView(nameTextView)

//        val layout = LinearLayout(this)
//        layout.orientation = LinearLayout.HORIZONTAL
//
//        val imageView = ImageView(this)
//        imageView.setImageResource(apple.resId)
//
//        layout.addView(imageView)
//        layout.addView(nameTextView)
//
//        val lp = LinearLayout.LayoutParams(
//            ViewGroup.LayoutParams.WRAP_CONTENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT)
//
//        lp.gravity = Gravity.CENTER_VERTICAL
//        nameTextView.layoutParams = lp
//
//        container.addView(layout)

    }

    private fun addWord(word: Word){
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val nameTextView = TextView(this)
        nameTextView.text = word.name
        // 文字サイズ調整
        nameTextView.textSize = 30.0f

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)

        // textViewの位置調整
        val lp = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)

        lp.gravity = Gravity.CENTER_VERTICAL
        nameTextView.layoutParams = lp

        container.addView(layout)

    }
}
