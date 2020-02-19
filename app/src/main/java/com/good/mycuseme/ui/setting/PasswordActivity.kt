package com.good.mycuseme.ui.setting

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityPasswordBinding
import kotlinx.android.synthetic.main.activity_password.*
import kotlinx.android.synthetic.main.toolbar_back.*

class PasswordActivity : BaseActivity<ActivityPasswordBinding>(R.layout.activity_password) {

    private val passwordViewModel by lazy { ViewModelProvider(this).get(PasswordViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.passwordViewModel = passwordViewModel

        buttonClickable()
        changePassword()
        backButton()
    }

    private fun backButton() {
        iv_back.setOnClickListener { finish() }
    }

    private fun buttonClickable() {
        passwordViewModel.apply {
            isClickable.observe(this@PasswordActivity, Observer {
                btn_password.isSelected = it
            })
            beforePassword.observe(this@PasswordActivity, Observer {
                confirmNewPassword()
            })
            newPassword.observe(this@PasswordActivity, Observer {
                confirmNewPassword()
            })
            newPasswordConfirm.observe(this@PasswordActivity, Observer {
                confirmNewPassword()
            })
        }
    }

    private fun changePassword() {
        passwordViewModel.apply {
            btn_password.setOnClickListener {
                changePassword(
                    token!!,
                    passwordViewModel.beforePassword.value!!,
                    passwordViewModel.newPassword.value!!
                )
            }
            successChange.observe(this@PasswordActivity, Observer {
                if (it == 1) Toast.makeText(
                    this@PasswordActivity,
                    "비밀번호가 변경되었습니다.",
                    Toast.LENGTH_SHORT
                ).show()
                else if (it == -1) Toast.makeText(
                    this@PasswordActivity,
                    "비밀번호가 변경되지 않았습니다.",
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
    }
}
