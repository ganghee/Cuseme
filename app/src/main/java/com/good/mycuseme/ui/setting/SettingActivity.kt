package com.good.mycuseme.ui.setting

import android.content.Intent
import android.os.Bundle
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.databinding.ActivitySettingBinding
import kotlinx.android.synthetic.main.activity_setting.*
import kotlinx.android.synthetic.main.toolbar_back.*

class SettingActivity : BaseActivity<ActivitySettingBinding>(R.layout.activity_setting) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUserInfo()
        backButton()
    }

    private fun backButton() {
        iv_back.setOnClickListener { finish() }
    }

    private fun setUserInfo() {
        ll_change_pw.setOnClickListener {
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)
        }
        ll_change_phone_number.setOnClickListener {
            val intent = Intent(this, PhoneNumberActivity::class.java)
            startActivity(intent)
        }
    }
}
