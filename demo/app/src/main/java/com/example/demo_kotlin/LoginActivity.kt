package com.example.demo_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /// xu ly main
        xulyBtnLogIn()
        xulyBtnSignUp()
        xulyBtnForgotPassWord()
    }
    // onClick nut dang nhap
    fun xulyBtnLogIn(){
        btn_login.setOnClickListener{
            btn_login.setOnClickListener {
                if(et_password.text.toString() == "1" && et_user.text.toString() == "1"){
                    val intent : Intent = Intent(this@LoginActivity, DocumentActivity::class.java)
                    startActivities(arrayOf(intent))
                }
                else
                    Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show()
            }
        }
    }
    // onClick nut dang ki
    fun xulyBtnSignUp(){
        tv_signup.setOnClickListener{
            Toast.makeText(this, "Tính năng này đang được phát trỉên", Toast.LENGTH_SHORT).show()

        }
    }
    fun xulyBtnForgotPassWord(){
        tv_forgotpassword.setOnClickListener{
            Toast.makeText(this, "Tính năng này đang được phát trỉên", Toast.LENGTH_SHORT).show()
        }

    }
}
