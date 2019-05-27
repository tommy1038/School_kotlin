package jp.tomiyama.noir.dev12

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    var mTimer : Timer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()

        var mTime : Int = -1

        val mDefaultTime = intent.getIntExtra("minutes",0)

        intentButton.setOnClickListener {
//            mTime = 10

            if(mTimer == null){
                mTimer = Timer(false)

                Toast.makeText(this, "${mDefaultTime}秒あててね！", Toast.LENGTH_LONG).show()

                mTime = mDefaultTime

                mTimer!!.schedule(0,1000){
                    // 定期的に実行したい処理
                    mTime--
                    Log.d("timeの数字=", mTime.toString())

                    handler.post {
                        mTimeTextView.text = mTime.toString()
                    }
                }
            }
        }

        stopButton.setOnClickListener {

            if(mTimer != null){
                if(mTime == 0){
                    // 秒数ピッタリ当てられた時
                    mTimeTextView.text = mTime.toString()
                    mResultTextView.text = "おめでとう！"
                } else {
                    // 秒数をぴったり当てられなかった時
                    mTimeTextView.text = mTime.toString()
                    mResultTextView.text = "残念！"
                }
                mTimer!!.cancel()
                mTimer = null
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        if(mTimer != null){
            // 破棄処理
            mTimer!!.cancel()
            mTimer = null
        }
    }
}
