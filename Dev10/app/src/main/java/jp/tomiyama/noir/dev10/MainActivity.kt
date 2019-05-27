package jp.tomiyama.noir.dev10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{ parent: AdapterView<*>?, view: View?, position: Int, id: Long ->

            val adapter : ArrayAdapter<String> = listView.adapter as ArrayAdapter<String>
            val item = adapter.getItem(position)
            adapter.remove(item)
            adapter.add(item)
        }

        listView.onItemLongClickListener = AdapterView.OnItemLongClickListener{ parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val adapter = listView.adapter as ArrayAdapter<String>
            val item = adapter.getItem(position)
            adapter.remove(item)

            false
        }
    }

    fun add(view : View?){
        val text : String = editText.text.toString()
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()

        adapter.add(text)
    }


}
