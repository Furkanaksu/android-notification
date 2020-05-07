package com.furkan.myapplication

import java.util.ArrayList
import java.util.HashMap

class NotificationCenter//default c'tor for singleton
private constructor() {
    private val registredObjects:HashMap<String, ArrayList<Runnable>> = HashMap<String, ArrayList<Runnable>>()
    @Synchronized fun addFucntionForNotification(notificationName:String, r:Runnable) {
        var list = registredObjects.get(notificationName)
        if (list == null)
        {
            list = ArrayList<Runnable>()
            registredObjects.put(notificationName, list)
        }
        list.add(r)
    }
    @Synchronized fun removeFucntionForNotification(notificationName:String, r:Runnable) {
        val list = registredObjects.get(notificationName)
        if (list != null)
        {
            list.remove(r)
        }
    }
    @Synchronized fun postNotification(notificationName:String) {
        val list = registredObjects.get(notificationName)
        if (list != null)
        {
            for (r in list)
                r.run()
        }
    }
    companion object {
        //static reference for singleton
        private var _instance:NotificationCenter? = null
        //returning the reference
        @Synchronized fun defaultCenter():NotificationCenter {
            if (_instance == null)
                _instance = NotificationCenter()
            return _instance as NotificationCenter
        }
    }
}