# TextDrawable
This is an android library which converts any text to image and can be viewed in an image view. It is highly customizable from shape to color to font .



### Follow these steps to use this library:
#### In build.gradle (Project)

``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
``` 

And then in the other gradle file(may be your app gradle or your own module library gradle, but never add in both of them to avoid conflict.)

``` gradle
dependencies {
	        compile 'com.github.kapilmhr:TextDrawable:1.0.0'
          }
```

