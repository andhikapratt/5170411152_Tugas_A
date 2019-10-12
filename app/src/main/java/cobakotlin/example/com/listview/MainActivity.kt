package cobakotlin.example.com.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = listOf("Kotlin","Python","Ruby","JavaScript","PHP")

        list_view.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        list_view.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda Memilih : ${languages[position]}", Toast.LENGTH_SHORT).show()
        }
    }


}


