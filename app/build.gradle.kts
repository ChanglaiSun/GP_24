plugins {
    id("com.android.application")
}

android {
    namespace = "anu.cookcompass"
    compileSdk = 33

    defaultConfig {
        applicationId = "anu.cookcompass"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.opencsv:opencsv:5.9")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.firebase:firebase-crashlytics-buildtools:2.9.9")
    implementation("androidx.activity:activity:1.7.2"){
    }

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
//fix
configurations.all {
    resolutionStrategy.force("org.jetbrains.kotlin:kotlin-stdlib:1.8.10") ;
    resolutionStrategy.force("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.10");
    resolutionStrategy.force("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10") ;
}