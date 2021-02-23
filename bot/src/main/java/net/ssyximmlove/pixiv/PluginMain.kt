package net.ssyximmlove.pixiv

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info
import java.sql.Connection
import java.sql.DriverManager


object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "me.ssyximmlove.pixiv",
        name = "Pixiv-Plugin",
        version = "0.1.0"
    )
) {
    override fun onEnable() {
        logger.info { "插件已加载" }
    }
    private fun conn(): Connection? {
        var driver = "com.mysql.jdbc.Driver"
        var url = "jdbc:mysql://**.***.**.***:****"
        var userName = "********"
        var dbPasswd = "********"
        return DriverManager.getConnection(url,userName,dbPasswd)
    }
}