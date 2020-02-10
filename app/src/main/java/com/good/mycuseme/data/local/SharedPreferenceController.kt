package com.good.mycuseme.data.local

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    private const val ACCOUNT = "my account"

    fun setUserUUID(ctx: Context, uuid: String) {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.putString("userUUID", uuid)
        editor.apply()
    }

    fun setUserToken(ctx: Context, token: String) {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.putString("userToken", token)
        editor.apply()
    }

    fun setUserPhoneNumber(ctx: Context, phone: String) {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.putString("userPhoneNumber", phone)
        editor.apply()
    }

    fun getUserUUID(ctx: Context): String {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("userUUID", "")!!
    }

    fun getUserToken(ctx: Context): String? {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("userToken", "default token")
    }

    fun getUserPhoneNumber(ctx: Context): String? {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("userPhoneNumber", "010-")
    }

    fun clearUserToken(ctx: Context) {
        val preference: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.clear()
        editor.apply()
    }

}