plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-parcelize'
}

android {
    @@ -29,6 +30,9 @@ android {
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        viewBinding = true
    }
}

    dependencies {
        @@ -37,7 +41,8 @@ dependencies {
        implementation 'androidx.appcompat:appcompat:1.3.1'
        implementation 'com.google.android.material:material:1.4.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.1'
        testImplementation 'junit:junit:4.+'
        testImplementation 'junit:junit:4.13.2'
        androidTestImplementation 'androidx.test.ext:junit:1.1.3'
        androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
        implementation 'com.google.android.material:material:<version>'
    }