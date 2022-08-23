package uz.exemple.less6_task2_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task2_kotlin.R
import uz.exemple.less6_task2_kotlin.model.UserModel

class UserAdapter(var context: Context, var users:ArrayList<UserModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    
    override fun getItemCount(): Int {
        return users.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_grid_items,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users[position]
        if (holder is  UserViewHolder){
            val tv_firstName = holder.tv_firstName
            val tv_lastName = holder.tv_lastName

            tv_firstName.setText(user.firstName)
            tv_lastName.setText(user.lastName)
        }
    }

    class UserViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var tv_firstName: TextView
        var tv_lastName: TextView

        init {
            tv_firstName = view.findViewById(R.id.tv_firstName)
            tv_lastName = view.findViewById(R.id.tv_lastName)
        }



    }
}