package ks.hs.emirim.wlalsdl_04.ex14_1_4;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MusicService extends Service {
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
    @Override
    public void onCreate(){
        Log.i("서비스 테스트 ::","onCreate() 호출됨");
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i("서비스 테스트 ::","onStartCommand() 호출됨");
        mp = MediaPlayer.create(this, R.raw.nomakeup);
        mp.setLooping(true);
        mp.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i("서비스 테스트 ::","onDestroy() 호출됨");
        super.onDestroy();
    }
}