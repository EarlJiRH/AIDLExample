package com.example.aidl

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * ================================================
 * 类名：com.example.aidl
 * 时间：2021/6/18 16:26
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
class IRemoteService : Service() {
    var users: MutableList<User>? = null

    override fun onBind(intent: Intent?): IBinder? {
        users = mutableListOf()
        return iBinder
    }

    private val iBinder = object : IExampleAidl.Stub() {
        override fun addUser(user: User): MutableList<User> {
            users?.apply {
                add(user)
            }
            return users!!
        }
    }
}