package uz.exemple.less6_task2_kotlin

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task2_kotlin.adapter.UserAdapter
import uz.exemple.less6_task2_kotlin.model.UserModel

class MainActivity : AppCompatActivity() {
    lateinit var context: Context
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(context, 3))

        val users = ArrayList<UserModel>()
        for (i in 1..30) {
            users.add(UserModel("Khushnud $i", "Boymurodov $i"))
        }
        refreshAdapter(users)
    }
    fun refreshAdapter(users: ArrayList<UserModel>) {
        val adapter = UserAdapter(context, users)
        recyclerView.adapter = adapter
    }
}