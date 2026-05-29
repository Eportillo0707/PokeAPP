plugins {
    id("com.android.application") version "8.7.3" apply false
    id("com.android.library") version "8.7.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("androidx.navigation.safeargs") version "2.8.7" apply false
    id("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false
}

ext {
    set("compileSdk", 35)
    set("minSdk", 24)
    set("targetSdk", 35)
    set("versionCode", 4)
    set("versionName", "1.2.1")

    set("nav_version", "2.8.6")
    set("lifecycle_version", "2.6.1")
    set("room_version", "2.6.1")
    set("recycler_view_version", "1.3.1")
    set("constraint_layout_version", "2.1.4")
    set("material_version", "1.9.0")

    set("material3_compose_version", "1.3.2")
    set("compose_version", "1.8.3")
    set("compose_compiler_version", "1.5.14")

    set("fragment_version", "1.6.1")
    set("activity_version", "1.7.2")
    set("appcompat_version", "1.6.1")
    set("core_version", "1.10.1")
    set("paging_version", "3.2.0")

    set("retrofit_version", "2.9.0")
    set("http_logging_version", "4.10.0")
    set("gson_version", "2.10.1")
    set("coil_version", "2.4.0")
    set("koin_version", "3.4.3")

    set("jupiter_version", "5.9.1")
    set("mockk_version", "1.13.3")
    set("junit_version", "4.13.2")
    set("truth_version", "1.1.3")
    set("coroutines_test_version", "1.6.4")
    set("turbine_version", "1.0.0")
}