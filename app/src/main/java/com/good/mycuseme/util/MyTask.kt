package com.good.mycuseme.util

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.AsyncTask
import android.util.Log
import java.io.IOException
import java.io.InputStream
import java.net.URL

class MyTask(
    private val imageString: Uri
) :
    AsyncTask<Void?, Void?, Void?>() {

    var result: InputStream? = null
    var bitmap: Bitmap? = null
    var inputStream: InputStream? = null

    override fun doInBackground(vararg params: Void?): Void? {
        try {
            Log.d("imageslice", imageString.toString().slice(IntRange(0, 6)))
            inputStream = URL(imageString.toString()).openStream()
            result = inputStream
            Log.d("resultresult", result.toString())
            val options = BitmapFactory.Options()
            bitmap = BitmapFactory.decodeStream(result, null, options)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }

    @SuppressLint("CheckResult")
    override fun onPostExecute(aVoid: Void?) {
        super.onPostExecute(aVoid)

    }
}