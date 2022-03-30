plugins {
    kotlin("js") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
}

group = "com.kalai"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    //React, React DOM + Wrappers 
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.202-kotlin-1.5.0")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.202-kotlin-1.5.0")
    implementation(npm("react", "17.0.2"))
    implementation(npm("react-dom", "17.0.2"))
    implementation ("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.0-pre.202-kotlin-1.5.0")

    implementation(npm("styled-components",  "~5.1.1"))
    implementation(npm("inline-style-prefixer", "~6.0.0"))


    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
}


kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()

    }
}

task("copyOutputToDocs"){
    val outputFolder = File("build/distributions")
    val docFolder = File("../docs")
    if(outputFolder.exists())
        outputFolder.copyRecursively(docFolder,true)}

task("runScreenshotScript"){
    val workingDir = File("src/main")
    ProcessBuilder("python3","screenshot_script.py")
        .directory(workingDir)
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor(15, TimeUnit.SECONDS)

}



