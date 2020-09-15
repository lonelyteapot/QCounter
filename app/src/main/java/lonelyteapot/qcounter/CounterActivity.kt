package lonelyteapot.qcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class CounterActivity : AppCompatActivity() {
    lateinit var txtCount: TextView
    lateinit var btnInc: Button
    var count = 0
        set(value) {
            if (0 <= value && value <= Int.MAX_VALUE) {
                field = value
                txtCount.text = value.toString()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        txtCount = findViewById(R.id.txt_count)
        btnInc = findViewById(R.id.btn_inc)

        count = 0
    }

    fun incrementCount(view: View) {
        count += count/10 + 1
    }

    fun decrementCount(view: View) {
        count -= count/10 + 1
    }
}
