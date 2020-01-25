package com.good.mycuseme.ui.user

import android.annotation.SuppressLint
import android.app.Application
import android.content.ContentResolver
import android.content.Context
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.databinding.ActivityUserBinding
import com.google.android.material.internal.ContextUtils
import java.security.AccessController.getContext

class UserActivity : BaseActivity<ActivityUserBinding>(R.layout.activity_user) {

    private val userViewModel by lazy { ViewModelProvider(this).get(UserViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.userViewModel = userViewModel

        @SuppressLint("HardwareIds")
        val androidId =  Settings.Secure.getString(
            this.contentResolver,
            Settings.Secure.ANDROID_ID)

        initViewModel(androidId)
        getCard(androidId)
    }

    private fun getCard(androidId: String) {
        userViewModel.getCard(androidId)
    }

    private fun initViewModel(androidId: String) {
        Toast.makeText(this.applicationContext, androidId, Toast.LENGTH_SHORT).show()
    }
}
