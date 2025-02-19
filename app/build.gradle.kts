
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("com.apollographql.apollo3").version("3.7.3")
}


android {

    namespace = "com.emerson.pokeapp"
    compileSdk = rootProject.extra["compileSdk"] as Int

    defaultConfig {
        applicationId = "com.emerson.pokeapp"
        minSdk = rootProject.extra["minSdk"] as Int
        targetSdk = rootProject.extra["targetSdk"] as Int
        versionCode = rootProject.extra["versionCode"] as Int
        versionName = rootProject.extra["versionName"] as String

        buildConfigField(
            "String",
            "POKEMON_IMAGE_URL",
            "\"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/%d.png\""
        )

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    packagingOptions {
        exclude("META-INF/INDEX.LIST")
        exclude("META-INF/*.md")
        exclude("META-INF/*.txt")
        exclude("META-INF/*.kotlin_module")
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/io.netty.versions.properties")
    }

    buildFeatures {
        viewBinding = true
        compose = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = rootProject.extra["compose_compiler_version"] as String
    }
}
apollo {
    service("service") {
        packageName.set("com.emerson.pokeapp.data.remote")

    }
    dependencies {
        val core_version: String by rootProject.extra
        val appcompat_version: String by rootProject.extra
        val activity_version: String by rootProject.extra
        val fragment_version: String by rootProject.extra
        val lifecycle_version: String by rootProject.extra
        val paging_version: String by rootProject.extra
        val material_version: String by rootProject.extra
        val constraint_layout_version: String by rootProject.extra
        val recycler_view_version: String by rootProject.extra
        val material3_compose_version: String by rootProject.extra
        val compose_version: String by rootProject.extra
        val nav_version: String by rootProject.extra
        val gson_version: String by rootProject.extra
        val koin_version: String by rootProject.extra
        val coil_version: String by rootProject.extra
        val junit_version: String by rootProject.extra
        val jupiter_version: String by rootProject.extra
        val mockk_version: String by rootProject.extra
        val coroutines_test_version: String by rootProject.extra
        val truth_version: String by rootProject.extra
        val turbine_version: String by rootProject.extra

        // Core
        implementation("androidx.core:core-ktx:$core_version")
        implementation("androidx.appcompat:appcompat:$appcompat_version")
        implementation("androidx.activity:activity-ktx:$activity_version")
        implementation("androidx.activity:activity-compose:$activity_version")
        implementation("androidx.fragment:fragment-ktx:$fragment_version")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")
        implementation("androidx.paging:paging-runtime-ktx:$paging_version")
        implementation("androidx.paging:paging-compose:$paging_version")

        // UI
        implementation("com.google.android.material:material:$material_version")
        implementation("androidx.constraintlayout:constraintlayout:$constraint_layout_version")
        implementation("androidx.recyclerview:recyclerview:$recycler_view_version")

        // Compose UI
        implementation("androidx.compose.material:material-icons-core:$material3_compose_version")
        implementation("androidx.compose.material:material-icons-extended:$material3_compose_version")
        implementation("androidx.compose.material3:material3:$material3_compose_version")
        implementation("androidx.compose.ui:ui:$compose_version")
        implementation("androidx.compose.ui:ui-tooling-preview:$compose_version")
        implementation(libs.firebase.appdistribution.gradle)
        implementation(libs.androidx.ui.text.google.fonts)
        debugImplementation("androidx.compose.ui:ui-tooling:$compose_version")

        // Navigation
        implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
        implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
        implementation("androidx.navigation:navigation-compose:$nav_version")
        

        // Gson
        implementation("com.google.code.gson:gson:$gson_version")
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

        // Dependency Injection
        implementation("io.insert-koin:koin-android:$koin_version")
        implementation("io.insert-koin:koin-androidx-compose:$koin_version")
        implementation("io.insert-koin:koin-androidx-compose-navigation:$koin_version")

        // Image Loading
        implementation("io.coil-kt:coil:$coil_version")
        implementation("io.coil-kt:coil-compose:$coil_version")

        // Testing
        testImplementation("junit:junit:$junit_version")
        testImplementation("org.junit.jupiter:junit-jupiter:$jupiter_version")
        testImplementation("io.mockk:mockk:$mockk_version")
        testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutines_test_version")
        testImplementation("com.google.truth:truth:$truth_version")
        testImplementation("app.cash.turbine:turbine:$turbine_version")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        //room
        val room_version: String by rootProject.extra
        implementation("androidx.room:room-runtime:$room_version")
        implementation("androidx.room:room-ktx:$room_version")
        //apollo
        implementation("com.apollographql.apollo3:apollo-runtime:3.7.3")
        //AutoSizeText

        implementation("androidx.compose.ui:ui:1.6.7")
        //nav



    }
}


