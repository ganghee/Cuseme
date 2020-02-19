package com.good.mycuseme.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityLoginBinding
import com.good.mycuseme.ui.home.HomeActivity
import com.good.mycuseme.ui.manage.ManageCardActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.toolbar_back.*

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    private val loginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }
    val uuid by lazy { SharedPreferenceController.getUserUUID(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.loginViewModel = loginViewModel

        initButton()
        backToHomeActivity()
        startManageActivity()
    }

    private fun backToHomeActivity() {
        iv_back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun initButton() {
        loginViewModel.apply {
            password.observe(this@LoginActivity, Observer {
                clickable(it)
                btn_login.isSelected = isClickable.value!!
            })
            wrongPassword.observe(this@LoginActivity, Observer {
                if (it) tv_login_wrong_text.visibility = View.VISIBLE
                else tv_login_wrong_text.visibility = View.INVISIBLE
            })
            token.observe(this@LoginActivity, Observer {
                if (it != null) Log.d("token", "토큰 저장 성공" + it)
                SharedPreferenceController.setUserToken(applicationContext, it)
            })
            loginSuccess.observe(this@LoginActivity, Observer {
                if (it) {
                    val intent = Intent(applicationContext, ManageCardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            })
        }
    }

    private fun startManageActivity() {
        btn_login.setOnClickListener {
            loginViewModel.login(uuid, loginViewModel.password.value!!)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
