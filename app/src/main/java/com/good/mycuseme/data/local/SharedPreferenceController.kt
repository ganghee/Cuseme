package com.good.mycuseme.data.local

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    private const val ACCOUNT = "my account"

    fun setUserInfo(ctx: Context, userData: UserData) {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.putString("userUUID", userData.uuid)
        editor.putString("userToken", userData.token)
        editor.putString("userPhoneNumber", userData.phoneNumber)
        editor.apply()
    }

    fun getUserUUID(ctx: Context): String {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("userUUID", "")!!
    }

    fun getUserToken(ctx: Context): String? {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("userToken", "")
    }

    fun getUserPhoneNumber(ctx: Context): String? {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("userPhoneNumber", "")
    }

    fun clearUserToken(ctx: Context) {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.clear()
        editor.apply()
    }

}