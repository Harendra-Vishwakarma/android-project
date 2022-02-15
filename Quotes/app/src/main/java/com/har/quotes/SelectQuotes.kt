package com.har.quotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.har.quotes.databinding.ActivitySelectQuotesBinding

class SelectQuotes : AppCompatActivity() {

    private lateinit var binding:ActivitySelectQuotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySelectQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    /*private fun setListener() {
        val viewId: List<View> = listOf(
            binding.quote1,
            binding.quote2,
            binding.quote3,
            binding.quote4,
            binding.quote5,
            binding.quote6,
            binding.quote7,
            binding.quote8,
            binding.quote9,
            binding.quote10,
            binding.quote11
        )
          for(element in viewId) {
                element.setOnClickListener {
                sendData(it)

            }
              return
        }
    }*/
    fun setListener(view: View) {
        when (view.id) {
            R.id.quote1 -> receive(findViewById(R.id.quote1))
            R.id.quote2 -> receive(findViewById(R.id.quote2))
            R.id.quote3 -> receive(findViewById(R.id.quote3))
            R.id.quote4 -> receive(findViewById(R.id.quote4))
            R.id.quote5 -> receive(findViewById(R.id.quote5))
            R.id.quote6 -> receive(findViewById(R.id.quote6))
            R.id.quote7 -> receive(findViewById(R.id.quote7))
            R.id.quote8 -> receive(findViewById(R.id.quote8))
            R.id.quote9 -> receive(findViewById(R.id.quote9))
            R.id.quote10 -> receive(findViewById(R.id.quote10))
            else -> receive(findViewById(R.id.quote11))
        }
        /*     val text1:String=quote.text.toString()
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text1)
        startActivity(intent) */
    }

   private  fun receive(vew:TextView)
    {
        val text1:String=vew.text.toString()
        val intent= Intent()
        intent.action= Intent.ACTION_SEND
        intent.type="text/plain"
        intent.putExtra(Intent.EXTRA_TEXT,text1)
        startActivity(Intent.createChooser(intent,"Quotes to.."))
     }


}