package baidu;

import java.io.IOException;

import org.json.JSONObject;

import com.baidu.aip.speech.AipSpeech;
import com.baidu.aip.util.Util;

public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "10947934";
    public static final String API_KEY = "VM3y87RyKnSmzBR7GpDtYhbN";
    public static final String SECRET_KEY = "1552a07cef4238b8558739b0a01ff997";
    public static void main(String[] args) {
        // 初始化一个AipSpeech
        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);
        
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        
        
        // 对本地语音文件进行识别
        String path = "D:\\16k.wav";
        JSONObject asrRes = client.asr(path, "wav", 16000, null);
        System.out.println(asrRes);
    }
    
    
    public void synthesis(AipSpeech client) throws Exception
    {
        // 对本地语音文件进行识别
        String path = "D:\\16k.wav";
        JSONObject asrRes = client.asr(path, "wav", 16000, null);
        System.out.println(asrRes);
        // 对语音二进制数据进行识别
        byte[] data = Util.readFileByBytes(path);     //readFileByBytes仅为获取二进制数据示例
        JSONObject asrRes2 = client.asr(data, "wav", 16000, null);
        System.out.println(asrRes);
        // 对网络上音频进行识别
        // String url = "http://somehost/res/16k_test.pcm";
        // String callback = "http://callbackhost/aip/dump";
        // JSONObject res = client.asr(url, callback, "pcm", 16000, null);
        // System.out.println(res);
    }
}	