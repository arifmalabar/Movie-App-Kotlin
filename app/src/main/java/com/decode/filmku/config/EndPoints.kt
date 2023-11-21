package com.decode.filmku.config
import android.os.AsyncTask
import com.decode.filmku.config.ServerConfig
import com.decode.filmku.server.RequestHandler
import org.json.JSONObject

class EndPoints {
    companion object{
        var nowPlaying : String = ServerConfig.baseUrl+"/now_playing"
        var popularFilm : String = ServerConfig.baseUrl+"/popular";
    }
    inner class FecthData : AsyncTask<String, String, String>() {
        override fun doInBackground(vararg p0: String): String {
            var data =RequestHandler.sendRequestHandler(p0.toString())
            var dataJson : JSONObject = JSONObject("results");
            return data;
        }

    }
}