# App gradle에서의 설정을 아래와 같이 한다.

minsdkversion 21 이상

-> dex 64kb 문제 회피

## dependencies

아래 두가지 추가

```Gradle
compile group: 'javax.annotation', name: 'javax.annotation-api', version: '1.3.2'
compile 'io.grpc:grpc-all:1.15.1'
```
## android->packageOptions (Optional) 

만일 META-INF/~~~ 파일이 두개 이상 있다는 에러가 발생하면 gradle:app->android->packageOptions로 아래를 추가
```Gradle
packagingOptions {
       exclude 'META-INF/io.netty.versions.properties'
       exclude 'META-INF/INDEX.LIST'
   }
```


# Permission

당연히 인터넷 사용 퍼미션을 추가해줘야 한다.

```XML
<uses-permission android:name="android.permission.INTERNET" />
```
