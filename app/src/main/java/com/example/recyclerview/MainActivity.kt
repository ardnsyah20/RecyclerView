package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Inis_Variable
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable. wanita,
            namamhs = "Diaan",
            Nimmhs = "0001",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. pria,
            namamhs = "hafid",
            Nimmhs = "0002",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. wanita,
            namamhs = "dian",
            Nimmhs = "0002",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. pria,
            namamhs = "hafid",
            Nimmhs = "0002",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. wanita,
            namamhs = "dian",
            Nimmhs = "0002",
            Telpmhs = "084123"
        ),
        Inis_Variable(
            R.drawable. pria,
            namamhs = "hafid",
            Nimmhs = "0002",
            Telpmhs = "084123"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        ShowListMahasiswa()
        ShowGridMahasiswa()
        ShowCardMahasiswa()

    }
    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){
        }
        val recyclerView =
            findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.layoutManager = GridLayoutManager (this, 2)
        recyclerView.adapter = Grid_MahasiswaAdapter (Datamahasiswa) {
        }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdapter(this,
            Datamahasiswa){
        }
    }
}