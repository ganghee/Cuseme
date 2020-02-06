package com.good.mycuseme.ui.setting

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.data.local.UserData
import com.good.mycuseme.databinding.ActivityPhoneNumberBinding
import kotlinx.android.synthetic.main.activity_phone_number.*
import kotlinx.android.synthetic.main.toolbar_back.*

class PhoneNumberActivity :
    BaseActivity<ActivityPhoneNumberBinding>(R.layout.activity_phone_number) {

    private val currentNumber by lazy { SharedPreferenceController.getUserPhoneNumber(this) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }
    val uuid by lazy { SharedPreferenceController.getUserUUID(this) }

    private val phoneNumberViewModel by lazy { ViewModelProvider(this).get(PhoneNumberViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.phoneNumberViewModel = phoneNumberViewModel

        getPhoneNumber()
        changePhoneNumber()
        backButton()
        Log.d("token", token)
    }

    private fun backButton() {
        iv_back.setOnClickListener { finish() }
    }

    private fun changePhoneNumber() {
        phoneNumberViewModel.apply {
            btn_phone.setOnClickListener {
                changePhoneNumber(token!!, currentNumber!!)
            }
            isClickable.observe(this@PhoneNumberActivity, Observer {
                btn_phone.isSelected = it
            })
            phoneNumber.observe(this@PhoneNumberActivity, Observer {
                notNullNumber()
            })
            isSuccess.observe(this@PhoneNumberActivity, Observer {
                if (isSuccess.value == 1) {
                    Toast.makeText(
                        this@PhoneNumberActivity,
                        "핸드폰 번호가 변경되었습니다.",
                        Toast.LENGTH_SHORT
                    ).show()
                    val userData = UserData(uuid, token, phoneNumber.value)
                    SharedPreferenceController.setUserInfo(applicationContext, userData)
                } else if (isSuccess.value == -1) {
                    Toast.makeText(
                        this@PhoneNumberActivity,
                        "핸드폰 번호가 변경되지 않았습니다.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
        }
    }

    private fun getPhoneNumber() {
        phoneNumberViewModel.phoneNumber.value = currentNumber
    }
}
