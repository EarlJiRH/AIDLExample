package com.example.aidl

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * ================================================
 * 类名：com.example.aidl
 * 时间：2021/7/2 11:39
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
@SuppressLint("ParcelCreator")
@Parcelize
data class User(val name: String?="zhang san", val age: Int=18) : Parcelable