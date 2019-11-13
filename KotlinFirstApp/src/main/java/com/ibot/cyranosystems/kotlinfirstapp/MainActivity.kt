package com.ibot.cyranosystems.kotlinfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginClick.setOnClickListener{
            var usernameval:String=edtUsername.text.toString()
            var userpassval:String=edtPassword.text.toString()
            if(usernameval.equals("")){
                showToast("Please enter username")
            }else if(userpassval.equals("")){
                showToast("Please enter password")
            }else{
                showToast("Username is "+usernameval+ " user Password is "+userpassval)
            }
        }
    }
    fun showToast(args:String){
        Toast.makeText(this,args,Toast.LENGTH_SHORT).show()
    }
}
