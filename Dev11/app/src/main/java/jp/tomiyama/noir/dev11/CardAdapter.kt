package jp.tomiyama.noir.dev11

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CardAdapter(context: Context, layoutResourceId: Int, objects: List<Card>) :
    ArrayAdapter<Card>(context, layoutResourceId, objects) {

    var mCards : List<Card> = objects

    override fun getCount(): Int {
        return mCards.size
    }

    override fun getItem(position: Int): Card? {
        return mCards[position]
    }

//    override fun getItem(position: Int): Card? {
//        return super.getItem(position)
//    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {

        val (viewHolder, convertView) = if(convertView == null) {
            val inflater = LayoutInflater.from(context)
            val convertView = inflater.inflate(R.layout.card, null)
            val viewHolder = ViewHolder(convertView)

            convertView.tag = viewHolder
            Pair(viewHolder, convertView)
        } else {
            Pair(convertView.tag, convertView)
        }

        val item : Card? = getItem(position)

        if(item != null){
            (viewHolder as ViewHolder).iconImageView.setBackgroundResource(item.imageId)
            (viewHolder as ViewHolder).titleTextView.text = item.title
            (viewHolder as ViewHolder).contentTextView.text = item.content
        }



        return convertView
    }

    class ViewHolder(view: View){

        val iconImageView : ImageView = view.findViewById(R.id.icon)
        val titleTextView: TextView = view.findViewById(R.id.title_textview)
        val likeTextView: TextView = view.findViewById(R.id.like_textview)
        val contentTextView: TextView = view.findViewById(R.id.content)
        val likeButton: ImageView = view.findViewById(R.id.like_button)
    }

}