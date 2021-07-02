// IExampleAidl.aidl
package com.example.aidl;

import com.example.aidl.User;
// Declare any non-default types here with import statements

interface IExampleAidl {

    List<User> addUser(in User user);
}
