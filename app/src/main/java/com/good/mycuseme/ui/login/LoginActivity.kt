package com.good.mycuseme.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.data.local.UserData
import com.good.mycuseme.databinding.ActivityLoginBinding
import com.good.mycuseme.ui.manage.ManageCardActivity
import com.good.mycuseme.ui.user.UserActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    private val loginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }
    val uuid by lazy { SharedPreferenceController.getUserUUID(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.loginViewModel = loginViewModel

        initButton()
        backToUserActivity()
        startManageActivity()
    }

    private fun backToUserActivity() {
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun initButton() {
        loginViewModel.apply {
            password.observe(this@LoginActivity, Observer {
                clickable(it)
                btn_login.isSelected = isClickable.value!!
            })
            wrongPassword.observe(this@LoginActivity, Observer {
                tv_wrong_text.isVisible = it
            })
            token.observe(this@LoginActivity, Observer {
                val userData = UserData(uuid, it, null)
                SharedPreferenceController.setUserInfo(applicationContext, userData)
            })
            loginSuccess.observe(this@LoginActivity, Observer {
                if (it) {
                    val intent = Intent(applicationContext, ManageCardActivity::class.java)
                    startActivity(intent)
                }
            })
        }
    }

    private fun startManageActivity() {
        btn_login.setOnClickListener {
            loginViewModel.login(uuid, loginViewModel.password.value!!)
        }
    }
}
