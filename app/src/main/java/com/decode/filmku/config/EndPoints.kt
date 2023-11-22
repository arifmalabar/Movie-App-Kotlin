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

}