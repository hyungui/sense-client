# 설치


안드로이드 스튜디오의 프로젝트 내에 com.cochlear.ai 패키지를 생성하고
폰 리포지토리의 src 경로 내의 .java, .interface 파일들을 com.cochlear.ai 패키지에 넣는다.


## App gradle에서의 설정을 아래와 같이 한다.

minsdkversion 21 이상으로 할 것

-> dex 64kb 문제 회피

### dependencies

아래 두가지 추가

```Gradle
compile group: 'javax.annotation', name: 'javax.annotation-api', version: '1.3.2'
compile 'io.grpc:grpc-all:1.15.1'
```
### android->packageOptions (Optional) 

만일 META-INF/~~~ 파일이 두개 이상 있다는 에러가 발생하면 gradle:app->android->packageOptions로 아래를 추가
```Gradle
packagingOptions {
       exclude 'META-INF/io.netty.versions.properties'
       exclude 'META-INF/INDEX.LIST'
   }
```


## Permission

당연히 인터넷 사용 퍼미션을 추가해줘야 한다.

```XML
<uses-permission android:name="android.permission.INTERNET" />
```

# 호출

onCreate 등 처음 호출되는 곳에서 다음과 같이 클라이언트를 초기화 한다.

```Java
CochlearSenseStreamClient cs = new CochlearSenseStreamClient("beta.cochlear.ai", 50051, apiKey);

cs..senseMusicDetectorStream(16000, 16, false, true);
```

AudioRecord 콜백 등지에서 byte[]를 받게 되면 다음 과 같이 밀어넣는다.


* 현재 16bitrate 만을 지원하고 있다.

```Java
cs.push(bytes);
```
16000hz sample rate + 0.5sec duration + 4 byte bitrate 이므로 0.5초당 32000byte 버퍼가 넘어가야 한다. (한 번 push에 32000byte 버퍼와 크기가 다르다면 문제 발생)



마지막으로 사용이 끝나면 아래와 같이 
   
```Java
cs.end();
```


