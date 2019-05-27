package jp.tomiyama.noir.dev11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCards : ArrayList<Card> = arrayListOf()
        val mCardAdapter : CardAdapter

        mCards.add(Card(R.drawable.voice,
            getString(R.string.voice_title),
            getString(R.string.voice_content),
            getString(R.string.voice_meaning)))

        mCards.add(Card(R.drawable.sing,
            getString(R.string.sing_title),
            getString(R.string.sing_content),
            getString(R.string.sing_meaning)))

        mCardAdapter = CardAdapter(this,R.layout.card,mCards)
        listView.adapter = mCardAdapter
    }
}
