package jp.tomiyama.noir.dev12

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*


class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        intentButton.setOnClickListener {
            val intent : Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("minutes",10)
            startActivity(intent)
        }
    }
}
