package com.decode.filmku.server

import com.decode.filmku.config.ServerConfig
import java.net.URL

class RequestHandler {
    companion object{
        public fun sendRequestHandler(url : String) : String
        {
            var data : String = "";
            try {
                var url = URL(url).openConnection()
                with(url) {
                    setRequestProperty("Authorization", ServerConfig.keyEndPoints)
                    data = getInputStream().bufferedReader().readText()
                }
            } catch (err : Exception){
                data = "{ status : failed, data : [] }"
            }
            return data;
        }
    }
}