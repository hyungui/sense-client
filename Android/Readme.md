# 설치

.zip 파일의 내용물들 (.java) 를 안드로이드 프로젝트 내의 com.cochlear.ai 패키지에 넣는다


## App gradle에서의 설정을 아래와 같이 한다.

minsdkversion 21 이상

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

onCreate 등 처음 호출되는 곳에서 다음과 같이 초기화 한다.

```Java
CochlearSenseStreamClient cs = new CochlearSenseStreamClient("beta.cochlear.ai", 50051, apiKey)
				.senseMusicDetectorStream();
```

AudioRecord 콜백 등지에서 byte[]를 받게 되면 다음 과 같이 밀어넣는다.

```Java
cs.push(bytes);
```
현재 사실상 16000hz밖에 지원하지 않는다. 16000hz sample rate + 0.5sec duration + 4 byte bitrate 이므로 0.5초당 32000byte 버퍼가 넘어가야 한다. (한 번 push에 32000byte 버퍼와 크기가 다르다면 문제 발생)


현재 상태에서 이렇게 api 호출은 되지만, 결과값은 정상적이지 못하다. 부분 해결 필요.


   
```Java
cs.end();
```


