#Simple Java Splash Screen

If your application is packaged in a jar file, you can use the "SplashScreen-Image" option in a manifest file to show a splash screen. Place the image in the jar archive and specify the path in the option. The path should not have a leading slash. 
For example, in the manifest.mf file:

```html
Manifest-Version: 1.0
Main-Class: Test
SplashScreen-Image: filename.gif
```

Then you can call the splash screen by running,

```java
SplashScreenManager test = new SplashScreenManager();
test.runSplash();
```