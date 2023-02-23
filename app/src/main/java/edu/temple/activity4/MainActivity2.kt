package edu.temple.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val thisSize = intent.getIntExtra(MESSAGE_KEY, 0)

        if(thisSize != 0){
            with(findViewById<TextView>(R.id.textView2)) {
                text = thisSize.toString()
                textSize = thisSize.toFloat()
            }
        }


    }

    override fun onDestroy() {
        super.onDestroy()

    }
}